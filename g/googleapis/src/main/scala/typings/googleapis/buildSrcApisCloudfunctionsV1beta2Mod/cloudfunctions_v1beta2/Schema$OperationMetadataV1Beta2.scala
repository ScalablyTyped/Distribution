package typings.googleapis.buildSrcApisCloudfunctionsV1beta2Mod.cloudfunctions_v1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing an Operation
  */
@js.native
trait Schema$OperationMetadataV1Beta2 extends js.Object {
  /**
    * The original request that started the operation.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Type of operation.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The last update timestamp of the operation.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Version id of the function created or updated by an API call. This field
    * is only populated for Create and Update operations.
    */
  var versionId: js.UndefOr[String] = js.native
}

object Schema$OperationMetadataV1Beta2 {
  @scala.inline
  def apply(
    request: StringDictionary[js.Any] = null,
    target: String = null,
    `type`: String = null,
    updateTime: String = null,
    versionId: String = null
  ): Schema$OperationMetadataV1Beta2 = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationMetadataV1Beta2]
  }
}

