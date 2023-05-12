package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsBase64BrowserMod {
  
  @JSImport("ethers/types/utils/base64-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64(textData: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(textData.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeBase64(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(_data.asInstanceOf[js.Any]).asInstanceOf[String]
}
