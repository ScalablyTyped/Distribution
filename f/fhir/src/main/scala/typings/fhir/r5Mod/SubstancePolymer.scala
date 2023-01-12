package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymer
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _modification: js.UndefOr[Element] = js.undefined
  
  /**
    * Overall type of the polymer.
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Descrtibes the copolymer sequence type (polymer connectivity).
    */
  var copolymerConnectivity: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Polymer geometry, e.g. linear, branched, cross-linked, network or dendritic.
    */
  var geometry: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A business idenfier for this polymer, but typically this is handled by a SubstanceDefinition identifier.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Todo - this is intended to connect to a repeating full modification structure, also used by Protein and Nucleic Acid . String is just a placeholder.
    */
  var modification: js.UndefOr[String] = js.undefined
  
  /**
    * Todo.
    */
  var monomerSet: js.UndefOr[js.Array[SubstancePolymerMonomerSet]] = js.undefined
  
  /**
    * Specifies and quantifies the repeated units and their configuration.
    */
  var repeat: js.UndefOr[js.Array[SubstancePolymerRepeat]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstancePolymer: typings.fhir.fhirStrings.SubstancePolymer
}
object SubstancePolymer {
  
  inline def apply(): SubstancePolymer = {
    val __obj = js.Dynamic.literal(resourceType = "SubstancePolymer")
    __obj.asInstanceOf[SubstancePolymer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymer] (val x: Self) extends AnyVal {
    
    inline def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setCopolymerConnectivity(value: js.Array[CodeableConcept]): Self = StObject.set(x, "copolymerConnectivity", value.asInstanceOf[js.Any])
    
    inline def setCopolymerConnectivityUndefined: Self = StObject.set(x, "copolymerConnectivity", js.undefined)
    
    inline def setCopolymerConnectivityVarargs(value: CodeableConcept*): Self = StObject.set(x, "copolymerConnectivity", js.Array(value*))
    
    inline def setGeometry(value: CodeableConcept): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setModification(value: String): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
    
    inline def setModificationUndefined: Self = StObject.set(x, "modification", js.undefined)
    
    inline def setMonomerSet(value: js.Array[SubstancePolymerMonomerSet]): Self = StObject.set(x, "monomerSet", value.asInstanceOf[js.Any])
    
    inline def setMonomerSetUndefined: Self = StObject.set(x, "monomerSet", js.undefined)
    
    inline def setMonomerSetVarargs(value: SubstancePolymerMonomerSet*): Self = StObject.set(x, "monomerSet", js.Array(value*))
    
    inline def setRepeat(value: js.Array[SubstancePolymerRepeat]): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setRepeatVarargs(value: SubstancePolymerRepeat*): Self = StObject.set(x, "repeat", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubstancePolymer): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_modification(value: Element): Self = StObject.set(x, "_modification", value.asInstanceOf[js.Any])
    
    inline def set_modificationUndefined: Self = StObject.set(x, "_modification", js.undefined)
  }
}
