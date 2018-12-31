package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetPhotosResponse extends js.Object {
  /**
    * List of results for each individual
    * Photo requested, in the same order as
    * the requests in
    * BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[PhotoResponse]] = js.undefined
}

