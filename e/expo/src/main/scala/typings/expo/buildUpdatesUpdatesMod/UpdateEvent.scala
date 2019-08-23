package typings.expo.buildUpdatesUpdatesMod

import typings.expo.expoStrings.downloadFinished
import typings.expo.expoStrings.downloadProgress
import typings.expo.expoStrings.downloadStart
import typings.expo.expoStrings.error
import typings.expo.expoStrings.noUpdateAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvent extends js.Object {
  var manifest: js.UndefOr[Manifest] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[downloadFinished | downloadProgress | downloadStart | error | noUpdateAvailable] = js.undefined
}

object UpdateEvent {
  @scala.inline
  def apply(
    manifest: Manifest = null,
    message: String = null,
    `type`: downloadStart | downloadProgress | noUpdateAvailable = null
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal()
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
}

