package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An export
  */
@js.native
trait Schema$Export extends js.Object {
  /**
    * Output only. Export sink for cloud storage files.
    */
  var cloudStorageSink: js.UndefOr[Schema$CloudStorageSink] = js.native
  /**
    * Output only. The time when the export was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Advanced options of the export.
    */
  var exportOptions: js.UndefOr[Schema$ExportOptions] = js.native
  /**
    * Output only. The generated export ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The export name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The search query being exported.
    */
  var query: js.UndefOr[Schema$Query] = js.native
  /**
    * Output only. The requester of the export.
    */
  var requester: js.UndefOr[Schema$UserInfo] = js.native
  /**
    * Output only. Export statistics.
    */
  var stats: js.UndefOr[Schema$ExportStats] = js.native
  /**
    * Output only. The export status.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$Export {
  @scala.inline
  def apply(
    cloudStorageSink: Schema$CloudStorageSink = null,
    createTime: String = null,
    exportOptions: Schema$ExportOptions = null,
    id: String = null,
    matterId: String = null,
    name: String = null,
    query: Schema$Query = null,
    requester: Schema$UserInfo = null,
    stats: Schema$ExportStats = null,
    status: String = null
  ): Schema$Export = {
    val __obj = js.Dynamic.literal()
    if (cloudStorageSink != null) __obj.updateDynamic("cloudStorageSink")(cloudStorageSink.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (exportOptions != null) __obj.updateDynamic("exportOptions")(exportOptions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (matterId != null) __obj.updateDynamic("matterId")(matterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Export]
  }
}

