package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to fetch stored inventory sources, campaigns, insertion orders,
  * line items, TrueView ad groups and ads.
  */
@js.native
trait Schema$DownloadRequest extends js.Object {
  /**
    * File types that will be returned.  Acceptable values are:   -
    * &quot;AD&quot;  - &quot;AD_GROUP&quot;  - &quot;CAMPAIGN&quot;  -
    * &quot;INSERTION_ORDER&quot;  - &quot;LINE_ITEM&quot;  -
    * &quot;INVENTORY_SOURCE&quot;
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The IDs of the specified filter type. This is used to filter entities to
    * fetch. At least one ID must be specified.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter type used to filter entities to fetch.
    */
  var filterType: js.UndefOr[String] = js.native
  /**
    * SDF Version (column names, types, order) in which the entities will be
    * returned. Default to 3.1.
    */
  var version: js.UndefOr[String] = js.native
}

object Schema$DownloadRequest {
  @scala.inline
  def apply(
    fileTypes: js.Array[String] = null,
    filterIds: js.Array[String] = null,
    filterType: String = null,
    version: String = null
  ): Schema$DownloadRequest = {
    val __obj = js.Dynamic.literal()
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes.asInstanceOf[js.Any])
    if (filterIds != null) __obj.updateDynamic("filterIds")(filterIds.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DownloadRequest]
  }
}

