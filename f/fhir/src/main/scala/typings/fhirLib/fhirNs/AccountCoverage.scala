package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
  */
trait AccountCoverage extends BackboneElement {
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
    * The party(s) that are responsible for covering the payment of this account
    */
  var coverage: Reference
  /**
    * The priority of the coverage in the context of this account
    */
  var priority: js.UndefOr[positiveInt] = js.undefined
}

object AccountCoverage {
  @scala.inline
  def apply(
    coverage: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _priority: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    priority: js.UndefOr[positiveInt] = js.undefined
  ): AccountCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_priority != null) __obj.updateDynamic("_priority")(_priority)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[AccountCoverage]
  }
}

