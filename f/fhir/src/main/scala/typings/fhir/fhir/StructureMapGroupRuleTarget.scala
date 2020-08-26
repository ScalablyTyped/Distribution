package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content to create because of this mapping rule
  */
@js.native
trait StructureMapGroupRuleTarget extends BackboneElement {
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'listRuleId'.
    */
  var _listRuleId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'transform'.
    */
  var _transform: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.native
  /**
    * Type or variable this rule applies to
    */
  var context: js.UndefOr[id] = js.native
  /**
    * type | variable
    */
  var contextType: js.UndefOr[code] = js.native
  /**
    * Field to create in the context
    */
  var element: js.UndefOr[String] = js.native
  /**
    * first | share | last | collate
    */
  var listMode: js.UndefOr[js.Array[code]] = js.native
  /**
    * Internal rule reference for shared list items
    */
  var listRuleId: js.UndefOr[id] = js.native
  /**
    * Parameters to the transform
    */
  var parameter: js.UndefOr[js.Array[StructureMapGroupRuleTargetParameter]] = js.native
  /**
    * create | copy +
    */
  var transform: js.UndefOr[code] = js.native
  /**
    * Named context for field, if desired, and a field is specified
    */
  var variable: js.UndefOr[id] = js.native
}

object StructureMapGroupRuleTarget {
  @scala.inline
  def apply(): StructureMapGroupRuleTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTarget]
  }
  @scala.inline
  implicit class StructureMapGroupRuleTargetOps[Self <: StructureMapGroupRuleTarget] (val x: Self) extends AnyVal {
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
    def set_context(value: Element): Self = this.set("_context", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_context: Self = this.set("_context", js.undefined)
    @scala.inline
    def set_contextType(value: Element): Self = this.set("_contextType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_contextType: Self = this.set("_contextType", js.undefined)
    @scala.inline
    def set_element(value: Element): Self = this.set("_element", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_element: Self = this.set("_element", js.undefined)
    @scala.inline
    def set_listModeVarargs(value: Element*): Self = this.set("_listMode", js.Array(value :_*))
    @scala.inline
    def set_listMode(value: js.Array[Element]): Self = this.set("_listMode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_listMode: Self = this.set("_listMode", js.undefined)
    @scala.inline
    def set_listRuleId(value: Element): Self = this.set("_listRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_listRuleId: Self = this.set("_listRuleId", js.undefined)
    @scala.inline
    def set_transform(value: Element): Self = this.set("_transform", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_transform: Self = this.set("_transform", js.undefined)
    @scala.inline
    def set_variable(value: Element): Self = this.set("_variable", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_variable: Self = this.set("_variable", js.undefined)
    @scala.inline
    def setContext(value: id): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContextType(value: code): Self = this.set("contextType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextType: Self = this.set("contextType", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setListModeVarargs(value: code*): Self = this.set("listMode", js.Array(value :_*))
    @scala.inline
    def setListMode(value: js.Array[code]): Self = this.set("listMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListMode: Self = this.set("listMode", js.undefined)
    @scala.inline
    def setListRuleId(value: id): Self = this.set("listRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListRuleId: Self = this.set("listRuleId", js.undefined)
    @scala.inline
    def setParameterVarargs(value: StructureMapGroupRuleTargetParameter*): Self = this.set("parameter", js.Array(value :_*))
    @scala.inline
    def setParameter(value: js.Array[StructureMapGroupRuleTargetParameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    @scala.inline
    def setTransform(value: code): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setVariable(value: id): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
  
}

