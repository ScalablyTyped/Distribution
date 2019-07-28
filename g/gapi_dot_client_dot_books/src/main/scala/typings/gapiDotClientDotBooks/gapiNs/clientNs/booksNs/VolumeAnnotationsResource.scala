package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltAnnotationId
import typings.gapiDotClientDotBooks.Anon_AltContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: Anon_AltAnnotationId): Request[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: Anon_AltContentVersion): Request[Volumeannotations]
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(
    get: Anon_AltAnnotationId => Request[Volumeannotation],
    list: Anon_AltContentVersion => Request[Volumeannotations]
  ): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
}

