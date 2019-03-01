package typings
package gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs.cloudfunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadataV1Beta2 extends js.Object {
  /** The original request that started the operation. */
  var request: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** Type of operation. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version id of the function created or updated by an API call.
    * This field is only pupulated for Create and Update operations.
    */
  var versionId: js.UndefOr[java.lang.String] = js.undefined
}

object OperationMetadataV1Beta2 {
  @scala.inline
  def apply(
    request: stdLib.Record[java.lang.String, _] = null,
    target: java.lang.String = null,
    `type`: java.lang.String = null,
    versionId: java.lang.String = null
  ): OperationMetadataV1Beta2 = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[OperationMetadataV1Beta2]
  }
}

