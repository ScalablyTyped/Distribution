package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the status of the Deidentify operation.
  */
@js.native
trait Schema$DeidentifyErrorDetails extends js.Object {
  /**
    * Number of resources failed to process.
    */
  var failureResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores failed to process.
    */
  var failureStoreCount: js.UndefOr[String] = js.native
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}

object Schema$DeidentifyErrorDetails {
  @scala.inline
  def apply(
    failureResourceCount: String = null,
    failureStoreCount: String = null,
    successResourceCount: String = null,
    successStoreCount: String = null
  ): Schema$DeidentifyErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (failureResourceCount != null) __obj.updateDynamic("failureResourceCount")(failureResourceCount.asInstanceOf[js.Any])
    if (failureStoreCount != null) __obj.updateDynamic("failureStoreCount")(failureStoreCount.asInstanceOf[js.Any])
    if (successResourceCount != null) __obj.updateDynamic("successResourceCount")(successResourceCount.asInstanceOf[js.Any])
    if (successStoreCount != null) __obj.updateDynamic("successStoreCount")(successStoreCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeidentifyErrorDetails]
  }
}

