package typings.electronDashWinstaller.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var author: js.UndefOr[String | PersonMetadata] = js.undefined
  var authors: js.UndefOr[String | js.Array[PersonMetadata]] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owners: js.UndefOr[String | js.Array[PersonMetadata]] = js.undefined
  var productName: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    author: String | PersonMetadata = null,
    authors: String | js.Array[PersonMetadata] = null,
    copyright: String = null,
    description: String = null,
    iconUrl: String = null,
    name: String = null,
    owners: String | js.Array[PersonMetadata] = null,
    productName: String = null,
    version: String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (description != null) __obj.updateDynamic("description")(description)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Metadata]
  }
}

