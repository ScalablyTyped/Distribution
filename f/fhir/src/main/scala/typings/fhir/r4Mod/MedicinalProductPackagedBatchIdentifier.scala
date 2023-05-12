package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductPackagedBatchIdentifier
  extends StObject
     with BackboneElement {
  
  /**
    * A number appearing on the immediate packaging (and not the outer packaging).
    */
  var immediatePackaging: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A number appearing on the outer packaging of a specific batch.
    */
  var outerPackaging: Identifier
}
object MedicinalProductPackagedBatchIdentifier {
  
  inline def apply(outerPackaging: Identifier): MedicinalProductPackagedBatchIdentifier = {
    val __obj = js.Dynamic.literal(outerPackaging = outerPackaging.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductPackagedBatchIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductPackagedBatchIdentifier] (val x: Self) extends AnyVal {
    
    inline def setImmediatePackaging(value: Identifier): Self = StObject.set(x, "immediatePackaging", value.asInstanceOf[js.Any])
    
    inline def setImmediatePackagingUndefined: Self = StObject.set(x, "immediatePackaging", js.undefined)
    
    inline def setOuterPackaging(value: Identifier): Self = StObject.set(x, "outerPackaging", value.asInstanceOf[js.Any])
  }
}
