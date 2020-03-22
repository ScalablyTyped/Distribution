package typings.gapiClientSlides.gapi.client.slides

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSlides.AnonAccesstoken
import typings.gapiClientSlides.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: AnonAccesstoken): Request_[Page]
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: AnonAlt): Request_[Thumbnail]
}

object PagesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[Page], getThumbnail: AnonAlt => Request_[Thumbnail]): PagesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getThumbnail = js.Any.fromFunction1(getThumbnail))
  
    __obj.asInstanceOf[PagesResource]
  }
}

