package typings.googleFonts.google.fonts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontFamily extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var family: String
  var files: StringDictionary[String]
  var kind: String
  var lastModified: String
  var subsets: js.Array[String]
  var variants: js.Array[String]
  var version: String
}

object WebfontFamily {
  @scala.inline
  def apply(
    family: String,
    files: StringDictionary[String],
    kind: String,
    lastModified: String,
    subsets: js.Array[String],
    variants: js.Array[String],
    version: String,
    category: String = null
  ): WebfontFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], subsets = subsets.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebfontFamily]
  }
}

