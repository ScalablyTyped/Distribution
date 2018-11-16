package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SessionOptions extends js.Object {
  /**
           * Any additional headers you would like included with the `GET` request sent to your server. Ignored in `IE9` and `IE8` if the endpoint is cross-origin
           *
           * @default `{}`
           */
  var customHeaders: js.UndefOr[js.Any] = js.undefined
  /**
           * If non-null, Fine Uploader will send a `GET` request on startup to this endpoint, expecting a `JSON` response containing data about the initial file list to populate
           *
           * @default `null`
           */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Any parameters you would like passed with the associated `GET` request to your server
           *
           * @default `{}`
           */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
           * Set this to `false` if you do not want the file list to be retrieved from the server as part of a reset.
           *
           * @default `true`
           */
  var refreshOnReset: js.UndefOr[scala.Boolean] = js.undefined
}

