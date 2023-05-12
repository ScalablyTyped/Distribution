package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionSourceMaterial
  extends StObject
     with BackboneElement {
  
  /**
    * The country or countries where the material is harvested.
    */
  var countryOfOrigin: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The genus of an organism, typically referring to the Latin epithet of the genus element of the plant/animal scientific name.
    */
  var genus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An anatomical origin of the source material within an organism.
    */
  var part: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The species of an organism, typically referring to the Latin epithet of the species of the plant/animal.
    */
  var species: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A classification that provides the origin of the raw material. Example: cat hair would be an Animal source type.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceDefinitionSourceMaterial {
  
  inline def apply(): SubstanceDefinitionSourceMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionSourceMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionSourceMaterial] (val x: Self) extends AnyVal {
    
    inline def setCountryOfOrigin(value: js.Array[CodeableConcept]): Self = StObject.set(x, "countryOfOrigin", value.asInstanceOf[js.Any])
    
    inline def setCountryOfOriginUndefined: Self = StObject.set(x, "countryOfOrigin", js.undefined)
    
    inline def setCountryOfOriginVarargs(value: CodeableConcept*): Self = StObject.set(x, "countryOfOrigin", js.Array(value*))
    
    inline def setGenus(value: CodeableConcept): Self = StObject.set(x, "genus", value.asInstanceOf[js.Any])
    
    inline def setGenusUndefined: Self = StObject.set(x, "genus", js.undefined)
    
    inline def setPart(value: CodeableConcept): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setSpecies(value: CodeableConcept): Self = StObject.set(x, "species", value.asInstanceOf[js.Any])
    
    inline def setSpeciesUndefined: Self = StObject.set(x, "species", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
