package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.double
import typings.exceljs.exceljsStrings.doubleAccounting
import typings.exceljs.exceljsStrings.major
import typings.exceljs.exceljsStrings.minor
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.single
import typings.exceljs.exceljsStrings.singleAccounting
import typings.exceljs.exceljsStrings.subscript
import typings.exceljs.exceljsStrings.superscript
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var bold: Boolean
  var charset: Double
  var color: Partial[Color]
  var family: Double
  var italic: Boolean
  var name: String
  var outline: Boolean
  var scheme: minor | major | none_
  var size: Double
  var strike: Boolean
  var underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting
  var vertAlign: superscript | subscript
}

object Font {
  @scala.inline
  def apply(
    bold: Boolean,
    charset: Double,
    color: Partial[Color],
    family: Double,
    italic: Boolean,
    name: String,
    outline: Boolean,
    scheme: minor | major | none_,
    size: Double,
    strike: Boolean,
    underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting,
    vertAlign: superscript | subscript
  ): Font = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strike = strike.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], vertAlign = vertAlign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Font]
  }
}

