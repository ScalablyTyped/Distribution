package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch shipping settings response.
  */
@js.native
trait Schema$ShippingsettingsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The retrieved or updated account shipping settings.
    */
  var shippingSettings: js.UndefOr[Schema$ShippingSettings] = js.native
}

object Schema$ShippingsettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Schema$Errors = null,
    kind: String = null,
    shippingSettings: Schema$ShippingSettings = null
  ): Schema$ShippingsettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (shippingSettings != null) __obj.updateDynamic("shippingSettings")(shippingSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShippingsettingsCustomBatchResponseEntry]
  }
}

