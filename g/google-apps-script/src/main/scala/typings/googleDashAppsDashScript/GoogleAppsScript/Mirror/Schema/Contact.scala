package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var acceptCommands: js.UndefOr[js.Array[Command]] = js.undefined
  var acceptTypes: js.UndefOr[js.Array[String]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageUrls: js.UndefOr[js.Array[String]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var sharingFeatures: js.UndefOr[js.Array[String]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var speakableName: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Contact {
  @scala.inline
  def apply(
    acceptCommands: js.Array[Command] = null,
    acceptTypes: js.Array[String] = null,
    displayName: String = null,
    id: String = null,
    imageUrls: js.Array[String] = null,
    kind: String = null,
    phoneNumber: String = null,
    priority: Int | Double = null,
    sharingFeatures: js.Array[String] = null,
    source: String = null,
    speakableName: String = null,
    `type`: String = null
  ): Contact = {
    val __obj = js.Dynamic.literal()
    if (acceptCommands != null) __obj.updateDynamic("acceptCommands")(acceptCommands.asInstanceOf[js.Any])
    if (acceptTypes != null) __obj.updateDynamic("acceptTypes")(acceptTypes.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageUrls != null) __obj.updateDynamic("imageUrls")(imageUrls.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sharingFeatures != null) __obj.updateDynamic("sharingFeatures")(sharingFeatures.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (speakableName != null) __obj.updateDynamic("speakableName")(speakableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

