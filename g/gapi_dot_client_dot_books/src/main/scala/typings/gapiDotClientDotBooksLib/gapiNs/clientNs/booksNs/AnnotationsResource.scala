package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: gapiDotClientDotBooksLib.Anon_AltAnnotationIdFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Inserts a new annotation. */
  def insert(request: gapiDotClientDotBooksLib.Anon_AltAnnotationIdCountry): gapiDotClientLib.gapiNs.clientNs.Request[Annotation]
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltContentVersionFieldsKeyLayerId): gapiDotClientLib.gapiNs.clientNs.Request[Annotations]
  /** Gets the summary of specified layers. */
  def summary(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLayerIds): gapiDotClientLib.gapiNs.clientNs.Request[AnnotationsSummary]
  /** Updates an existing annotation. */
  def update(request: gapiDotClientDotBooksLib.Anon_AltAnnotationIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Annotation]
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotBooksLib.Anon_AltAnnotationIdFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotBooksLib.Anon_AltAnnotationIdCountry => gapiDotClientLib.gapiNs.clientNs.Request[Annotation],
    list: gapiDotClientDotBooksLib.Anon_AltContentVersionFieldsKeyLayerId => gapiDotClientLib.gapiNs.clientNs.Request[Annotations],
    summary: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLayerIds => gapiDotClientLib.gapiNs.clientNs.Request[AnnotationsSummary],
    update: gapiDotClientDotBooksLib.Anon_AltAnnotationIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), summary = js.Any.fromFunction1(summary), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnnotationsResource]
  }
}

