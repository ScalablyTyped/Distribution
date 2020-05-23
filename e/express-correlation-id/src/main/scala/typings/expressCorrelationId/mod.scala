package typings.expressCorrelationId

import typings.expressCorrelationId.anon.Header
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-correlation-id", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  def apply(options: Header): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  def getId(): js.UndefOr[String] = js.native
}

