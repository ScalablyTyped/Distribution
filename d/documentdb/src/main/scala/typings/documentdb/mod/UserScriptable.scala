package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserScriptable
  extends StObject
     with UniqueId {
  
  /** The user function. Must set one of body or serverscript */
  var body: js.UndefOr[UserFunction] = js.undefined
  
  /** The user function. Must set one of body or serverscript */
  var serverScript: js.UndefOr[UserFunction] = js.undefined
}
object UserScriptable {
  
  @scala.inline
  def apply(id: String): UserScriptable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptable]
  }
  
  @scala.inline
  implicit class UserScriptableMutableBuilder[Self <: UserScriptable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: UserFunction): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setServerScript(value: UserFunction): Self = StObject.set(x, "serverScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerScriptFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "serverScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerScriptUndefined: Self = StObject.set(x, "serverScript", js.undefined)
  }
}
