package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarksResource extends js.Object {
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Deletes a channel's watermark image. */
  def unset(request: gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object WatermarksResource {
  @scala.inline
  def apply(
    set: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    unset: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): WatermarksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("unset")(unset)
    __obj.asInstanceOf[WatermarksResource]
  }
}

