package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationship to another action
  */
trait PlanDefinitionActionRelatedAction extends BackboneElement {
  /**
    * Contains extended information for property 'actionId'.
    */
  var _actionId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'relationship'.
    */
  var _relationship: js.UndefOr[Element] = js.undefined
  /**
    * What action is this related to
    */
  var actionId: id
  /**
    * Time offset for the relationship
    */
  var offsetDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Time offset for the relationship
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  /**
    * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
    */
  var relationship: code
}

