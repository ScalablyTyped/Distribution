package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateInterruptedDownloadOptions extends js.Object {
  /**
       * ETag header value.
       */
  var eTag: java.lang.String
  /**
       * Last-Modified header value.
       */
  var lastModified: java.lang.String
  /**
       * Total length of the download.
       */
  var length: scala.Double
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Start range for the download.
       */
  var offset: scala.Double
  /**
       * Absolute path of the download.
       */
  var path: java.lang.String
  /**
       * Time when download was started in number of seconds since UNIX epoch.
       */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /**
       * Complete URL chain for the download.
       */
  var urlChain: js.Array[java.lang.String]
}

