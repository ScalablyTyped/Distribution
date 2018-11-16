package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetWorkspaceStatusResponse extends js.Object {
  /** The merge conflict after sync. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
  /** Entities that have been changed in the workspace. */
  var workspaceChange: js.UndefOr[js.Array[Entity]] = js.undefined
}

