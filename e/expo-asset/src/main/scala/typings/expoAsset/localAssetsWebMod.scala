package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localAssetsWebMod {
  
  @JSImport("expo-asset/build/LocalAssets.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalAssetUri(hash: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalAssetUri")(hash.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getLocalAssetUri(hash: String, `type`: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalAssetUri")(hash.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
