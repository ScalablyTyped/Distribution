package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RevertFolderResponse extends js.Object {
  /**
               * Folder as it appears in the latest container version since the last workspace synchronization operation. If no folder is present, that means the folder
               * was deleted in the latest container version.
               */
  var folder: js.UndefOr[Folder] = js.undefined
}

