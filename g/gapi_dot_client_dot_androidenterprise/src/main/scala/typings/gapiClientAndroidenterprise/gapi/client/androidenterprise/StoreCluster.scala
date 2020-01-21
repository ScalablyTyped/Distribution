package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreCluster extends js.Object {
  /** Unique ID of this cluster. Assigned by the server. Immutable once assigned. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeCluster". */
  var kind: js.UndefOr[String] = js.undefined
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
  var orderInPage: js.UndefOr[String] = js.undefined
  /** List of products in the order they are displayed in the cluster. There should not be duplicates within a cluster. */
  var productId: js.UndefOr[js.Array[String]] = js.undefined
}

object StoreCluster {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    name: js.Array[LocalizedText] = null,
    orderInPage: String = null,
    productId: js.Array[String] = null
  ): StoreCluster = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orderInPage != null) __obj.updateDynamic("orderInPage")(orderInPage.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreCluster]
  }
}

