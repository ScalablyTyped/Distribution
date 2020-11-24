package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserScriptable extends UniqueId {
  
  /** The user function. Must set one of body or serverscript */
  var body: js.UndefOr[UserFunction] = js.native
  
  /** The user function. Must set one of body or serverscript */
  var serverScript: js.UndefOr[UserFunction] = js.native
}
object UserScriptable {
  
  @scala.inline
  def apply(id: String): UserScriptable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptable]
  }
  
  @scala.inline
  implicit class UserScriptableOps[Self <: UserScriptable] (val x: Self) extends AnyVal {
    
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
    def setBodyFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBody(value: UserFunction): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setServerScriptFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("serverScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerScript(value: UserFunction): Self = this.set("serverScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerScript: Self = this.set("serverScript", js.undefined)
  }
}
