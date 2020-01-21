package typings.formData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendOptions extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var filepath: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String | Headers] = js.undefined
  var knownLength: js.UndefOr[Double] = js.undefined
}

object AppendOptions {
  @scala.inline
  def apply(
    contentType: String = null,
    filename: String = null,
    filepath: String = null,
    header: String | Headers = null,
    knownLength: Int | Double = null
  ): AppendOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filepath != null) __obj.updateDynamic("filepath")(filepath.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (knownLength != null) __obj.updateDynamic("knownLength")(knownLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendOptions]
  }
}

