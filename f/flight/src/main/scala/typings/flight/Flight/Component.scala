package typings.flight.Flight

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends Advice {
  
  @JSName("$node")
  var $node: JQuery[HTMLElement] = js.native
  
  var node: Element = js.native
}
