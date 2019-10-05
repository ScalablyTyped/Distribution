package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorePage extends js.Object {
  /** Unique ID of this page. Assigned by the server. Immutable once assigned. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storePage". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Ordered list of pages a user should be able to reach from this page. The pages must exist, must not be this page, and once a link is created the page
    * linked to cannot be deleted until all links to it are removed. It is recommended that the basic pages are created first, before adding the links
    * between pages.
    *
    * No attempt is made to verify that all pages are reachable from the homepage.
    */
  var link: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Ordered list of localized strings giving the name of this page. The text displayed is the one that best matches the user locale, or the first entry if
    * there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[LocalizedText]] = js.undefined
}

object StorePage {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    link: js.Array[String] = null,
    name: js.Array[LocalizedText] = null
  ): StorePage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (link != null) __obj.updateDynamic("link")(link)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StorePage]
  }
}

