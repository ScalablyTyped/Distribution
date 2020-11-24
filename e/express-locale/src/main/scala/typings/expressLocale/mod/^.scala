package typings.expressLocale.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-locale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Express middleware to determine the locale identifier of the incomming request.
    * It returns (only) full locale identifiers based on the middleware's configuration.
    * Configuration defines possible sources, their order and, optionally, a whitelist.
    * For performance reasons, on each request, remaining lookups are ignored as soon as a match is found.
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
