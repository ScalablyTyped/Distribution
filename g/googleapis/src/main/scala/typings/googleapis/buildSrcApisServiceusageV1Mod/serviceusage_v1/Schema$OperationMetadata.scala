package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The operation metadata returned for the batchend services operation.
  */
@js.native
trait Schema$OperationMetadata extends js.Object {
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$OperationMetadata {
  @scala.inline
  def apply(resourceNames: js.Array[String] = null): Schema$OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationMetadata]
  }
}

