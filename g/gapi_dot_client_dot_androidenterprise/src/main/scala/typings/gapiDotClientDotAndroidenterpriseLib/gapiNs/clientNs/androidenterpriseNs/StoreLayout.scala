package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreLayout extends js.Object {
  /**
    * The ID of the store page to be used as the homepage. The homepage is the first page shown in the managed Google Play Store.
    *
    * Not specifying a homepage is equivalent to setting the store layout type to "basic".
    */
  var homepageId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayout". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The store layout type. By default, this value is set to "basic" if the homepageId field is not set, and to "custom" otherwise. If set to "basic", the
    * layout will consist of all approved apps that have been whitelisted for the user.
    */
  var storeLayoutType: js.UndefOr[java.lang.String] = js.undefined
}

object StoreLayout {
  @scala.inline
  def apply(
    homepageId: java.lang.String = null,
    kind: java.lang.String = null,
    storeLayoutType: java.lang.String = null
  ): StoreLayout = {
    val __obj = js.Dynamic.literal()
    if (homepageId != null) __obj.updateDynamic("homepageId")(homepageId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (storeLayoutType != null) __obj.updateDynamic("storeLayoutType")(storeLayoutType)
    __obj.asInstanceOf[StoreLayout]
  }
}

