package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selector associated with the SecuritySettings. If the labels and port in
  * this selector match the Envoy&#39;s label and port, the server side
  * authentication and authorization settings are applied to the Envoy.
  */
@js.native
trait Schema$ServerSecuritySettingsSelector extends js.Object {
  /**
    * The labels associated with the XDS client.
    */
  var labelMatches: js.UndefOr[js.Array[Schema$MetadataFilterLabelMatch]] = js.native
  /**
    * The listener port of the XDS client.
    */
  var port: js.UndefOr[Double] = js.native
}

object Schema$ServerSecuritySettingsSelector {
  @scala.inline
  def apply(labelMatches: js.Array[Schema$MetadataFilterLabelMatch] = null, port: Int | Double = null): Schema$ServerSecuritySettingsSelector = {
    val __obj = js.Dynamic.literal()
    if (labelMatches != null) __obj.updateDynamic("labelMatches")(labelMatches.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServerSecuritySettingsSelector]
  }
}

