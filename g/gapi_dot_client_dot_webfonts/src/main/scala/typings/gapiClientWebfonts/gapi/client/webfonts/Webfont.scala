package typings.gapiClientWebfonts.gapi.client.webfonts

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webfont extends js.Object {
  /** The category of the font. */
  var category: js.UndefOr[String] = js.undefined
  /** The name of the font. */
  var family: js.UndefOr[String] = js.undefined
  /** The font files (with all supported scripts) for each one of the available variants, as a key : value map. */
  var files: js.UndefOr[Record[String, String]] = js.undefined
  /** This kind represents a webfont object in the webfonts service. */
  var kind: js.UndefOr[String] = js.undefined
  /** The date (format "yyyy-MM-dd") the font was modified for the last time. */
  var lastModified: js.UndefOr[String] = js.undefined
  /** The scripts supported by the font. */
  var subsets: js.UndefOr[js.Array[String]] = js.undefined
  /** The available variants for the font. */
  var variants: js.UndefOr[js.Array[String]] = js.undefined
  /** The font version. */
  var version: js.UndefOr[String] = js.undefined
}

object Webfont {
  @scala.inline
  def apply(
    category: String = null,
    family: String = null,
    files: Record[String, String] = null,
    kind: String = null,
    lastModified: String = null,
    subsets: js.Array[String] = null,
    variants: js.Array[String] = null,
    version: String = null
  ): Webfont = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (subsets != null) __obj.updateDynamic("subsets")(subsets.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webfont]
  }
}

