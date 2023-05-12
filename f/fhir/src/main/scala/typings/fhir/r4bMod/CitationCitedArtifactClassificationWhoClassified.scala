package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactClassificationWhoClassified
  extends StObject
     with BackboneElement {
  
  var _classifierCopyright: js.UndefOr[Element] = js.undefined
  
  var _freeToShare: js.UndefOr[Element] = js.undefined
  
  /**
    * Rights management statement for the classification.
    */
  var classifierCopyright: js.UndefOr[String] = js.undefined
  
  /**
    * Acceptable to re-use the classification.
    */
  var freeToShare: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Organization who created the classification.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Person who created the classification.
    */
  var person: js.UndefOr[Reference] = js.undefined
  
  /**
    * The publisher of the classification, not the publisher of the article or artifact being cited.
    */
  var publisher: js.UndefOr[Reference] = js.undefined
}
object CitationCitedArtifactClassificationWhoClassified {
  
  inline def apply(): CitationCitedArtifactClassificationWhoClassified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactClassificationWhoClassified]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactClassificationWhoClassified] (val x: Self) extends AnyVal {
    
    inline def setClassifierCopyright(value: String): Self = StObject.set(x, "classifierCopyright", value.asInstanceOf[js.Any])
    
    inline def setClassifierCopyrightUndefined: Self = StObject.set(x, "classifierCopyright", js.undefined)
    
    inline def setFreeToShare(value: Boolean): Self = StObject.set(x, "freeToShare", value.asInstanceOf[js.Any])
    
    inline def setFreeToShareUndefined: Self = StObject.set(x, "freeToShare", js.undefined)
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPerson(value: Reference): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    inline def setPublisher(value: Reference): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def set_classifierCopyright(value: Element): Self = StObject.set(x, "_classifierCopyright", value.asInstanceOf[js.Any])
    
    inline def set_classifierCopyrightUndefined: Self = StObject.set(x, "_classifierCopyright", js.undefined)
    
    inline def set_freeToShare(value: Element): Self = StObject.set(x, "_freeToShare", value.asInstanceOf[js.Any])
    
    inline def set_freeToShareUndefined: Self = StObject.set(x, "_freeToShare", js.undefined)
  }
}
