package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMetadata2
  extends StObject
     with UserMetadata {
  
  def _copy(metadata: UserMetadata2): Unit
  
  /* private */ var _initializeTime: Any
  
  /* private */ var createdAt: Any
  
  /* private */ var lastLoginAt: Any
  
  def toJSON(): js.Object
}
object UserMetadata2 {
  
  inline def apply(
    _copy: UserMetadata2 => Unit,
    _initializeTime: Any,
    createdAt: Any,
    lastLoginAt: Any,
    toJSON: () => js.Object
  ): UserMetadata2 = {
    val __obj = js.Dynamic.literal(_copy = js.Any.fromFunction1(_copy), _initializeTime = _initializeTime.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastLoginAt = lastLoginAt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[UserMetadata2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserMetadata2] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: Any): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastLoginAt(value: Any): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def set_copy(value: UserMetadata2 => Unit): Self = StObject.set(x, "_copy", js.Any.fromFunction1(value))
    
    inline def set_initializeTime(value: Any): Self = StObject.set(x, "_initializeTime", value.asInstanceOf[js.Any])
  }
}
