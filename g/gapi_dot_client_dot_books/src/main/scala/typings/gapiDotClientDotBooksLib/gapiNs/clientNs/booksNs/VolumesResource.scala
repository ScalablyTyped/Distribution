package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumesResource extends js.Object {
  var associated: AssociatedResource = js.native
  var mybooks: MybooksResource = js.native
  var recommended: RecommendedResource = js.native
  var useruploaded: UseruploadedResource = js.native
  /** Gets volume information for a single volume. */
  def get(request: gapiDotClientDotBooksLib.Anon_SourceProjection): gapiDotClientLib.gapiNs.clientNs.Request[Volume] = js.native
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(request: gapiDotClientDotBooksLib.Anon_SourceMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Volumes] = js.native
  /** Gets volume information for volumes on a bookshelf. */
  def list(request: gapiDotClientDotBooksLib.Anon_SourceProjectionMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Volumes] = js.native
  /** Performs a book search. */
  def list(request: gapiDotClientDotBooksLib.Anon_SourceProjectionMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Volumes] = js.native
}

