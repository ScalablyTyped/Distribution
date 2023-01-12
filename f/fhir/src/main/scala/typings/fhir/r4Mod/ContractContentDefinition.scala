package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.disputed
import typings.fhir.fhirStrings.executable
import typings.fhir.fhirStrings.executed
import typings.fhir.fhirStrings.negotiable
import typings.fhir.fhirStrings.offered
import typings.fhir.fhirStrings.policy
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.renewed
import typings.fhir.fhirStrings.resolved
import typings.fhir.fhirStrings.revoked
import typings.fhir.fhirStrings.terminated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractContentDefinition
  extends StObject
     with BackboneElement {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _publicationDate: js.UndefOr[Element] = js.undefined
  
  var _publicationStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * A copyright statement relating to Contract precursor content. Copyright statements are generally legal restrictions on the use and publishing of the Contract precursor content.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The date (and optionally time) when the contract was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the contract changes.
    */
  var publicationDate: js.UndefOr[String] = js.undefined
  
  /**
    * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated.
    */
  var publicationStatus: amended | appended | cancelled | disputed | `entered-in-error` | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
  
  /**
    * The  individual or organization that published the Contract precursor content.
    */
  var publisher: js.UndefOr[Reference] = js.undefined
  
  /**
    * Detailed Precusory content type.
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Precusory content structure and use, i.e., a boilerplate, template, application for a contract such as an insurance policy or benefits under a program, e.g., workers compensation.
    */
  var `type`: CodeableConcept
}
object ContractContentDefinition {
  
  inline def apply(
    publicationStatus: amended | appended | cancelled | disputed | `entered-in-error` | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated,
    `type`: CodeableConcept
  ): ContractContentDefinition = {
    val __obj = js.Dynamic.literal(publicationStatus = publicationStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractContentDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractContentDefinition] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setPublicationDate(value: String): Self = StObject.set(x, "publicationDate", value.asInstanceOf[js.Any])
    
    inline def setPublicationDateUndefined: Self = StObject.set(x, "publicationDate", js.undefined)
    
    inline def setPublicationStatus(
      value: amended | appended | cancelled | disputed | `entered-in-error` | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    ): Self = StObject.set(x, "publicationStatus", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: Reference): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_publicationDate(value: Element): Self = StObject.set(x, "_publicationDate", value.asInstanceOf[js.Any])
    
    inline def set_publicationDateUndefined: Self = StObject.set(x, "_publicationDate", js.undefined)
    
    inline def set_publicationStatus(value: Element): Self = StObject.set(x, "_publicationStatus", value.asInstanceOf[js.Any])
    
    inline def set_publicationStatusUndefined: Self = StObject.set(x, "_publicationStatus", js.undefined)
  }
}
