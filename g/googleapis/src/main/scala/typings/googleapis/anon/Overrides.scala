package typings.googleapis.anon

import typings.googleapis.calendarV3Mod.calendarV3.SchemaEventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overrides extends js.Object {
  
  var overrides: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  
  var useDefault: js.UndefOr[Boolean] = js.native
}
object Overrides {
  
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesOps[Self <: Overrides] (val x: Self) extends AnyVal {
    
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
    def setOverridesVarargs(value: SchemaEventReminder*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: js.Array[SchemaEventReminder]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = this.set("useDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefault: Self = this.set("useDefault", js.undefined)
  }
}
