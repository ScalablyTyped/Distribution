package typings.ethers

import typings.ethers.typesUtilsFetchMod.FetchCancelSignal
import typings.ethers.typesUtilsFetchMod.FetchRequest
import typings.ethers.typesUtilsFetchMod.GetUrlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsGeturlMod {
  
  @JSImport("ethers/types/utils/geturl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUrl(req: FetchRequest): js.Promise[GetUrlResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUrlResponse]]
  inline def getUrl(req: FetchRequest, signal: FetchCancelSignal): js.Promise[GetUrlResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(req.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUrlResponse]]
}
