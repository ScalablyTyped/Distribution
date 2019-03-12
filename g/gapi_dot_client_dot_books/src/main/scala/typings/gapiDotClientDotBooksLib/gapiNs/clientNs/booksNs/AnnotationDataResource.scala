package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: gapiDotClientDotBooksLib.Anon_AllowWebDefinitions): gapiDotClientLib.gapiNs.clientNs.Request[Annotationdata]
  /** Gets the annotation data for a volume and layer. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltAnnotationDataId): gapiDotClientLib.gapiNs.clientNs.Request[Annotationsdata]
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotBooksLib.Anon_AllowWebDefinitions => gapiDotClientLib.gapiNs.clientNs.Request[Annotationdata],
    list: gapiDotClientDotBooksLib.Anon_AltAnnotationDataId => gapiDotClientLib.gapiNs.clientNs.Request[Annotationsdata]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AnnotationDataResource]
  }
}

