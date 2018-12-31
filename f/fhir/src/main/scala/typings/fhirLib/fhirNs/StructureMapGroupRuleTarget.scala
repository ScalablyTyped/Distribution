package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content to create because of this mapping rule
  */
trait StructureMapGroupRuleTarget extends BackboneElement {
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'listRuleId'.
    */
  var _listRuleId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'transform'.
    */
  var _transform: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.undefined
  /**
    * Type or variable this rule applies to
    */
  var context: js.UndefOr[id] = js.undefined
  /**
    * type | variable
    */
  var contextType: js.UndefOr[code] = js.undefined
  /**
    * Field to create in the context
    */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
    * first | share | last | collate
    */
  var listMode: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * Internal rule reference for shared list items
    */
  var listRuleId: js.UndefOr[id] = js.undefined
  /**
    * Parameters to the transform
    */
  var parameter: js.UndefOr[js.Array[StructureMapGroupRuleTargetParameter]] = js.undefined
  /**
    * create | copy +
    */
  var transform: js.UndefOr[code] = js.undefined
  /**
    * Named context for field, if desired, and a field is specified
    */
  var variable: js.UndefOr[id] = js.undefined
}

