package typings.expressServeStaticCore.mod

import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterHandler[T] extends js.Object {
  def apply(
    handlers: ((RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]))*
  ): T = js.native
}

