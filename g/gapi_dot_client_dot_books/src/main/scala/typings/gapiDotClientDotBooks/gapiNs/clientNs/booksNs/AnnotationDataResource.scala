package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AllowWebDefinitions
import typings.gapiDotClientDotBooks.Anon_AltAnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: Anon_AllowWebDefinitions): Request[Annotationdata]
  /** Gets the annotation data for a volume and layer. */
  def list(request: Anon_AltAnnotationDataId): Request[Annotationsdata]
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: Anon_AllowWebDefinitions => Request[Annotationdata],
    list: Anon_AltAnnotationDataId => Request[Annotationsdata]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AnnotationDataResource]
  }
}

