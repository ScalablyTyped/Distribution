package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of
    * the `parent` specified in the containing `RunQueryRequest`.
    * When true, selects all descendant collections.
    */
  var allDescendants: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The collection ID.
    * When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[java.lang.String] = js.undefined
}

