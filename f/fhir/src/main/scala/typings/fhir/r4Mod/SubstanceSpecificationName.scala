package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSpecificationName
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _preferred: js.UndefOr[Element] = js.undefined
  
  /**
    * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.
    */
  var domain: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The jurisdiction where this name applies.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Language of the name.
    */
  var language: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The actual name.
    */
  var name: String
  
  /**
    * Details of the official nature of this name.
    */
  var official: js.UndefOr[js.Array[SubstanceSpecificationNameOfficial]] = js.undefined
  
  /**
    * If this is the preferred name for this substance.
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Supporting literature.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The status of the name.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A synonym of this name.
    */
  var synonym: js.UndefOr[js.Array[SubstanceSpecificationName]] = js.undefined
  
  /**
    * A translation for this name.
    */
  var translation: js.UndefOr[js.Array[SubstanceSpecificationName]] = js.undefined
  
  /**
    * Name type.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSpecificationName {
  
  inline def apply(name: String): SubstanceSpecificationName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstanceSpecificationName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSpecificationName] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: js.Array[CodeableConcept]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: CodeableConcept*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setLanguage(value: js.Array[CodeableConcept]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguageVarargs(value: CodeableConcept*): Self = StObject.set(x, "language", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOfficial(value: js.Array[SubstanceSpecificationNameOfficial]): Self = StObject.set(x, "official", value.asInstanceOf[js.Any])
    
    inline def setOfficialUndefined: Self = StObject.set(x, "official", js.undefined)
    
    inline def setOfficialVarargs(value: SubstanceSpecificationNameOfficial*): Self = StObject.set(x, "official", js.Array(value*))
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSynonym(value: js.Array[SubstanceSpecificationName]): Self = StObject.set(x, "synonym", value.asInstanceOf[js.Any])
    
    inline def setSynonymUndefined: Self = StObject.set(x, "synonym", js.undefined)
    
    inline def setSynonymVarargs(value: SubstanceSpecificationName*): Self = StObject.set(x, "synonym", js.Array(value*))
    
    inline def setTranslation(value: js.Array[SubstanceSpecificationName]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def setTranslationVarargs(value: SubstanceSpecificationName*): Self = StObject.set(x, "translation", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    inline def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
  }
}
