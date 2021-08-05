package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about packaged medications
  */
trait MedicationPackage
  extends StObject
     with BackboneElement {
  
  /**
    * Identifies a single production run
    */
  var batch: js.UndefOr[js.Array[MedicationPackageBatch]] = js.undefined
  
  /**
    * E.g. box, vial, blister-pack
    */
  var container: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What is  in the package
    */
  var content: js.UndefOr[js.Array[MedicationPackageContent]] = js.undefined
}
object MedicationPackage {
  
  inline def apply(): MedicationPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackage]
  }
  
  extension [Self <: MedicationPackage](x: Self) {
    
    inline def setBatch(value: js.Array[MedicationPackageBatch]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setBatchVarargs(value: MedicationPackageBatch*): Self = StObject.set(x, "batch", js.Array(value :_*))
    
    inline def setContainer(value: CodeableConcept): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContent(value: js.Array[MedicationPackageContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: MedicationPackageContent*): Self = StObject.set(x, "content", js.Array(value :_*))
  }
}
