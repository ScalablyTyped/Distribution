package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange extends StObject {
  
  var max: js.UndefOr[Double | Null] = js.undefined
  
  var min: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange {
  
  inline def apply(): SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange]
  }
  
  extension [Self <: SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
