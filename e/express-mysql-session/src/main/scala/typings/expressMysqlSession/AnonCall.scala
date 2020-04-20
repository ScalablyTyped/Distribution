package typings.expressMysqlSession

import org.scalablytyped.runtime.Instantiable0
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var MemoryStore: Instantiable0[typings.expressSession.mod.MemoryStore] = js.native
  var Store: Instantiable0[typings.expressSession.mod.Store] = js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

