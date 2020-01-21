package typings.electronWinstaller.optionsMod

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
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

