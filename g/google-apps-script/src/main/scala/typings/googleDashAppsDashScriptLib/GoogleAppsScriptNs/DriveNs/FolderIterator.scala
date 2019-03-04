package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderIterator extends js.Object {
  def getContinuationToken(): java.lang.String
  def hasNext(): scala.Boolean
  def next(): Folder
}

object FolderIterator {
  @scala.inline
  def apply(
    getContinuationToken: js.Function0[java.lang.String],
    hasNext: js.Function0[scala.Boolean],
    next: js.Function0[Folder]
  ): FolderIterator = {
    val __obj = js.Dynamic.literal(getContinuationToken = getContinuationToken, hasNext = hasNext, next = next)
  
    __obj.asInstanceOf[FolderIterator]
  }
}

