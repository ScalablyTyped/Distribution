package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAllowWebDefinitions
import typings.gapiClientBooks.AnonAnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: AnonAllowWebDefinitions): Request_[Annotationdata]
  /** Gets the annotation data for a volume and layer. */
  def list(request: AnonAnnotationDataId): Request_[Annotationsdata]
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: AnonAllowWebDefinitions => Request_[Annotationdata],
    list: AnonAnnotationDataId => Request_[Annotationsdata]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AnnotationDataResource]
  }
}

