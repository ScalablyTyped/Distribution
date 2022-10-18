package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcPlatformBrowserLiteBase64Mod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/browser_lite/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64(encoded: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(encoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeBase64(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64Available")().asInstanceOf[Boolean]
}
