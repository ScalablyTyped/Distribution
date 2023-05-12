package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GtagURL extends StObject {
  
  var gtagURL: String
}
object GtagURL {
  
  inline def apply(gtagURL: String): GtagURL = {
    val __obj = js.Dynamic.literal(gtagURL = gtagURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GtagURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GtagURL] (val x: Self) extends AnyVal {
    
    inline def setGtagURL(value: String): Self = StObject.set(x, "gtagURL", value.asInstanceOf[js.Any])
  }
}
