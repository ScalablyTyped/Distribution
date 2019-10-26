package typings.googleapisDashCommon

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestParams
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/apirequest", JSImport.Namespace)
@js.native
object buildSrcApirequestMod extends js.Object {
  def createAPIRequest[T](parameters: APIRequestParams[_]): GaxiosPromise[T] = js.native
  def createAPIRequest[T](parameters: APIRequestParams[_], callback: BodyResponseCallback[T]): Unit = js.native
}

