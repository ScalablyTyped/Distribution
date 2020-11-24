package typings.expressMysqlSession.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.global.Express.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  var Cookie: Instantiable0[typings.expressSession.mod.Cookie] = js.native
  
  /**
    * **Warning:** the default server-side session storage, `MemoryStore`, is purposely not designed for a production environment.
    * It will leak memory under most conditions, does not scale past a single process, and is only meant for debugging and developing.
    */
  var MemoryStore: Instantiable0[typings.expressSession.mod.MemoryStore] = js.native
  
  var Session: Instantiable2[/* request */ Request, /* data */ SessionData, typings.expressSession.mod.Session] = js.native
  
  var Store: Instantiable0[typings.expressSession.mod.Store] = js.native
}
