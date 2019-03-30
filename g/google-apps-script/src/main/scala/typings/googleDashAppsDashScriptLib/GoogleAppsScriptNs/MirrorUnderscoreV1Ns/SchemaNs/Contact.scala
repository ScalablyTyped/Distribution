package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var acceptCommands: js.UndefOr[js.Array[Command]] = js.undefined
  var acceptTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var imageUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var sharingFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var speakableName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Contact {
  @scala.inline
  def apply(
    acceptCommands: js.Array[Command] = null,
    acceptTypes: js.Array[java.lang.String] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    imageUrls: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    sharingFeatures: js.Array[java.lang.String] = null,
    source: java.lang.String = null,
    speakableName: java.lang.String = null,
    `type`: java.lang.String = null
  ): Contact = {
    val __obj = js.Dynamic.literal()
    if (acceptCommands != null) __obj.updateDynamic("acceptCommands")(acceptCommands)
    if (acceptTypes != null) __obj.updateDynamic("acceptTypes")(acceptTypes)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageUrls != null) __obj.updateDynamic("imageUrls")(imageUrls)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sharingFeatures != null) __obj.updateDynamic("sharingFeatures")(sharingFeatures)
    if (source != null) __obj.updateDynamic("source")(source)
    if (speakableName != null) __obj.updateDynamic("speakableName")(speakableName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Contact]
  }
}

