package typings.glaze.themeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonTheme extends js.Object {
  
  var aliases: StringDictionary[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any
  ] = js.native
  
  var breakpoints: js.Array[Double] = js.native
  
  var shorthands: StringDictionary[
    js.Array[
      /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
    ]
  ] = js.native
}
object CommonTheme {
  
  @scala.inline
  def apply(
    aliases: StringDictionary[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any
    ],
    breakpoints: js.Array[Double],
    shorthands: StringDictionary[
      js.Array[
        /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
      ]
    ]
  ): CommonTheme = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonTheme]
  }
  
  @scala.inline
  implicit class CommonThemeOps[Self <: CommonTheme] (val x: Self) extends AnyVal {
    
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
    def setAliases(
      value: StringDictionary[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any
        ]
    ): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsVarargs(value: Double*): Self = this.set("breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setBreakpoints(value: js.Array[Double]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthands(
      value: StringDictionary[
          js.Array[
            /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
          ]
        ]
    ): Self = this.set("shorthands", value.asInstanceOf[js.Any])
  }
}
