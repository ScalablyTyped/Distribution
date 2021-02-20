package typings.expressCorrelationId

import typings.expressCorrelationId.anon.Header
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-correlation-id", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  @JSImport("express-correlation-id", JSImport.Namespace)
  @js.native
  def apply(options: Header): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  
  @JSImport("express-correlation-id", "getId")
  @js.native
  def getId(): js.UndefOr[String] = js.native
}
