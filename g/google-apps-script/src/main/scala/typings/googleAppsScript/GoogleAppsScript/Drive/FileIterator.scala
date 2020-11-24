package typings.googleAppsScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iterator that allows scripts to iterate over a potentially large collection of files. File
  * iterators can be acccessed from DriveApp or a Folder.
  *
  *     // Log the name of every file in the user's Drive.
  *     var files = DriveApp.getFiles();
  *     while (files.hasNext()) {
  *       var file = files.next();
  *       Logger.log(file.getName());
  *     }
  */
@js.native
trait FileIterator extends js.Object {
  
  /**
    * Gets a token that can be used to resume this iteration at a later time.
    * This method is useful if processing an iterator in one execution would
    * exceed the maximum execution time. Continuation tokens are generally valid for one week.
    */
  def getContinuationToken(): String = js.native
  
  /** Determines whether calling next() will return an item. */
  def hasNext(): Boolean = js.native
  
  /**
    * Gets the next item in the collection of files or folders.
    * Throws an exception if no items remain.
    */
  def next(): File = js.native
}
object FileIterator {
  
  @scala.inline
  def apply(getContinuationToken: () => String, hasNext: () => Boolean, next: () => File): FileIterator = {
    val __obj = js.Dynamic.literal(getContinuationToken = js.Any.fromFunction0(getContinuationToken), hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[FileIterator]
  }
  
  @scala.inline
  implicit class FileIteratorOps[Self <: FileIterator] (val x: Self) extends AnyVal {
    
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
    def setNext(value: () => File): Self = this.set("next", js.Any.fromFunction0(value))
  }
}
