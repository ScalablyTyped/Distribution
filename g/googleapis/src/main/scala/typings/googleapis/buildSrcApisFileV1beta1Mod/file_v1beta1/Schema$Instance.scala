package typings.googleapis.buildSrcApisFileV1beta1Mod.file_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Filestore instance.
  */
@js.native
trait Schema$Instance extends js.Object {
  /**
    * Output only. The time when the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional. A description of the instance (2048 characters or less).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Server-specified ETag for the instance resource to prevent simultaneous
    * updates from overwriting each other.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * File system shares on the instance. For this version, only a single file
    * share is supported.
    */
  var fileShares: js.UndefOr[js.Array[Schema$FileShareConfig]] = js.native
  /**
    * Resource labels to represent user provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The resource name of the instance, in the format
    * projects/{project_id}/locations/{location_id}/instances/{instance_id}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * VPC networks to which the instance is connected. For this version, only a
    * single network is supported.
    */
  var networks: js.UndefOr[js.Array[Schema$NetworkConfig]] = js.native
  /**
    * Output only. The instance state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Additional information about the instance state, if
    * available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The service tier of the instance.
    */
  var tier: js.UndefOr[String] = js.native
}

object Schema$Instance {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    etag: String = null,
    fileShares: js.Array[Schema$FileShareConfig] = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    networks: js.Array[Schema$NetworkConfig] = null,
    state: String = null,
    statusMessage: String = null,
    tier: String = null
  ): Schema$Instance = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fileShares != null) __obj.updateDynamic("fileShares")(fileShares.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Instance]
  }
}

