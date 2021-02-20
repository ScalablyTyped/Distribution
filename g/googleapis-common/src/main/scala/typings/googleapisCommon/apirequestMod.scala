package typings.googleapisCommon

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestParams
import typings.googleapisCommon.apiMod.BodyResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apirequestMod {
  
  @JSImport("googleapis-common/build/src/apirequest", "createAPIRequest")
  @js.native
  def createAPIRequest[T](parameters: APIRequestParams[_]): GaxiosPromise[T] = js.native
  @JSImport("googleapis-common/build/src/apirequest", "createAPIRequest")
  @js.native
  def createAPIRequest[T](parameters: APIRequestParams[_], callback: BodyResponseCallback[T]): Unit = js.native
}
