package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageConfig extends StObject {
  
  /**
    * The stable image that the remote agent will fallback to if the target image fails.
    */
  var stableImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial image the remote agent will attempt to run for the control plane.
    */
  var targetImage: js.UndefOr[String | Null] = js.undefined
}
object SchemaImageConfig {
  
  inline def apply(): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfig]
  }
  
  extension [Self <: SchemaImageConfig](x: Self) {
    
    inline def setStableImage(value: String): Self = StObject.set(x, "stableImage", value.asInstanceOf[js.Any])
    
    inline def setStableImageNull: Self = StObject.set(x, "stableImage", null)
    
    inline def setStableImageUndefined: Self = StObject.set(x, "stableImage", js.undefined)
    
    inline def setTargetImage(value: String): Self = StObject.set(x, "targetImage", value.asInstanceOf[js.Any])
    
    inline def setTargetImageNull: Self = StObject.set(x, "targetImage", null)
    
    inline def setTargetImageUndefined: Self = StObject.set(x, "targetImage", js.undefined)
  }
}
