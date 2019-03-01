package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupUrl extends js.Object {
  /** The name of the resource. This must be included in the create enterprise request at the end of the signup flow. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A URL under which the Admin can sign up for an enterprise. The page pointed to cannot be rendered in an iframe. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SignupUrl {
  @scala.inline
  def apply(name: java.lang.String = null, url: java.lang.String = null): SignupUrl = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SignupUrl]
  }
}

