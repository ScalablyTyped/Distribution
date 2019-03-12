package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  /**
    * Returns Boolean.
    */
  def spellCheck(text: java.lang.String): scala.Unit
}

object Provider {
  @scala.inline
  def apply(spellCheck: java.lang.String => scala.Unit): Provider = {
    val __obj = js.Dynamic.literal(spellCheck = js.Any.fromFunction1(spellCheck))
  
    __obj.asInstanceOf[Provider]
  }
}

