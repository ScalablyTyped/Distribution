package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBase64Mod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/platform/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64(encoded: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(encoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeUint8Array(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUint8Array")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
