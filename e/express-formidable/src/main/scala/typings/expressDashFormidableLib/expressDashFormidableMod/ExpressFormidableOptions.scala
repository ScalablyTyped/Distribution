package typings
package expressDashFormidableLib.expressDashFormidableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFormidableOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[
    scala.Boolean | expressDashFormidableLib.expressDashFormidableLibStrings.sha1 | expressDashFormidableLib.expressDashFormidableLibStrings.md5
  ] = js.undefined
  var keepExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var maxFields: js.UndefOr[scala.Double] = js.undefined
  var maxFieldsSize: js.UndefOr[scala.Double] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var multiples: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    expressDashFormidableLib.expressDashFormidableLibStrings.multipart | expressDashFormidableLib.expressDashFormidableLibStrings.urlencoded
  ] = js.undefined
  var uploadDir: js.UndefOr[java.lang.String] = js.undefined
}

object ExpressFormidableOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    hash: scala.Boolean | expressDashFormidableLib.expressDashFormidableLibStrings.sha1 | expressDashFormidableLib.expressDashFormidableLibStrings.md5 = null,
    keepExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    maxFields: scala.Int | scala.Double = null,
    maxFieldsSize: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    multiples: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: expressDashFormidableLib.expressDashFormidableLibStrings.multipart | expressDashFormidableLib.expressDashFormidableLibStrings.urlencoded = null,
    uploadDir: java.lang.String = null
  ): ExpressFormidableOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions)
    if (maxFields != null) __obj.updateDynamic("maxFields")(maxFields.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir)
    __obj.asInstanceOf[ExpressFormidableOptions]
  }
}

