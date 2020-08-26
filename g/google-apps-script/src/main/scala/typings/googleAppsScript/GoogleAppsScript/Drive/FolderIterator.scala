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
@js.native
trait FolderIterator extends js.Object {
  def getContinuationToken(): String = js.native
  def hasNext(): Boolean = js.native
  def next(): Folder = js.native
}

object FolderIterator {
  @scala.inline
  def apply(getContinuationToken: () => String, hasNext: () => Boolean, next: () => Folder): FolderIterator = {
    val __obj = js.Dynamic.literal(getContinuationToken = js.Any.fromFunction0(getContinuationToken), hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[FolderIterator]
  }
  @scala.inline
  implicit class FolderIteratorOps[Self <: FolderIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetContinuationToken(value: () => String): Self = this.set("getContinuationToken", js.Any.fromFunction0(value))
    @scala.inline
    def setHasNext(value: () => Boolean): Self = this.set("hasNext", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: () => Folder): Self = this.set("next", js.Any.fromFunction0(value))
  }
  
}

