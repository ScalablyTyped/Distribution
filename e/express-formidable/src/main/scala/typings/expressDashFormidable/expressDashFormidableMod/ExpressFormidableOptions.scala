package typings.expressDashFormidable.expressDashFormidableMod

import typings.expressDashFormidable.expressDashFormidableStrings.md5
import typings.expressDashFormidable.expressDashFormidableStrings.multipart
import typings.expressDashFormidable.expressDashFormidableStrings.sha1
import typings.expressDashFormidable.expressDashFormidableStrings.urlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFormidableOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[Boolean | sha1 | md5] = js.undefined
  var keepExtensions: js.UndefOr[Boolean] = js.undefined
  var maxFields: js.UndefOr[Double] = js.undefined
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var multiples: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[multipart | urlencoded] = js.undefined
  var uploadDir: js.UndefOr[String] = js.undefined
}

object ExpressFormidableOptions {
  @scala.inline
  def apply(
    encoding: String = null,
    hash: Boolean | sha1 | md5 = null,
    keepExtensions: js.UndefOr[Boolean] = js.undefined,
    maxFields: Int | Double = null,
    maxFieldsSize: Int | Double = null,
    maxFileSize: Int | Double = null,
    multiples: js.UndefOr[Boolean] = js.undefined,
    `type`: multipart | urlencoded = null,
    uploadDir: String = null
  ): ExpressFormidableOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions.asInstanceOf[js.Any])
    if (maxFields != null) __obj.updateDynamic("maxFields")(maxFields.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressFormidableOptions]
  }
}

