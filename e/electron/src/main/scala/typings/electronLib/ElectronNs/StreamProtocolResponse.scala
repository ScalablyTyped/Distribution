package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StreamProtocolResponse extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/stream-protocol-response
  /**
       * A Node.js readable stream representing the response body
       */
  var data: stdLib.ReadableStream[_]
  /**
       * An object containing the response headers
       */
  var headers: Headers
  /**
       * The HTTP response code
       */
  var statusCode: scala.Double
}

