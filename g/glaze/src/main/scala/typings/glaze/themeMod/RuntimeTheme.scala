package typings.glaze.themeMod

import org.scalablytyped.runtime.StringDictionary
import typings.treat.typesMod.ThemeRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeTheme extends CommonTheme {
  
  var ref: ThemeRef = js.native
}
object RuntimeTheme {
  
  @scala.inline
  def apply(
    aliases: StringDictionary[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any
    ],
    breakpoints: js.Array[Double],
    ref: ThemeRef,
    shorthands: StringDictionary[
      js.Array[
        /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
      ]
    ]
  ): RuntimeTheme = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeTheme]
  }
  
  @scala.inline
  implicit class RuntimeThemeOps[Self <: RuntimeTheme] (val x: Self) extends AnyVal {
    
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
    def setRef(value: ThemeRef): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
}
