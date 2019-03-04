package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Add a new media item to an album. The current upload size limitations are 36MB for a photo and 1GB for a video. Uploads do not count against quota if
    * photos are less than 2048 pixels on their longest side or videos are less than 15 minutes in length.
    */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_AltCollectionFields): gapiDotClientLib.gapiNs.clientNs.Request[Media]
}

object MediaResource {
  @scala.inline
  def apply(
    insert: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCollectionFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Media]
    ]
  ): MediaResource = {
    val __obj = js.Dynamic.literal(insert = insert)
  
    __obj.asInstanceOf[MediaResource]
  }
}

