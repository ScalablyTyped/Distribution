package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeRedirectDetails extends js.Object {
  var fromCache: scala.Boolean
  var id: scala.Double
  /**
    * The server IP address that the request was actually sent to.
    */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var method: java.lang.String
  var redirectURL: java.lang.String
  var resourceType: java.lang.String
  var responseHeaders: ResponseHeaders
  var statusCode: scala.Double
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

