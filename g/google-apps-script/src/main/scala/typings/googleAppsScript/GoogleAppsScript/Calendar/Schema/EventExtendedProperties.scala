package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventExtendedProperties extends js.Object {
  
  var `private`: js.UndefOr[Record[String, String]] = js.native
  
  var shared: js.UndefOr[Record[String, String]] = js.native
}
object EventExtendedProperties {
  
  @scala.inline
  def apply(): EventExtendedProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventExtendedProperties]
  }
  
  @scala.inline
  implicit class EventExtendedPropertiesOps[Self <: EventExtendedProperties] (val x: Self) extends AnyVal {
    
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
    def setPrivate(value: Record[String, String]): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setShared(value: Record[String, String]): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
  }
}
