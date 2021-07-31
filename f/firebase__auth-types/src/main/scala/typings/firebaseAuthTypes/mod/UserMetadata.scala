package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMetadata extends StObject {
  
  var creationTime: js.UndefOr[String] = js.undefined
  
  var lastSignInTime: js.UndefOr[String] = js.undefined
}
object UserMetadata {
  
  @scala.inline
  def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  
  @scala.inline
  implicit class UserMetadataMutableBuilder[Self <: UserMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastSignInTime(value: String): Self = StObject.set(x, "lastSignInTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSignInTimeUndefined: Self = StObject.set(x, "lastSignInTime", js.undefined)
  }
}
