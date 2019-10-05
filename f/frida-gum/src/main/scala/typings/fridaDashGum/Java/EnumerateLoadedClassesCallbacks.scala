package typings.fridaDashGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateLoadedClassesCallbacks extends js.Object {
  /**
    * Called when all loaded classes have been enumerated.
    */
  def onComplete(): Unit
  /**
    * Called with the name of each currently loaded class.
    *
    * Pass this to `Java.use()` to get a JavaScript wrapper.
    */
  def onMatch(className: String): Unit
}

object EnumerateLoadedClassesCallbacks {
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: String => Unit): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
  
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
}

