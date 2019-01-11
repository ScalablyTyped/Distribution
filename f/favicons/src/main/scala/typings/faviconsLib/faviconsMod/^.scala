package typings
package faviconsLib.faviconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("favicons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** You can programmatically access Favicons configuration (icon filenames, HTML, manifest files, etc) with this export */
  val config: faviconsLib.faviconsMod.faviconsNs.Configuration = js.native
  /**
    * Generate favicons
    * @param source Source image(s)
    * @param configuration
    * @param callback
    */
  def apply(source: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String]): js.Promise[faviconsLib.faviconsMod.faviconsNs.FavIconResponse] = js.native
  def apply(
    source: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String],
    callback: faviconsLib.faviconsMod.faviconsNs.Callback
  ): scala.Unit = js.native
  def apply(
    source: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String],
    configuration: stdLib.Partial[faviconsLib.faviconsMod.faviconsNs.Configuration]
  ): js.Promise[faviconsLib.faviconsMod.faviconsNs.FavIconResponse] = js.native
  def apply(
    source: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String],
    configuration: stdLib.Partial[faviconsLib.faviconsMod.faviconsNs.Configuration],
    callback: faviconsLib.faviconsMod.faviconsNs.Callback
  ): scala.Unit = js.native
  def stream(): nodeLib.streamMod.Duplex = js.native
  def stream(configuration: faviconsLib.faviconsMod.faviconsNs.Configuration): nodeLib.streamMod.Duplex = js.native
}

