package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same source and target systems
  */
@js.native
trait ConceptMapGroup extends BackboneElement {
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceVersion'.
    */
  var _sourceVersion: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'targetVersion'.
    */
  var _targetVersion: js.UndefOr[Element] = js.native
  /**
    * Mappings for a concept from the source set
    */
  var element: js.Array[ConceptMapGroupElement] = js.native
  /**
    * Code System (if value set crosses code systems)
    */
  var source: js.UndefOr[uri] = js.native
  /**
    * Specific version of the  code system
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * System of the target (if necessary)
    */
  var target: js.UndefOr[uri] = js.native
  /**
    * Specific version of the  code system
    */
  var targetVersion: js.UndefOr[String] = js.native
  /**
    * When no match in the mappings
    */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.native
}

object ConceptMapGroup {
  @scala.inline
  def apply(element: js.Array[ConceptMapGroupElement]): ConceptMapGroup = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroup]
  }
  @scala.inline
  implicit class ConceptMapGroupOps[Self <: ConceptMapGroup] (val x: Self) extends AnyVal {
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
    def setElementVarargs(value: ConceptMapGroupElement*): Self = this.set("element", js.Array(value :_*))
    @scala.inline
    def setElement(value: js.Array[ConceptMapGroupElement]): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def set_source(value: Element): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_sourceVersion(value: Element): Self = this.set("_sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceVersion: Self = this.set("_sourceVersion", js.undefined)
    @scala.inline
    def set_target(value: Element): Self = this.set("_target", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_target: Self = this.set("_target", js.undefined)
    @scala.inline
    def set_targetVersion(value: Element): Self = this.set("_targetVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_targetVersion: Self = this.set("_targetVersion", js.undefined)
    @scala.inline
    def setSource(value: uri): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceVersion(value: String): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceVersion: Self = this.set("sourceVersion", js.undefined)
    @scala.inline
    def setTarget(value: uri): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetVersion(value: String): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVersion: Self = this.set("targetVersion", js.undefined)
    @scala.inline
    def setUnmapped(value: ConceptMapGroupUnmapped): Self = this.set("unmapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmapped: Self = this.set("unmapped", js.undefined)
  }
  
}

