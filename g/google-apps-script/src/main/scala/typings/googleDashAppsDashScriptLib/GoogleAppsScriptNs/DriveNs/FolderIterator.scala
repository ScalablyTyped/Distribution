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
  def apply(getContinuationToken: () => java.lang.String, hasNext: () => scala.Boolean, next: () => Folder): FolderIterator = {
    val __obj = js.Dynamic.literal(getContinuationToken = js.Any.fromFunction0(getContinuationToken), hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[FolderIterator]
  }
}

