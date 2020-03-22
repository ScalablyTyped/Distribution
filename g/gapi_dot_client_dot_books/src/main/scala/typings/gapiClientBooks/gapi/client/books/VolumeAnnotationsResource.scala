package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAnnotationId
import typings.gapiClientBooks.AnonEndOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: AnonAnnotationId): Request_[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: AnonEndOffset): Request_[Volumeannotations]
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(
    get: AnonAnnotationId => Request_[Volumeannotation],
    list: AnonEndOffset => Request_[Volumeannotations]
  ): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
}

