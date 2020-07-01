package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selector associated with the SecuritySettings. If the labels and port in
  * this selector match the Envoy&#39;s label and port, the server side
  * authentication and authorization settings are applied to the Envoy.
  */
@js.native
trait SchemaServerSecuritySettingsSelector extends js.Object {
  /**
    * The labels associated with the XDS client.
    */
  var labelMatches: js.UndefOr[js.Array[SchemaMetadataFilterLabelMatch]] = js.native
  /**
    * The listener port of the XDS client.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaServerSecuritySettingsSelector {
  @scala.inline
  def apply(
    labelMatches: js.Array[SchemaMetadataFilterLabelMatch] = null,
    port: js.UndefOr[Double] = js.undefined
  ): SchemaServerSecuritySettingsSelector = {
    val __obj = js.Dynamic.literal()
    if (labelMatches != null) __obj.updateDynamic("labelMatches")(labelMatches.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServerSecuritySettingsSelector]
  }
}

