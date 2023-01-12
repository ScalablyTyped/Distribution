package typings.firebaseAnalyticsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firebasescreen
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var firebase_screen: js.UndefOr[String] = js.undefined
  
  var firebase_screen_class: js.UndefOr[String] = js.undefined
}
object Firebasescreen {
  
  inline def apply(): Firebasescreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Firebasescreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Firebasescreen] (val x: Self) extends AnyVal {
    
    inline def setFirebase_screen(value: String): Self = StObject.set(x, "firebase_screen", value.asInstanceOf[js.Any])
    
    inline def setFirebase_screenUndefined: Self = StObject.set(x, "firebase_screen", js.undefined)
    
    inline def setFirebase_screen_class(value: String): Self = StObject.set(x, "firebase_screen_class", value.asInstanceOf[js.Any])
    
    inline def setFirebase_screen_classUndefined: Self = StObject.set(x, "firebase_screen_class", js.undefined)
  }
}
