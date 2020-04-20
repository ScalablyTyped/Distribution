package typings.googleAppsScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that allows scripts to iterate over a potentially large collection of folders. Folder
  * iterators can be acccessed from DriveApp, a File, or a Folder.
  *
  *     // Log the name of every folder in the user's Drive.
  *     var folders = DriveApp.getFolders();
  *     while (folders.hasNext()) {
  *       var folder = folders.next();
  *       Logger.log(folder.getName());
  *     }
  */
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

