package typings.googleCloudStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OWNERROLE extends js.Object {
  
  var OWNER_ROLE: String = js.native
  
  var READER_ROLE: String = js.native
  
  var WRITER_ROLE: String = js.native
}
object OWNERROLE {
  
  @scala.inline
  def apply(OWNER_ROLE: String, READER_ROLE: String, WRITER_ROLE: String): OWNERROLE = {
    val __obj = js.Dynamic.literal(OWNER_ROLE = OWNER_ROLE.asInstanceOf[js.Any], READER_ROLE = READER_ROLE.asInstanceOf[js.Any], WRITER_ROLE = WRITER_ROLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[OWNERROLE]
  }
  
  @scala.inline
  implicit class OWNERROLEOps[Self <: OWNERROLE] (val x: Self) extends AnyVal {
    
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
    def setOWNER_ROLE(value: String): Self = this.set("OWNER_ROLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREADER_ROLE(value: String): Self = this.set("READER_ROLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWRITER_ROLE(value: String): Self = this.set("WRITER_ROLE", value.asInstanceOf[js.Any])
  }
}
