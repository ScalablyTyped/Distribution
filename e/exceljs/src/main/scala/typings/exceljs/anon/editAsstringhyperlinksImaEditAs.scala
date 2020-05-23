package typings.exceljs.anon

import typings.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  editAs ? :string,   hyperlinks ? :exceljs.exceljs.ImageHyperlinkValue} & exceljs.exceljs.ImagePosition */
trait editAsstringhyperlinksImaEditAs extends js.Object {
  var editAs: js.UndefOr[String] = js.undefined
  var ext: Height
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.undefined
  var tl: Col
}

object editAsstringhyperlinksImaEditAs {
  @scala.inline
  def apply(ext: Height, tl: Col, editAs: String = null, hyperlinks: ImageHyperlinkValue = null): editAsstringhyperlinksImaEditAs = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    if (editAs != null) __obj.updateDynamic("editAs")(editAs.asInstanceOf[js.Any])
    if (hyperlinks != null) __obj.updateDynamic("hyperlinks")(hyperlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringhyperlinksImaEditAs]
  }
}

