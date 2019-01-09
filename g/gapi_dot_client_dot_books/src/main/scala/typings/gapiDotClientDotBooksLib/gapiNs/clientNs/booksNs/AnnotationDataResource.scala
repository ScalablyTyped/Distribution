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

