package typings.gapiDotClientDotGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGamesconfiguration.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageConfigurationsResource extends js.Object {
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(request: Anon_AltFields): Request[ImageConfiguration]
}

object ImageConfigurationsResource {
  @scala.inline
  def apply(upload: Anon_AltFields => Request[ImageConfiguration]): ImageConfigurationsResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ImageConfigurationsResource]
  }
}

