package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The operation metadata returned for the batchend services operation.
  */
@js.native
trait Schema$GoogleApiServiceusageV1OperationMetadata extends js.Object {
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleApiServiceusageV1OperationMetadata {
  @scala.inline
  def apply(resourceNames: js.Array[String] = null): Schema$GoogleApiServiceusageV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleApiServiceusageV1OperationMetadata]
  }
}

