package typings.expressMinify

import typings.express.mod.RequestHandler
import typings.expressMinify.ExpressMinifyInterfaces.ExpressMinifyOptions
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: ExpressMinifyOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-minify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
