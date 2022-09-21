package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationPackage
  extends StObject
     with BackboneElement {
  
  /**
    * The kind of container that this package comes as.
    */
  var container: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A set of components that go to make up the described item.
    */
  var content: js.UndefOr[js.Array[MedicationPackageContent]] = js.undefined
}
object MedicationPackage {
  
  inline def apply(): MedicationPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackage]
  }
  
  extension [Self <: MedicationPackage](x: Self) {
    
    inline def setContainer(value: CodeableConcept): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContent(value: js.Array[MedicationPackageContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: MedicationPackageContent*): Self = StObject.set(x, "content", js.Array(value*))
  }
}
