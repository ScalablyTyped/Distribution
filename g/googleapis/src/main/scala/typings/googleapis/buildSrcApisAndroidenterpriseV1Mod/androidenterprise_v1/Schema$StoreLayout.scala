package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * General setting for the managed Google Play store layout, currently only
  * specifying the page to display the first time the store is opened.
  */
@js.native
trait Schema$StoreLayout extends js.Object {
  /**
    * The ID of the store page to be used as the homepage. The homepage is the
    * first page shown in the managed Google Play Store.  Not specifying a
    * homepage is equivalent to setting the store layout type to
    * &quot;basic&quot;.
    */
  var homepageId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayout&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The store layout type. By default, this value is set to &quot;basic&quot;
    * if the homepageId field is not set, and to &quot;custom&quot; otherwise.
    * If set to &quot;basic&quot;, the layout will consist of all approved apps
    * that have been whitelisted for the user.
    */
  var storeLayoutType: js.UndefOr[String] = js.native
}

object Schema$StoreLayout {
  @scala.inline
  def apply(homepageId: String = null, kind: String = null, storeLayoutType: String = null): Schema$StoreLayout = {
    val __obj = js.Dynamic.literal()
    if (homepageId != null) __obj.updateDynamic("homepageId")(homepageId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (storeLayoutType != null) __obj.updateDynamic("storeLayoutType")(storeLayoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StoreLayout]
  }
}

