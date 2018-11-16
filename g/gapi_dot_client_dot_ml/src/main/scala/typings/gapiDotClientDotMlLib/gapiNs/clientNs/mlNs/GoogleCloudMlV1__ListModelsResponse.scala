package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleCloudMlV1__ListModelsResponse extends js.Object {
  /** The list of models. */
  var models: js.UndefOr[js.Array[GoogleCloudMlV1__Model]] = js.undefined
  /**
               * Optional. Pass this token as the `page_token` field of the request for a
               * subsequent call.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

