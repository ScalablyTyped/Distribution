package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpData extends js.Object {
  /**
    * The URL that points to the file that stores the object list entries.
    * This file must allow public access.  Currently, only URLs with HTTP and
    * HTTPS schemes are supported.
    * Required.
    */
  var listUrl: js.UndefOr[java.lang.String] = js.undefined
}

object HttpData {
  @scala.inline
  def apply(listUrl: java.lang.String = null): HttpData = {
    val __obj = js.Dynamic.literal()
    if (listUrl != null) __obj.updateDynamic("listUrl")(listUrl)
    __obj.asInstanceOf[HttpData]
  }
}

