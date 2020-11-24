package typings.expressRateLimit.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimit
  extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  
  def resetIp(key: String): Unit = js.native
  
  def resetKey(key: String): Unit = js.native
}
