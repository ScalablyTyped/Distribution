package typings.expressCorrelationId

import typings.expressCorrelationId.anon.Header
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  @scala.inline
  def apply(options: Header): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  
  @JSImport("express-correlation-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
}
