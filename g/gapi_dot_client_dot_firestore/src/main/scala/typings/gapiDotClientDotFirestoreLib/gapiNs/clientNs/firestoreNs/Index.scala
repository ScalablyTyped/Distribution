package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** The collection ID to which this index applies. Required. */
  var collectionId: js.UndefOr[java.lang.String] = js.undefined
  /** The fields to index. */
  var fields: js.UndefOr[js.Array[IndexField]] = js.undefined
  /** The resource name of the index. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the index.
    * The state is read-only.
    * @OutputOnly
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

