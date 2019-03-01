package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConstraint extends js.Object {
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Constraint`.
    */
  var suggestedValue: js.UndefOr[java.lang.String] = js.undefined
}

object ListConstraint {
  @scala.inline
  def apply(suggestedValue: java.lang.String = null): ListConstraint = {
    val __obj = js.Dynamic.literal()
    if (suggestedValue != null) __obj.updateDynamic("suggestedValue")(suggestedValue)
    __obj.asInstanceOf[ListConstraint]
  }
}

