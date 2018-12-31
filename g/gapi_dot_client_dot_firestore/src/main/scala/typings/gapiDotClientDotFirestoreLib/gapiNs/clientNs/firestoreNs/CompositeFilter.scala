package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeFilter extends js.Object {
  /**
    * The list of filters to combine.
    * Must contain at least one filter.
    */
  var filters: js.UndefOr[js.Array[Filter]] = js.undefined
  /** The operator for combining multiple filters. */
  var op: js.UndefOr[java.lang.String] = js.undefined
}

