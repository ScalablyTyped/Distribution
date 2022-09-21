package typings.ethJsonRpcMiddleware

import typings.ethJsonRpcMiddleware.typesMod.Payload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("eth-json-rpc-middleware/dist/utils/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blockTagForPayload(payload: Payload): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockTagForPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def blockTagParamIndex(payload: Payload): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockTagParamIndex")(payload.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def cacheIdentifierForPayload(payload: Payload): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheIdentifierForPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def cacheIdentifierForPayload(payload: Payload, skipBlockRef: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheIdentifierForPayload")(payload.asInstanceOf[js.Any], skipBlockRef.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def cacheTypeForPayload(payload: Payload): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheTypeForPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def canCache(payload: Payload): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCache")(payload.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def paramsWithoutBlockTag(payload: Payload): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("paramsWithoutBlockTag")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
