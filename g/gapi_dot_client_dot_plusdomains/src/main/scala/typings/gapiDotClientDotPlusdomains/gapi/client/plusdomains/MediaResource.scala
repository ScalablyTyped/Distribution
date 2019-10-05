package typings.gapiDotClientDotPlusdomains.gapi.client.plusdomains

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPlusdomains.Anon_AltCollectionFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Add a new media item to an album. The current upload size limitations are 36MB for a photo and 1GB for a video. Uploads do not count against quota if
    * photos are less than 2048 pixels on their longest side or videos are less than 15 minutes in length.
    */
  def insert(request: Anon_AltCollectionFields): Request[Media]
}

object MediaResource {
  @scala.inline
  def apply(insert: Anon_AltCollectionFields => Request[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[MediaResource]
  }
}

