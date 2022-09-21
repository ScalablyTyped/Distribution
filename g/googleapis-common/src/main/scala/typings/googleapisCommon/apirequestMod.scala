package typings.googleapisCommon

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestParams
import typings.googleapisCommon.apiMod.BodyResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apirequestMod {
  
  @JSImport("googleapis-common/build/src/apirequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAPIRequest[T](parameters: APIRequestParams[Any]): GaxiosPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAPIRequest")(parameters.asInstanceOf[js.Any]).asInstanceOf[GaxiosPromise[T]]
  inline def createAPIRequest[T](parameters: APIRequestParams[Any], callback: BodyResponseCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAPIRequest")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
