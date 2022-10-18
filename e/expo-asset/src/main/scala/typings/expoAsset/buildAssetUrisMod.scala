package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAssetUrisMod {
  
  @JSImport("expo-asset/build/AssetUris", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileExtension(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileExtension")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFilename(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilename")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getManifestBaseUrl(manifestUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifestBaseUrl")(manifestUrl.asInstanceOf[js.Any]).asInstanceOf[String]
}
