package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskList extends js.Object {
  /** List of all requested tasks. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** Type of the resource. This is always "fusiontables#taskList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of tasks for the table. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

