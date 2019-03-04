package typings
package googleDotFontsLib.googleNs.fontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontFamily extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var family: java.lang.String
  var files: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var kind: java.lang.String
  var lastModified: java.lang.String
  var subsets: js.Array[java.lang.String]
  var variants: js.Array[java.lang.String]
  var version: java.lang.String
}

object WebfontFamily {
  @scala.inline
  def apply(
    family: java.lang.String,
    files: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    kind: java.lang.String,
    lastModified: java.lang.String,
    subsets: js.Array[java.lang.String],
    variants: js.Array[java.lang.String],
    version: java.lang.String,
    category: java.lang.String = null
  ): WebfontFamily = {
    val __obj = js.Dynamic.literal(family = family, files = files, kind = kind, lastModified = lastModified, subsets = subsets, variants = variants, version = version)
    if (category != null) __obj.updateDynamic("category")(category)
    __obj.asInstanceOf[WebfontFamily]
  }
}

