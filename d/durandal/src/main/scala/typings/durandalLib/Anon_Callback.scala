package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var routePattern: stdLib.RegExp
  def callback(fragment: java.lang.String): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: js.Function1[java.lang.String, scala.Unit], routePattern: stdLib.RegExp): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = callback, routePattern = routePattern)
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

