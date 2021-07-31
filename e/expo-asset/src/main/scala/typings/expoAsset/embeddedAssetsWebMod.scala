package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embeddedAssetsWebMod {
  
  @JSImport("expo-asset/build/EmbeddedAssets.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEmbeddedAssetUri(hash: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmbeddedAssetUri")(hash.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def getEmbeddedAssetUri(hash: String, `type`: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmbeddedAssetUri")(hash.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
