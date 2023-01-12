package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firebase
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var firebase: js.UndefOr[AppId] = js.undefined
}
object Firebase {
  
  inline def apply(): Firebase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Firebase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Firebase] (val x: Self) extends AnyVal {
    
    inline def setFirebase(value: AppId): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
    
    inline def setFirebaseUndefined: Self = StObject.set(x, "firebase", js.undefined)
  }
}
