package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnResponseStartedDetails extends js.Object {
  /**
       * Indicates whether the response was fetched from disk cache.
       */
  var fromCache: scala.Boolean
  var id: scala.Double
  var method: java.lang.String
  var resourceType: java.lang.String
  var responseHeaders: ResponseHeaders
  var statusCode: scala.Double
  var statusLine: java.lang.String
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

