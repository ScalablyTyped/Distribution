package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var gmbAccounts: js.UndefOr[GmbAccounts] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var liaSettings: js.UndefOr[LiaSettings] = js.undefined
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.undefined
}

object LiasettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Errors = null,
    gmbAccounts: GmbAccounts = null,
    kind: String = null,
    liaSettings: LiaSettings = null,
    posDataProviders: js.Array[PosDataProviders] = null
  ): LiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (liaSettings != null) __obj.updateDynamic("liaSettings")(liaSettings)
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders)
    __obj.asInstanceOf[LiasettingsCustomBatchResponseEntry]
  }
}

