package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiasettingsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * The the list of accessible GMB accounts.
    */
  var gmbAccounts: js.UndefOr[Schema$GmbAccounts] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The retrieved or updated Lia settings.
    */
  var liaSettings: js.UndefOr[Schema$LiaSettings] = js.native
  /**
    * The list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[Schema$PosDataProviders]] = js.native
}

object Schema$LiasettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Schema$Errors = null,
    gmbAccounts: Schema$GmbAccounts = null,
    kind: String = null,
    liaSettings: Schema$LiaSettings = null,
    posDataProviders: js.Array[Schema$PosDataProviders] = null
  ): Schema$LiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (liaSettings != null) __obj.updateDynamic("liaSettings")(liaSettings.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiasettingsCustomBatchResponseEntry]
  }
}

