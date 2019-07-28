package typings.flight.FlightNs

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends Advice {
  @JSName("$node")
  var $node: JQuery[HTMLElement] = js.native
  var node: Element = js.native
}

