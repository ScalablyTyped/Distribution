package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentStatic extends js.Object {
  def apply(fns: js.Function*): ComponentStatic = js.native
  def attachTo(selector: java.lang.String): scala.Unit = js.native
  def attachTo(selector: java.lang.String, options: js.Object): scala.Unit = js.native
  def attachTo(selector: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Unit = js.native
  def attachTo(selector: jqueryLib.JQuery[stdLib.HTMLElement], options: js.Object): scala.Unit = js.native
  def attachTo(selector: stdLib.Element): scala.Unit = js.native
  def attachTo(selector: stdLib.Element, options: js.Object): scala.Unit = js.native
  def teardownAll(): scala.Unit = js.native
}

