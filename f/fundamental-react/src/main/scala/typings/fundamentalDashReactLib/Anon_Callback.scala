package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var text: java.lang.String
  def callback(): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => scala.Unit, text: java.lang.String): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), text = text)
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

