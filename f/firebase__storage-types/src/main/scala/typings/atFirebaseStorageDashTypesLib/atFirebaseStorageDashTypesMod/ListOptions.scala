package typings
package atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var maxResults: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var pageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(maxResults: scala.Int | scala.Double = null, pageToken: java.lang.String = null): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[ListOptions]
  }
}

