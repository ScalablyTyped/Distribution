package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltAnnotationId
import typings.gapiClientBooks.AnonAltContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: AnonAltAnnotationId): Request_[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: AnonAltContentVersion): Request_[Volumeannotations]
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(
    get: AnonAltAnnotationId => Request_[Volumeannotation],
    list: AnonAltContentVersion => Request_[Volumeannotations]
  ): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
}

