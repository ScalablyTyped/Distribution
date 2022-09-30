package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcloud extends StObject {
  
  /** Namespace location. */
  val location: Typeoflocation
}
object Typeofcloud {
  
  inline def apply(location: Typeoflocation): Typeofcloud = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcloud]
  }
  
  extension [Self <: Typeofcloud](x: Self) {
    
    inline def setLocation(value: Typeoflocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
