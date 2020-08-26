package typings.devextreme.anon

import typings.devextreme.devextremeStrings.arrowBottom
import typings.devextreme.devextremeStrings.arrowEastWest
import typings.devextreme.devextremeStrings.arrowLeft
import typings.devextreme.devextremeStrings.arrowNorthSouth
import typings.devextreme.devextremeStrings.arrowRight
import typings.devextreme.devextremeStrings.arrowTop
import typings.devextreme.devextremeStrings.cardWithImageOnLeft
import typings.devextreme.devextremeStrings.cardWithImageOnRight
import typings.devextreme.devextremeStrings.cardWithImageOnTop
import typings.devextreme.devextremeStrings.connector
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.data
import typings.devextreme.devextremeStrings.database
import typings.devextreme.devextremeStrings.decision
import typings.devextreme.devextremeStrings.delay
import typings.devextreme.devextremeStrings.diamond
import typings.devextreme.devextremeStrings.display
import typings.devextreme.devextremeStrings.document
import typings.devextreme.devextremeStrings.ellipse
import typings.devextreme.devextremeStrings.hardDisk
import typings.devextreme.devextremeStrings.heart
import typings.devextreme.devextremeStrings.horizontalContainer
import typings.devextreme.devextremeStrings.internalStorage
import typings.devextreme.devextremeStrings.manualInput
import typings.devextreme.devextremeStrings.manualOperation
import typings.devextreme.devextremeStrings.merge
import typings.devextreme.devextremeStrings.multipleDocuments
import typings.devextreme.devextremeStrings.octagon
import typings.devextreme.devextremeStrings.or
import typings.devextreme.devextremeStrings.paperTape
import typings.devextreme.devextremeStrings.pentagon
import typings.devextreme.devextremeStrings.predefinedProcess
import typings.devextreme.devextremeStrings.preparation
import typings.devextreme.devextremeStrings.process
import typings.devextreme.devextremeStrings.rectangle
import typings.devextreme.devextremeStrings.star
import typings.devextreme.devextremeStrings.storedData
import typings.devextreme.devextremeStrings.summingJunction
import typings.devextreme.devextremeStrings.terminator
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.triangle
import typings.devextreme.devextremeStrings.verticalContainer
import typings.devextreme.mod.DevExpress.core.dxSVGElement
import typings.devextreme.mod.DevExpress.core.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEditImage extends js.Object {
  var allowEditImage: js.UndefOr[Boolean] = js.native
  var allowEditText: js.UndefOr[Boolean] = js.native
  var allowResize: js.UndefOr[Boolean] = js.native
  var backgroundImageHeight: js.UndefOr[Double] = js.native
  var backgroundImageLeft: js.UndefOr[Double] = js.native
  var backgroundImageToolboxUrl: js.UndefOr[String] = js.native
  var backgroundImageTop: js.UndefOr[Double] = js.native
  var backgroundImageUrl: js.UndefOr[String] = js.native
  var backgroundImageWidth: js.UndefOr[Double] = js.native
  var baseType: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.native
  var category: js.UndefOr[String] = js.native
  var connectionPoints: js.UndefOr[js.Array[Y]] = js.native
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultImageUrl: js.UndefOr[String] = js.native
  var defaultText: js.UndefOr[String] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var imageHeight: js.UndefOr[Double] = js.native
  var imageLeft: js.UndefOr[Double] = js.native
  var imageTop: js.UndefOr[Double] = js.native
  var imageWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])
  ] = js.native
  var templateHeight: js.UndefOr[Double] = js.native
  var templateLeft: js.UndefOr[Double] = js.native
  var templateTop: js.UndefOr[Double] = js.native
  var templateWidth: js.UndefOr[Double] = js.native
  var textHeight: js.UndefOr[Double] = js.native
  var textLeft: js.UndefOr[Double] = js.native
  var textTop: js.UndefOr[Double] = js.native
  var textWidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AllowEditImage {
  @scala.inline
  def apply(): AllowEditImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditImage]
  }
  @scala.inline
  implicit class AllowEditImageOps[Self <: AllowEditImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowEditImage(value: Boolean): Self = this.set("allowEditImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditImage: Self = this.set("allowEditImage", js.undefined)
    @scala.inline
    def setAllowEditText(value: Boolean): Self = this.set("allowEditText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditText: Self = this.set("allowEditText", js.undefined)
    @scala.inline
    def setAllowResize(value: Boolean): Self = this.set("allowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResize: Self = this.set("allowResize", js.undefined)
    @scala.inline
    def setBackgroundImageHeight(value: Double): Self = this.set("backgroundImageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageHeight: Self = this.set("backgroundImageHeight", js.undefined)
    @scala.inline
    def setBackgroundImageLeft(value: Double): Self = this.set("backgroundImageLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageLeft: Self = this.set("backgroundImageLeft", js.undefined)
    @scala.inline
    def setBackgroundImageToolboxUrl(value: String): Self = this.set("backgroundImageToolboxUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageToolboxUrl: Self = this.set("backgroundImageToolboxUrl", js.undefined)
    @scala.inline
    def setBackgroundImageTop(value: Double): Self = this.set("backgroundImageTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageTop: Self = this.set("backgroundImageTop", js.undefined)
    @scala.inline
    def setBackgroundImageUrl(value: String): Self = this.set("backgroundImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageUrl: Self = this.set("backgroundImageUrl", js.undefined)
    @scala.inline
    def setBackgroundImageWidth(value: Double): Self = this.set("backgroundImageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageWidth: Self = this.set("backgroundImageWidth", js.undefined)
    @scala.inline
    def setBaseType(
      value: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ): Self = this.set("baseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseType: Self = this.set("baseType", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setConnectionPointsVarargs(value: Y*): Self = this.set("connectionPoints", js.Array(value :_*))
    @scala.inline
    def setConnectionPoints(value: js.Array[Y]): Self = this.set("connectionPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionPoints: Self = this.set("connectionPoints", js.undefined)
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    @scala.inline
    def setDefaultImageUrl(value: String): Self = this.set("defaultImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultImageUrl: Self = this.set("defaultImageUrl", js.undefined)
    @scala.inline
    def setDefaultText(value: String): Self = this.set("defaultText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultText: Self = this.set("defaultText", js.undefined)
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageHeight: Self = this.set("imageHeight", js.undefined)
    @scala.inline
    def setImageLeft(value: Double): Self = this.set("imageLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLeft: Self = this.set("imageLeft", js.undefined)
    @scala.inline
    def setImageTop(value: Double): Self = this.set("imageTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTop: Self = this.set("imageTop", js.undefined)
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageWidth: Self = this.set("imageWidth", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setTemplateFunction2(value: (/* container */ dxSVGElement, /* data */ Item) => _): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplate(value: template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateHeight(value: Double): Self = this.set("templateHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateHeight: Self = this.set("templateHeight", js.undefined)
    @scala.inline
    def setTemplateLeft(value: Double): Self = this.set("templateLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLeft: Self = this.set("templateLeft", js.undefined)
    @scala.inline
    def setTemplateTop(value: Double): Self = this.set("templateTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateTop: Self = this.set("templateTop", js.undefined)
    @scala.inline
    def setTemplateWidth(value: Double): Self = this.set("templateWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateWidth: Self = this.set("templateWidth", js.undefined)
    @scala.inline
    def setTextHeight(value: Double): Self = this.set("textHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextHeight: Self = this.set("textHeight", js.undefined)
    @scala.inline
    def setTextLeft(value: Double): Self = this.set("textLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLeft: Self = this.set("textLeft", js.undefined)
    @scala.inline
    def setTextTop(value: Double): Self = this.set("textTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTop: Self = this.set("textTop", js.undefined)
    @scala.inline
    def setTextWidth(value: Double): Self = this.set("textWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextWidth: Self = this.set("textWidth", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

