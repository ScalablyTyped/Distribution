package typings.glaze.themeMod

import org.scalablytyped.runtime.StringDictionary
import typings.glaze.anon.BorderWidth
import typings.glaze.anon.propertyinkeyofCSSPropert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticTheme extends CommonTheme {
  
  var matchers: propertyinkeyofCSSPropert = js.native
  
  var scales: BorderWidth = js.native
}
object StaticTheme {
  
  @scala.inline
  def apply(
    aliases: StringDictionary[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any
    ],
    breakpoints: js.Array[Double],
    matchers: propertyinkeyofCSSPropert,
    scales: BorderWidth,
    shorthands: StringDictionary[
      js.Array[
        /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
      ]
    ]
  ): StaticTheme = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], matchers = matchers.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticTheme]
  }
  
  @scala.inline
  implicit class StaticThemeOps[Self <: StaticTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchers(value: propertyinkeyofCSSPropert): Self = this.set("matchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScales(value: BorderWidth): Self = this.set("scales", value.asInstanceOf[js.Any])
  }
}
