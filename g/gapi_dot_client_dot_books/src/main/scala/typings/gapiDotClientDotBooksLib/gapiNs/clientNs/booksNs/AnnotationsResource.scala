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

