package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Effective extends js.Object {
  /**
    * All the permissions that the user has for this web property. These include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions
    * from the parent account.
    */
  var effective: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Effective {
  @scala.inline
  def apply(effective: js.Array[java.lang.String] = null): Anon_Effective = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective)
    __obj.asInstanceOf[Anon_Effective]
  }
}

