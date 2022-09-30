package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeBytes extends StObject {
  
  val automlModel: js.UndefOr[String] = js.undefined
  
  val gcsTfliteUri: js.UndefOr[String] = js.undefined
  
  val sizeBytes: Double
}
object SizeBytes {
  
  inline def apply(sizeBytes: Double): SizeBytes = {
    val __obj = js.Dynamic.literal(sizeBytes = sizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeBytes]
  }
  
  extension [Self <: SizeBytes](x: Self) {
    
    inline def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
    
    inline def setAutomlModelUndefined: Self = StObject.set(x, "automlModel", js.undefined)
    
    inline def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
    
    inline def setGcsTfliteUriUndefined: Self = StObject.set(x, "gcsTfliteUri", js.undefined)
    
    inline def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
  }
}
