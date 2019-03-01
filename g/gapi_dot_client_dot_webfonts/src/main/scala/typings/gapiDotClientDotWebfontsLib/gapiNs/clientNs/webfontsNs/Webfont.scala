package typings
package gapiDotClientDotWebfontsLib.gapiNs.clientNs.webfontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webfont extends js.Object {
  /** The category of the font. */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the font. */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /** The font files (with all supported scripts) for each one of the available variants, as a key : value map. */
  var files: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** This kind represents a webfont object in the webfonts service. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The date (format "yyyy-MM-dd") the font was modified for the last time. */
  var lastModified: js.UndefOr[java.lang.String] = js.undefined
  /** The scripts supported by the font. */
  var subsets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The available variants for the font. */
  var variants: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The font version. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Webfont {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    family: java.lang.String = null,
    files: stdLib.Record[java.lang.String, java.lang.String] = null,
    kind: java.lang.String = null,
    lastModified: java.lang.String = null,
    subsets: js.Array[java.lang.String] = null,
    variants: js.Array[java.lang.String] = null,
    version: java.lang.String = null
  ): Webfont = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (family != null) __obj.updateDynamic("family")(family)
    if (files != null) __obj.updateDynamic("files")(files)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (subsets != null) __obj.updateDynamic("subsets")(subsets)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Webfont]
  }
}

