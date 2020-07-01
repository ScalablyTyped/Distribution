package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.Alt
import typings.gapiClientDrive.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsResource extends js.Object {
  def stop(request: Alt, body: Channel): Request[Unit] = js.native
  /** Stop watching resources through this channel */
  def stop(request: Key): Request[Unit] = js.native
}

