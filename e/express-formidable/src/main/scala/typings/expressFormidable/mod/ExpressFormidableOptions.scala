package typings.expressFormidable.mod

import typings.expressFormidable.expressFormidableStrings.md5
import typings.expressFormidable.expressFormidableStrings.multipart
import typings.expressFormidable.expressFormidableStrings.sha1
import typings.expressFormidable.expressFormidableStrings.urlencoded
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
    maxFields: js.UndefOr[Double] = js.undefined,
    maxFieldsSize: js.UndefOr[Double] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    multiples: js.UndefOr[Boolean] = js.undefined,
    `type`: multipart | urlencoded = null,
    uploadDir: String = null
  ): ExpressFormidableOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFields)) __obj.updateDynamic("maxFields")(maxFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFieldsSize)) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressFormidableOptions]
  }
}

