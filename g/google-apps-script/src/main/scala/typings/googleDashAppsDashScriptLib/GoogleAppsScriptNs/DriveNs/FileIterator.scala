package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIterator extends js.Object {
  /**
    * Gets a token that can be used to resume this iteration at a later time.
    * This method is useful if processing an iterator in one execution would
    * exceed the maximum execution time. Continuation tokens are generally valid for one week.
    */
  def getContinuationToken(): java.lang.String
  /** Determines whether calling next() will return an item. */
  def hasNext(): scala.Boolean
  /**
    * Gets the next item in the collection of files or folders.
    * Throws an exception if no items remain.
    */
  def next(): File
}

object FileIterator {
  @scala.inline
  def apply(
    getContinuationToken: js.Function0[java.lang.String],
    hasNext: js.Function0[scala.Boolean],
    next: js.Function0[File]
  ): FileIterator = {
    val __obj = js.Dynamic.literal(getContinuationToken = getContinuationToken, hasNext = hasNext, next = next)
  
    __obj.asInstanceOf[FileIterator]
  }
}

