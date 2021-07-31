package typings.feathersjsErrors

import typings.express.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  @scala.inline
  def apply(): ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: js.Any): ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("@feathersjs/errors/handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
