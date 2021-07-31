package typings.forestExpressMongoose.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-mongoose", "PermissionMiddlewareCreator")
@js.native
class PermissionMiddlewareCreator protected () extends StObject {
  def this(collectionName: String) = this()
  
  def create(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  def delete(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  def details(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  def `export`(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  def list(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  def smartAction(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  def update(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
}
