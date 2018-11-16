package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QuickPreviewResponse extends js.Object {
  /** Were there compiler errors or not. */
  var compilerError: js.UndefOr[scala.Boolean] = js.undefined
  /** The quick previewed container version. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  /** Whether quick previewing failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}

