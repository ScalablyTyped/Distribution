package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcRemoteRpcErrorMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/rpc_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPermanentError(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPermanentError")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPermanentWriteError(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPermanentWriteError")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mapCodeFromHttpResponseErrorStatus(status: String): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCodeFromHttpResponseErrorStatus")(status.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def mapCodeFromHttpStatus(): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCodeFromHttpStatus")().asInstanceOf[Code]
  inline def mapCodeFromHttpStatus(status: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCodeFromHttpStatus")(status.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def mapCodeFromRpcCode(): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCodeFromRpcCode")().asInstanceOf[Code]
  inline def mapCodeFromRpcCode(code: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCodeFromRpcCode")(code.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def mapCodeFromRpcStatus(status: String): js.UndefOr[Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCodeFromRpcStatus")(status.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Code]]
  
  inline def mapRpcCodeFromCode(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mapRpcCodeFromCode")().asInstanceOf[Double]
  inline def mapRpcCodeFromCode(code: Code): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mapRpcCodeFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
}
