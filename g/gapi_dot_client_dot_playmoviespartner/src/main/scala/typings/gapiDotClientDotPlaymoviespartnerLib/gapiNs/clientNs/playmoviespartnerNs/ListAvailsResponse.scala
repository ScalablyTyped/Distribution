package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailsResponse extends js.Object {
  /** List of Avails that match the request criteria. */
  var avails: js.UndefOr[js.Array[Avail]] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

object ListAvailsResponse {
  @scala.inline
  def apply(
    avails: js.Array[Avail] = null,
    nextPageToken: java.lang.String = null,
    totalSize: scala.Int | scala.Double = null
  ): ListAvailsResponse = {
    val __obj = js.Dynamic.literal()
    if (avails != null) __obj.updateDynamic("avails")(avails)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailsResponse]
  }
}

