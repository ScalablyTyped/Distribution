package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** A composite filter. */
  var compositeFilter: js.UndefOr[CompositeFilter] = js.undefined
  /** A filter on a document field. */
  var fieldFilter: js.UndefOr[FieldFilter] = js.undefined
  /** A filter that takes exactly one argument. */
  var unaryFilter: js.UndefOr[UnaryFilter] = js.undefined
}

