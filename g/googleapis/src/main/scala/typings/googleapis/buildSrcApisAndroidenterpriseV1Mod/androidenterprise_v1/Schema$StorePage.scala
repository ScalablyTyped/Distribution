package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a managed Google Play store page, made of a localized name
  * and links to other pages. A page also contains clusters defined as a
  * subcollection.
  */
@js.native
trait Schema$StorePage extends js.Object {
  /**
    * Unique ID of this page. Assigned by the server. Immutable once assigned.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storePage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Ordered list of pages a user should be able to reach from this page. The
    * list can&#39;t include this page. It is recommended that the basic pages
    * are created first, before adding the links between pages.  The API
    * doesn&#39;t verify that the pages exist or the pages are reachable.
    */
  var link: js.UndefOr[js.Array[String]] = js.native
  /**
    * Ordered list of localized strings giving the name of this page. The text
    * displayed is the one that best matches the user locale, or the first
    * entry if there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[Schema$LocalizedText]] = js.native
}

object Schema$StorePage {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    link: js.Array[String] = null,
    name: js.Array[Schema$LocalizedText] = null
  ): Schema$StorePage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StorePage]
  }
}

