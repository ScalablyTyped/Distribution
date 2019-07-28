package typings.expo.expoMod

import typings.expo.Anon_E
import typings.expo.Anon_Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Asset")
@js.native
class Asset protected () extends _PlaybackSource {
  def this(hasNameTypeHashUriWidthHeight: Anon_Hash) = this()
  var downloadCallbacks: js.Array[Anon_E] = js.native
  var downloaded: Boolean = js.native
  var downloading: Boolean = js.native
  /** The MD5 hash of the asset’s data. */
  var hash: Md5 = js.native
  /** If the asset is an image, the height of the image data divided by the scale factor. The scale factor is the number after `@` in the filename, or `1` if not present. */
  var height: js.UndefOr[Double] = js.native
  /** If the asset has been downloaded (by calling `downloadAsync()`), the `file://` URI pointing to the local file on the device that contains the asset data. */
  var localUri: String = js.native
  /** The name of the asset file without the extension. Also without the part from @ onward in the filename (used to specify scale factor for images). */
  var name: String = js.native
  /** The extension of the asset filename. */
  var `type`: String = js.native
  /** A URI that points to the asset’s data on the remote server. When running the published version of your app, this refers to the the location on Expo’s asset server where Expo has stored your asset. When running the app from XDE during development, this URI points to XDE’s server running on your computer and the asset is served directly from your computer. */
  var uri: String = js.native
  /** If the asset is an image, the width of the image data divided by the scale factor. The scale factor is the number after `@` in the filename, or `1` if not present. */
  var width: js.UndefOr[Double] = js.native
  /** Downloads the asset data to a local file in the device’s cache directory. Once the returned promise is fulfilled without error, the localUri field of this asset points to a local file containing the asset data. The asset is only downloaded if an up-to-date local file for the asset isn’t already present due to an earlier download. */
  def downloadAsync(): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("expo", "Asset")
@js.native
object Asset extends js.Object {
  /** Returns the `Expo.Asset` instance representing an asset given its module. */
  def fromModule(module: RequireSource): Asset = js.native
  /**
    * A helper that wraps `Expo.Asset.fromModule(module).downloadAsync` for convenience.
    * @param moduleIds An array of `require('path/to/file')`. Can also be just one module without an Array.
    */
  def loadAsync(module: js.Array[RequireSource]): js.Promise[Unit] = js.native
  def loadAsync(module: RequireSource): js.Promise[Unit] = js.native
}

