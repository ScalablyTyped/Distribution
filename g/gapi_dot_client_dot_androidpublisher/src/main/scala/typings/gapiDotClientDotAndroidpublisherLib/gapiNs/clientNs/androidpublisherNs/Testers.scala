package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Testers extends js.Object {
  var googleGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var googlePlusCommunities: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Testers {
  @scala.inline
  def apply(
    googleGroups: js.Array[java.lang.String] = null,
    googlePlusCommunities: js.Array[java.lang.String] = null
  ): Testers = {
    val __obj = js.Dynamic.literal()
    if (googleGroups != null) __obj.updateDynamic("googleGroups")(googleGroups)
    if (googlePlusCommunities != null) __obj.updateDynamic("googlePlusCommunities")(googlePlusCommunities)
    __obj.asInstanceOf[Testers]
  }
}

