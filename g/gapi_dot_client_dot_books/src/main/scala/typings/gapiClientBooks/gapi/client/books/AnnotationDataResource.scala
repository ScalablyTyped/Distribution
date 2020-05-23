package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AllowWebDefinitions
import typings.gapiClientBooks.anon.AnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: AllowWebDefinitions): Request[Annotationdata]
  /** Gets the annotation data for a volume and layer. */
  def list(request: AnnotationDataId): Request[Annotationsdata]
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: AllowWebDefinitions => Request[Annotationdata],
    list: AnnotationDataId => Request[Annotationsdata]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnnotationDataResource]
  }
}

