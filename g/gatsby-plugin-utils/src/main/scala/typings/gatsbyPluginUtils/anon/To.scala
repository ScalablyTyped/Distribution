package typings.gatsbyPluginUtils.anon

import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CustomHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait To extends js.Object {
  
  def from(value: js.Any): js.Any = js.native
  
  def to(value: js.Any, helpers: CustomHelpers[_]): js.Any = js.native
}
object To {
  
  @scala.inline
  def apply(from: js.Any => js.Any, to: (js.Any, CustomHelpers[_]) => js.Any): To = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit class ToOps[Self <: To] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: js.Any => js.Any): Self = this.set("from", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: (js.Any, CustomHelpers[_]) => js.Any): Self = this.set("to", js.Any.fromFunction2(value))
  }
}
