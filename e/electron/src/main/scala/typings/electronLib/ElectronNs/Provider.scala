package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  /**
    * .
    */
  def spellCheck(
    words: js.Array[java.lang.String],
    callback: js.Function1[/* misspeltWords */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
}

object Provider {
  @scala.inline
  def apply(
    spellCheck: (js.Array[java.lang.String], js.Function1[/* misspeltWords */ js.Array[java.lang.String], scala.Unit]) => scala.Unit
  ): Provider = {
    val __obj = js.Dynamic.literal(spellCheck = js.Any.fromFunction2(spellCheck))
  
    __obj.asInstanceOf[Provider]
  }
}

