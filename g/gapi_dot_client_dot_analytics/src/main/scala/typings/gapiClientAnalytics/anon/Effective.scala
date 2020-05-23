package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effective extends js.Object {
  /**
    * All the permissions that the user has for this web property. These include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions
    * from the parent account.
    */
  var effective: js.UndefOr[js.Array[String]] = js.undefined
}

object Effective {
  @scala.inline
  def apply(effective: js.Array[String] = null): Effective = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effective]
  }
}

