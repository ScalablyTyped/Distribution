package typings.gatsby.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreRenderHTMLArgs extends NodePluginArgs {
  def getHeadComponents(): js.Array[ReactNode] = js.native
  def getPostBodyComponents(): js.Array[ReactNode] = js.native
  def getPreBodyComponents(): js.Array[ReactNode] = js.native
  def replaceHeadComponents(comp: js.Array[ReactNode]): Unit = js.native
  def replacePostBodyComponents(comp: js.Array[ReactNode]): Unit = js.native
  def replacePreBodyComponents(comp: js.Array[ReactNode]): Unit = js.native
}

