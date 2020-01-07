package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a detailed summary of the Deidentify operation.
  */
@js.native
trait Schema$DeidentifySummary extends js.Object {
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}

object Schema$DeidentifySummary {
  @scala.inline
  def apply(successResourceCount: String = null, successStoreCount: String = null): Schema$DeidentifySummary = {
    val __obj = js.Dynamic.literal()
    if (successResourceCount != null) __obj.updateDynamic("successResourceCount")(successResourceCount.asInstanceOf[js.Any])
    if (successStoreCount != null) __obj.updateDynamic("successStoreCount")(successStoreCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeidentifySummary]
  }
}

