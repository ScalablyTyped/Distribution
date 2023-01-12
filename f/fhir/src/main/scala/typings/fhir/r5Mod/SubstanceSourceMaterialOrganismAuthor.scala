package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterialOrganismAuthor
  extends StObject
     with BackboneElement {
  
  var _authorDescription: js.UndefOr[Element] = js.undefined
  
  /**
    * The author of an organism species shall be specified. The author year of an organism shall also be specified when applicable; refers to the year in which the first author(s) published the infraspecific plant/animal name (of any rank).
    */
  var authorDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The type of author of an organism species shall be specified. The parenthetical author of an organism species refers to the first author who published the plant/animal name (of any rank). The primary author of an organism species refers to the first author(s), who validly published the plant/animal name.
    */
  var authorType: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSourceMaterialOrganismAuthor {
  
  inline def apply(): SubstanceSourceMaterialOrganismAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSourceMaterialOrganismAuthor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSourceMaterialOrganismAuthor] (val x: Self) extends AnyVal {
    
    inline def setAuthorDescription(value: String): Self = StObject.set(x, "authorDescription", value.asInstanceOf[js.Any])
    
    inline def setAuthorDescriptionUndefined: Self = StObject.set(x, "authorDescription", js.undefined)
    
    inline def setAuthorType(value: CodeableConcept): Self = StObject.set(x, "authorType", value.asInstanceOf[js.Any])
    
    inline def setAuthorTypeUndefined: Self = StObject.set(x, "authorType", js.undefined)
    
    inline def set_authorDescription(value: Element): Self = StObject.set(x, "_authorDescription", value.asInstanceOf[js.Any])
    
    inline def set_authorDescriptionUndefined: Self = StObject.set(x, "_authorDescription", js.undefined)
  }
}
