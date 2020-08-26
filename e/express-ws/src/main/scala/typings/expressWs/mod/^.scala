package typings.expressWs.mod

import typings.express.mod.Application_
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: Application_): Instance = js.native
  def apply(app: Application_, server: js.UndefOr[scala.Nothing], options: Options): Instance = js.native
  def apply(app: Application_, server: Server): Instance = js.native
  def apply(app: Application_, server: Server, options: Options): Instance = js.native
  def apply(app: Application_, server: typings.node.httpsMod.Server): Instance = js.native
  def apply(app: Application_, server: typings.node.httpsMod.Server, options: Options): Instance = js.native
}

