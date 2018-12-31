package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApi__HttpBody extends js.Object {
  /** The HTTP Content-Type string representing the content type of the body. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP body binary data. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
}

