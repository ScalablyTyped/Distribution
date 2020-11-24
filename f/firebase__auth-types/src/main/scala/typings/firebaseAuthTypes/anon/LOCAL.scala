package typings.firebaseAuthTypes.anon

import typings.firebaseAuthTypes.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LOCAL extends js.Object {
  
  var LOCAL: Persistence = js.native
  
  var NONE: Persistence = js.native
  
  var SESSION: Persistence = js.native
}
object LOCAL {
  
  @scala.inline
  def apply(LOCAL: Persistence, NONE: Persistence, SESSION: Persistence): LOCAL = {
    val __obj = js.Dynamic.literal(LOCAL = LOCAL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[LOCAL]
  }
  
  @scala.inline
  implicit class LOCALOps[Self <: LOCAL] (val x: Self) extends AnyVal {
    
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
    def setLOCAL(value: Persistence): Self = this.set("LOCAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Persistence): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSESSION(value: Persistence): Self = this.set("SESSION", value.asInstanceOf[js.Any])
  }
}
