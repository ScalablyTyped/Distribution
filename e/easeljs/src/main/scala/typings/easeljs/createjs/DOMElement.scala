package typings.easeljs.createjs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.DOMElement")
@js.native
class DOMElement protected () extends DisplayObject {
  def this(htmlElement: HTMLElement) = this()
  // properties
  var htmlElement: HTMLElement = js.native
}

