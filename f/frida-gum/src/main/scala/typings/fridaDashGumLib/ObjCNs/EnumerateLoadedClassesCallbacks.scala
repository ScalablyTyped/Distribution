package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateLoadedClassesCallbacks extends js.Object {
  def onComplete(): scala.Unit
  def onMatch(name: java.lang.String, owner: java.lang.String): scala.Unit
}

object EnumerateLoadedClassesCallbacks {
  @scala.inline
  def apply(onComplete: () => scala.Unit, onMatch: (java.lang.String, java.lang.String) => scala.Unit): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
  
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
}

