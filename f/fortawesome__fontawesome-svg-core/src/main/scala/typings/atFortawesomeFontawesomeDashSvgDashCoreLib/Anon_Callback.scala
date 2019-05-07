package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var node: stdLib.Node
  def callback(): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => scala.Unit, node: stdLib.Node): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), node = node)
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

