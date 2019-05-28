package typings
package followDashRedirectsLib.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("follow-redirects", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val http: Override[
    followDashRedirectsLib.TypeofcoreHttp, 
    RedirectScheme[
      nodeLib.httpMod.RequestOptions, 
      nodeLib.httpMod.ClientRequest, 
      nodeLib.httpMod.IncomingMessage
    ]
  ] = js.native
  val https: Override[
    followDashRedirectsLib.TypeofcoreHttps, 
    RedirectScheme[
      nodeLib.httpsMod.RequestOptions, 
      nodeLib.httpMod.ClientRequest, 
      nodeLib.httpMod.IncomingMessage
    ]
  ] = js.native
  def wrap[T /* <: org.scalablytyped.runtime.StringDictionary[Scheme[_, _, _]] */](protocols: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: follow-redirects.follow-redirects.WrappedScheme<T[K]>}
    */ followDashRedirectsLib.followDashRedirectsLibStrings.wrap with T = js.native
}

