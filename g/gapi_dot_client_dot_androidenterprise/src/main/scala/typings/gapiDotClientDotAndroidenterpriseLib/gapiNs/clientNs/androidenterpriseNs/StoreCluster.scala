package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreCluster extends js.Object {
  /** Unique ID of this cluster. Assigned by the server. Immutable once assigned. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeCluster". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ordered list of localized strings giving the name of this page. The text displayed is the one that best matches the user locale, or the first entry if
    * there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[LocalizedText]] = js.undefined
  /**
    * String (US-ASCII only) used to determine order of this cluster within the parent page's elements. Page elements are sorted in lexicographic order of
    * this field. Duplicated values are allowed, but ordering between elements with duplicate order is undefined.
    *
    * The value of this field is never visible to a user, it is used solely for the purpose of defining an ordering. Maximum length is 256 characters.
    */
  var orderInPage: js.UndefOr[java.lang.String] = js.undefined
  /** List of products in the order they are displayed in the cluster. There should not be duplicates within a cluster. */
  var productId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StoreCluster {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: js.Array[LocalizedText] = null,
    orderInPage: java.lang.String = null,
    productId: js.Array[java.lang.String] = null
  ): StoreCluster = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orderInPage != null) __obj.updateDynamic("orderInPage")(orderInPage)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[StoreCluster]
  }
}

