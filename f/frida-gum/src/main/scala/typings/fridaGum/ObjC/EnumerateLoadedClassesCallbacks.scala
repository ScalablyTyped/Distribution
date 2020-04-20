package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateLoadedClassesCallbacks extends js.Object {
  def onComplete(): Unit
  def onMatch(name: String, owner: String): Unit
}

object EnumerateLoadedClassesCallbacks {
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: (String, String) => Unit): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
}

