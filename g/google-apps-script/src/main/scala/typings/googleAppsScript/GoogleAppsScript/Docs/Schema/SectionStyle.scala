package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionStyle extends js.Object {
  
  var columnProperties: js.UndefOr[js.Array[SectionColumnProperties]] = js.native
  
  var columnSeparatorStyle: js.UndefOr[String] = js.native
  
  var contentDirection: js.UndefOr[String] = js.native
}
object SectionStyle {
  
  @scala.inline
  def apply(): SectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionStyle]
  }
  
  @scala.inline
  implicit class SectionStyleOps[Self <: SectionStyle] (val x: Self) extends AnyVal {
    
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
    def setColumnPropertiesVarargs(value: SectionColumnProperties*): Self = this.set("columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setColumnProperties(value: js.Array[SectionColumnProperties]): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    
    @scala.inline
    def setColumnSeparatorStyle(value: String): Self = this.set("columnSeparatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSeparatorStyle: Self = this.set("columnSeparatorStyle", js.undefined)
    
    @scala.inline
    def setContentDirection(value: String): Self = this.set("contentDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDirection: Self = this.set("contentDirection", js.undefined)
  }
}
