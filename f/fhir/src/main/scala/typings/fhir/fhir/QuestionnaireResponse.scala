package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structured set of questions and their answers
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait QuestionnaireResponse extends DomainResource {
  
  /**
    * Contains extended information for property 'authored'.
    */
  var _authored: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Person who received and recorded the answers
    */
  var author: js.UndefOr[Reference] = js.native
  
  /**
    * Date the answers were gathered
    */
  var authored: js.UndefOr[dateTime] = js.native
  
  /**
    * Request fulfilled by this QuestionnaireResponse
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Encounter or Episode during which questionnaire was completed
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Unique id for this set of answers
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.native
  
  /**
    * Part of this action
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Form being answered
    */
  var questionnaire: js.UndefOr[Reference] = js.native
  
  /**
    * The person who answered the questions
    */
  var source: js.UndefOr[Reference] = js.native
  
  /**
    * in-progress | completed | amended | entered-in-error | stopped
    */
  var status: code = js.native
  
  /**
    * The subject of the questions
    */
  var subject: js.UndefOr[Reference] = js.native
}
object QuestionnaireResponse {
  
  @scala.inline
  def apply(status: code): QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponse]
  }
  
  @scala.inline
  implicit class QuestionnaireResponseOps[Self <: QuestionnaireResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authored(value: Element): Self = this.set("_authored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_authored: Self = this.set("_authored", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAuthor(value: Reference): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setAuthored(value: dateTime): Self = this.set("authored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthored: Self = this.set("authored", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: QuestionnaireResponseItem*): Self = this.set("item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[QuestionnaireResponseItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: Reference*): Self = this.set("parent", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: js.Array[Reference]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setQuestionnaire(value: Reference): Self = this.set("questionnaire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuestionnaire: Self = this.set("questionnaire", js.undefined)
    
    @scala.inline
    def setSource(value: Reference): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
