package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageConfigurationsResource extends js.Object {
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(request: gapiDotClientDotGamesconfigurationLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ImageConfiguration]
}

object ImageConfigurationsResource {
  @scala.inline
  def apply(
    upload: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ImageConfiguration]
    ]
  ): ImageConfigurationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[ImageConfigurationsResource]
  }
}

