package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateClassLoadersCallbacks extends js.Object {
  /**
    * Called when all class loaders have been enumerated.
    */
  def onComplete(): scala.Unit
  /**
    * Called with a `java.lang.ClassLoader` wrapper for each class loader
    * found in the VM.
    */
  def onMatch(loader: Wrapper): scala.Unit
}

object EnumerateClassLoadersCallbacks {
  @scala.inline
  def apply(onComplete: () => scala.Unit, onMatch: Wrapper => scala.Unit): EnumerateClassLoadersCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
  
    __obj.asInstanceOf[EnumerateClassLoadersCallbacks]
  }
}

