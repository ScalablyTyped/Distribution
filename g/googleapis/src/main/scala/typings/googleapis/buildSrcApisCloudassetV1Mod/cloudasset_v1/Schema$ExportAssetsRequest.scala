package typings.googleapis.buildSrcApisCloudassetV1Mod.cloudasset_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export asset request.
  */
@js.native
trait Schema$ExportAssetsRequest extends js.Object {
  /**
    * A list of asset types of which to take a snapshot for. For example:
    * &quot;compute.googleapis.com/Disk&quot;. If specified, only matching
    * assets will be returned. See [Introduction to Cloud Asset
    * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
    * for all supported asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Asset content type. If not specified, no content but the asset name will
    * be returned.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Required. Output configuration indicating where the results will be
    * output to. All results will be in newline delimited JSON format.
    */
  var outputConfig: js.UndefOr[Schema$OutputConfig] = js.native
  /**
    * Timestamp to take an asset snapshot. This can only be set to a timestamp
    * between 2018-10-02 UTC (inclusive) and the current time. If not
    * specified, the current time will be used. Due to delays in resource data
    * collection and indexing, there is a volatile window during which running
    * the same query may get different results.
    */
  var readTime: js.UndefOr[String] = js.native
}

object Schema$ExportAssetsRequest {
  @scala.inline
  def apply(
    assetTypes: js.Array[String] = null,
    contentType: String = null,
    outputConfig: Schema$OutputConfig = null,
    readTime: String = null
  ): Schema$ExportAssetsRequest = {
    val __obj = js.Dynamic.literal()
    if (assetTypes != null) __obj.updateDynamic("assetTypes")(assetTypes.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExportAssetsRequest]
  }
}

