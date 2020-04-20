package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Add a new media item to an album. The current upload size limitations are 36MB for a photo and 1GB for a video. Uploads do not count against quota if
    * photos are less than 2048 pixels on their longest side or videos are less than 15 minutes in length.
    */
  def insert(request: AnonPrettyPrint): Request_[Media]
}

object MediaResource {
  @scala.inline
  def apply(insert: AnonPrettyPrint => Request_[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[MediaResource]
  }
}

