package typings
package downloadLib.downloadMod.downloadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadOptions
  extends gotLib.gotMod.gotNs.GotBodyOptions[java.lang.String]
     with decompressLib.decompressMod.decompressNs.DecompressOptions {
  /**
           * If set to true, try extracting the file using decompress.
           */
  var extract: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Name of the saved file.
           */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Proxy endpoint
           */
  var proxy: js.UndefOr[java.lang.String] = js.undefined
}

