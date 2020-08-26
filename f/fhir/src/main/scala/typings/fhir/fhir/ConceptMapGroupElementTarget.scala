package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concept in target system for element
  */
@js.native
trait ConceptMapGroupElementTarget extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'equivalence'.
    */
  var _equivalence: js.UndefOr[Element] = js.native
  /**
    * Code that identifies the target element
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.native
  /**
    * Description of status/issues in mapping
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Other elements required for this mapping (from context)
    */
  var dependsOn: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.native
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.native
  /**
    * relatedto | equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
    */
  var equivalence: js.UndefOr[code] = js.native
  /**
    * Other concepts that this mapping also produces
    */
  var product: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.native
}

object ConceptMapGroupElementTarget {
  @scala.inline
  def apply(): ConceptMapGroupElementTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptMapGroupElementTarget]
  }
  @scala.inline
  implicit class ConceptMapGroupElementTargetOps[Self <: ConceptMapGroupElementTarget] (val x: Self) extends AnyVal {
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
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    @scala.inline
    def set_equivalence(value: Element): Self = this.set("_equivalence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_equivalence: Self = this.set("_equivalence", js.undefined)
    @scala.inline
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDependsOnVarargs(value: ConceptMapGroupElementTargetDependsOn*): Self = this.set("dependsOn", js.Array(value :_*))
    @scala.inline
    def setDependsOn(value: js.Array[ConceptMapGroupElementTargetDependsOn]): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setEquivalence(value: code): Self = this.set("equivalence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEquivalence: Self = this.set("equivalence", js.undefined)
    @scala.inline
    def setProductVarargs(value: ConceptMapGroupElementTargetDependsOn*): Self = this.set("product", js.Array(value :_*))
    @scala.inline
    def setProduct(value: js.Array[ConceptMapGroupElementTargetDependsOn]): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
  
}

