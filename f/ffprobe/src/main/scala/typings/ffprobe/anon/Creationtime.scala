package typings.ffprobe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Creationtime extends js.Object {
  
  var creation_time: js.UndefOr[String] = js.native
  
  var handler_name: String = js.native
  
  var language: js.UndefOr[String] = js.native
}
object Creationtime {
  
  @scala.inline
  def apply(handler_name: String): Creationtime = {
    val __obj = js.Dynamic.literal(handler_name = handler_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creationtime]
  }
  
  @scala.inline
  implicit class CreationtimeOps[Self <: Creationtime] (val x: Self) extends AnyVal {
    
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
    def setHandler_name(value: String): Self = this.set("handler_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_time(value: String): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_time: Self = this.set("creation_time", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
