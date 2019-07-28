package typings.googleDotFonts.googleNs.fontsNs

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
    val __obj = js.Dynamic.literal(family = family, files = files, kind = kind, lastModified = lastModified, subsets = subsets, variants = variants, version = version)
    if (category != null) __obj.updateDynamic("category")(category)
    __obj.asInstanceOf[WebfontFamily]
  }
}

