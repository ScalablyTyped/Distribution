package typings.expressCorrelationId

import typings.expressCorrelationId.anon.Header
import typings.expressServeStaticCore.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler]
  inline def apply(options: Header): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("express-correlation-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
}
