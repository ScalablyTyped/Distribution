package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDrive.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutResource extends js.Object {
  /** Gets information about the user, the user's Drive, and system capabilities. */
  def get(request: Anon_Alt): Request[About]
}

object AboutResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[About]): AboutResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AboutResource]
  }
}

