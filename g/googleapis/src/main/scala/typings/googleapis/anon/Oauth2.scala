package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oauth2 extends StObject {
  
  var oauth2: js.UndefOr[Scopes] = js.undefined
}
object Oauth2 {
  
  @scala.inline
  def apply(): Oauth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Oauth2]
  }
  
  @scala.inline
  implicit class Oauth2MutableBuilder[Self <: Oauth2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOauth2(value: Scopes): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
  }
}
