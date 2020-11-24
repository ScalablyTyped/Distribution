package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for all elements
  */
@js.native
trait Element extends js.Object {
  
  /**
    * Contains extended information for property 'fhir_comments'.
    */
  var _fhir_comments: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.native
  
  /**
    * Additional Content defined by implementations
    */
  var extension: js.UndefOr[js.Array[Extension]] = js.native
  
  /**
    * Content that would be comments in an XML.
    */
  var fhir_comments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * xml:id (or equivalent in JSON)
    */
  var id: js.UndefOr[String] = js.native
}
object Element {
  
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def set_fhir_commentsVarargs(value: Element*): Self = this.set("_fhir_comments", js.Array(value :_*))
    
    @scala.inline
    def set_fhir_comments(value: js.Array[Element]): Self = this.set("_fhir_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_fhir_comments: Self = this.set("_fhir_comments", js.undefined)
    
    @scala.inline
    def set_id(value: Element): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: Extension*): Self = this.set("extension", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[Extension]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFhir_commentsVarargs(value: String*): Self = this.set("fhir_comments", js.Array(value :_*))
    
    @scala.inline
    def setFhir_comments(value: js.Array[String]): Self = this.set("fhir_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFhir_comments: Self = this.set("fhir_comments", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
