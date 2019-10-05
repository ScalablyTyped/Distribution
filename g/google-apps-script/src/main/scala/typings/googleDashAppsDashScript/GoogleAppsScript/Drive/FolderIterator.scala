package typings.googleDashAppsDashScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderIterator extends js.Object {
  def getContinuationToken(): String
  def hasNext(): Boolean
  def next(): Folder
}

object FolderIterator {
  @scala.inline
  def apply(getContinuationToken: () => String, hasNext: () => Boolean, next: () => Folder): FolderIterator = {
    val __obj = js.Dynamic.literal(getContinuationToken = js.Any.fromFunction0(getContinuationToken), hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[FolderIterator]
  }
}

