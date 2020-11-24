package typings.expressWs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.IRouterMatcher
import typings.expressServeStaticCore.mod.PathParams
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.RequestHandlerParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterLike
  extends /* key */ NumberDictionary[js.Any]
     with /* key */ StringDictionary[js.Any] {
  
  def get(path: PathParams, subApplication: typings.expressServeStaticCore.mod.Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def get[P, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  @JSName("get")
  var get_Original: IRouterMatcher[this.type] = js.native
}
