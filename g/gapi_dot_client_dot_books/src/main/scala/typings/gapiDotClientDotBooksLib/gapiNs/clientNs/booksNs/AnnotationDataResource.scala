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
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AllowWebDefinitions, 
      gapiDotClientLib.gapiNs.clientNs.Request[Annotationdata]
    ],
    list: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltAnnotationDataId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Annotationsdata]
    ]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[AnnotationDataResource]
  }
}

