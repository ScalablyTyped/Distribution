package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsTfliteUri extends StObject {
  
  var gcsTfliteUri: String
}
object GcsTfliteUri {
  
  inline def apply(gcsTfliteUri: String): GcsTfliteUri = {
    val __obj = js.Dynamic.literal(gcsTfliteUri = gcsTfliteUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcsTfliteUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GcsTfliteUri] (val x: Self) extends AnyVal {
    
    inline def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
  }
}
