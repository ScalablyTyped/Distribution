package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of resources composed into a single coherent clinical statement with clinical attestation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Composition extends DomainResource {
  
  /**
    * Contains extended information for property 'confidentiality'.
    */
  var _confidentiality: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Attests to accuracy of composition
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.native
  
  /**
    * Who and/or what authored the composition
    */
  var author: js.Array[Reference] = js.native
  
  /**
    * Categorization of Composition
    */
  var `class`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * As defined by affinity domain
    */
  var confidentiality: js.UndefOr[code] = js.native
  
  /**
    * Organization which maintains the composition
    */
  var custodian: js.UndefOr[Reference] = js.native
  
  /**
    * Composition editing time
    */
  var date: dateTime = js.native
  
  /**
    * Context of the Composition
    */
  var encounter: js.UndefOr[Reference] = js.native
  
  /**
    * The clinical service(s) being documented
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.native
  
  /**
    * Logical identifier of composition (version-independent)
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Relationships to other compositions/documents
    */
  var relatesTo: js.UndefOr[js.Array[CompositionRelatesTo]] = js.native
  
  /**
    * Composition is broken into sections
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.native
  
  /**
    * preliminary | final | amended | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Who and/or what the composition is about
    */
  var subject: Reference = js.native
  
  /**
    * Human Readable name/title
    */
  var title: String = js.native
  
  /**
    * Kind of composition (LOINC if possible)
    */
  var `type`: CodeableConcept = js.native
}
object Composition {
  
  @scala.inline
  def apply(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composition]
  }
  
  @scala.inline
  implicit class CompositionOps[Self <: Composition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = this.set("author", js.Array(value :_*))
    
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_confidentiality(value: Element): Self = this.set("_confidentiality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_confidentiality: Self = this.set("_confidentiality", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def setAttesterVarargs(value: CompositionAttester*): Self = this.set("attester", js.Array(value :_*))
    
    @scala.inline
    def setAttester(value: js.Array[CompositionAttester]): Self = this.set("attester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttester: Self = this.set("attester", js.undefined)
    
    @scala.inline
    def setClass(value: CodeableConcept): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setConfidentiality(value: code): Self = this.set("confidentiality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidentiality: Self = this.set("confidentiality", js.undefined)
    
    @scala.inline
    def setCustodian(value: Reference): Self = this.set("custodian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustodian: Self = this.set("custodian", js.undefined)
    
    @scala.inline
    def setEncounter(value: Reference): Self = this.set("encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: CompositionEvent*): Self = this.set("event", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: js.Array[CompositionEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setRelatesToVarargs(value: CompositionRelatesTo*): Self = this.set("relatesTo", js.Array(value :_*))
    
    @scala.inline
    def setRelatesTo(value: js.Array[CompositionRelatesTo]): Self = this.set("relatesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatesTo: Self = this.set("relatesTo", js.undefined)
    
    @scala.inline
    def setSectionVarargs(value: CompositionSection*): Self = this.set("section", js.Array(value :_*))
    
    @scala.inline
    def setSection(value: js.Array[CompositionSection]): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
}
