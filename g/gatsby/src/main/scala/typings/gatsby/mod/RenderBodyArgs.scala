package typings.gatsby.mod

import typings.react.mod.ReactNode
import typings.std.HTMLBodyElement
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBodyArgs extends NodePluginArgs {
  var pathname: String = js.native
  var setBodyProps: js.Function = js.native
  def setBodyAttributes(attr: ReactProps[HTMLBodyElement]): Unit = js.native
  def setHeadComponents(comp: js.Array[ReactNode]): Unit = js.native
  def setHtmlAttributes(attr: ReactProps[HTMLHtmlElement]): Unit = js.native
  def setPostBodyComponents(comp: js.Array[ReactNode]): Unit = js.native
  def setPreBodyComponents(comp: js.Array[ReactNode]): Unit = js.native
}

