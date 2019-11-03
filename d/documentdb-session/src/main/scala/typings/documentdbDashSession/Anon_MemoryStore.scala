package typings.documentdbDashSession

import org.scalablytyped.runtime.Instantiable0
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MemoryStore extends js.Object {
  var MemoryStore: Instantiable0[typings.expressDashSession.expressDashSessionMod.MemoryStore] = js.native
  var Store: Instantiable0[typings.expressDashSession.expressDashSessionMod.Store] = js.native
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: SessionOptions): RequestHandler[ParamsDictionary] = js.native
}

