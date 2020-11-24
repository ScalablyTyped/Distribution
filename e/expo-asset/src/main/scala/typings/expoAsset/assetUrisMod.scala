package typings.expoAsset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/AssetUris", JSImport.Namespace)
@js.native
object assetUrisMod extends js.Object {
  
  def getFileExtension(url: String): String = js.native
  
  def getFilename(url: String): String = js.native
  
  def getManifestBaseUrl(manifestUrl: String): String = js.native
}
