package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderEntities extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of tags inside the folder. */
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  /** The list of triggers inside the folder. */
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  /** The list of variables inside the folder. */
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
}

