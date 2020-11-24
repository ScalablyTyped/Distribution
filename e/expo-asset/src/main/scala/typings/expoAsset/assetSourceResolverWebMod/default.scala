package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
@js.native
class default protected () extends AssetSourceResolver {
  def this(serverUrl: js.UndefOr[scala.Nothing], jsbundleUrl: js.UndefOr[scala.Nothing], asset: PackagerAsset) = this()
  def this(serverUrl: js.UndefOr[scala.Nothing], jsbundleUrl: String, asset: PackagerAsset) = this()
  def this(serverUrl: js.UndefOr[scala.Nothing], jsbundleUrl: Null, asset: PackagerAsset) = this()
  def this(serverUrl: String, jsbundleUrl: js.UndefOr[scala.Nothing], asset: PackagerAsset) = this()
  def this(serverUrl: String, jsbundleUrl: String, asset: PackagerAsset) = this()
  def this(serverUrl: String, jsbundleUrl: Null, asset: PackagerAsset) = this()
  def this(serverUrl: Null, jsbundleUrl: js.UndefOr[scala.Nothing], asset: PackagerAsset) = this()
  def this(serverUrl: Null, jsbundleUrl: String, asset: PackagerAsset) = this()
  def this(serverUrl: Null, jsbundleUrl: Null, asset: PackagerAsset) = this()
}
/* static members */
@JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
@js.native
object default extends js.Object {
  
  def pickScale(scales: js.Array[Double], deviceScale: Double): Double = js.native
}
