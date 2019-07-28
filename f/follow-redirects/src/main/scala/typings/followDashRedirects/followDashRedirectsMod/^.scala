package typings.followDashRedirects.followDashRedirectsMod

import org.scalablytyped.runtime.StringDictionary
import typings.followDashRedirects.TypeofcoreHttp
import typings.followDashRedirects.TypeofcoreHttps
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("follow-redirects", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val http: Override[TypeofcoreHttp, RedirectScheme[RequestOptions, ClientRequest, IncomingMessage]] = js.native
  val https: Override[
    TypeofcoreHttps, 
    RedirectScheme[typings.node.httpsMod.RequestOptions, ClientRequest, IncomingMessage]
  ] = js.native
  def wrap[T /* <: StringDictionary[Scheme[_, _, _]] */](protocols: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: follow-redirects.follow-redirects.WrappedScheme<T[K]>}
    */ typings.followDashRedirects.followDashRedirectsStrings.wrap with T = js.native
}

