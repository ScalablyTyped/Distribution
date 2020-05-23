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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowEditImage extends js.Object {
  var allowEditImage: js.UndefOr[Boolean] = js.undefined
  var allowEditText: js.UndefOr[Boolean] = js.undefined
  var backgroundImageHeight: js.UndefOr[Double] = js.undefined
  var backgroundImageLeft: js.UndefOr[Double] = js.undefined
  var backgroundImageTop: js.UndefOr[Double] = js.undefined
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  var backgroundImageWidth: js.UndefOr[Double] = js.undefined
  var baseType: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var connectionPoints: js.UndefOr[js.Array[Y]] = js.undefined
  var defaultHeight: js.UndefOr[Double] = js.undefined
  var defaultImageUrl: js.UndefOr[String] = js.undefined
  var defaultText: js.UndefOr[String] = js.undefined
  var defaultWidth: js.UndefOr[Double] = js.undefined
  var imageHeight: js.UndefOr[Double] = js.undefined
  var imageLeft: js.UndefOr[Double] = js.undefined
  var imageTop: js.UndefOr[Double] = js.undefined
  var imageWidth: js.UndefOr[Double] = js.undefined
  var textHeight: js.UndefOr[Double] = js.undefined
  var textLeft: js.UndefOr[Double] = js.undefined
  var textTop: js.UndefOr[Double] = js.undefined
  var textWidth: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AllowEditImage {
  @scala.inline
  def apply(
    allowEditImage: js.UndefOr[Boolean] = js.undefined,
    allowEditText: js.UndefOr[Boolean] = js.undefined,
    backgroundImageHeight: js.UndefOr[Double] = js.undefined,
    backgroundImageLeft: js.UndefOr[Double] = js.undefined,
    backgroundImageTop: js.UndefOr[Double] = js.undefined,
    backgroundImageUrl: String = null,
    backgroundImageWidth: js.UndefOr[Double] = js.undefined,
    baseType: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String = null,
    category: String = null,
    connectionPoints: js.Array[Y] = null,
    defaultHeight: js.UndefOr[Double] = js.undefined,
    defaultImageUrl: String = null,
    defaultText: String = null,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    imageHeight: js.UndefOr[Double] = js.undefined,
    imageLeft: js.UndefOr[Double] = js.undefined,
    imageTop: js.UndefOr[Double] = js.undefined,
    imageWidth: js.UndefOr[Double] = js.undefined,
    textHeight: js.UndefOr[Double] = js.undefined,
    textLeft: js.UndefOr[Double] = js.undefined,
    textTop: js.UndefOr[Double] = js.undefined,
    textWidth: js.UndefOr[Double] = js.undefined,
    title: String = null,
    `type`: String = null
  ): AllowEditImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditImage)) __obj.updateDynamic("allowEditImage")(allowEditImage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditText)) __obj.updateDynamic("allowEditText")(allowEditText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundImageHeight)) __obj.updateDynamic("backgroundImageHeight")(backgroundImageHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundImageLeft)) __obj.updateDynamic("backgroundImageLeft")(backgroundImageLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundImageTop)) __obj.updateDynamic("backgroundImageTop")(backgroundImageTop.get.asInstanceOf[js.Any])
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundImageWidth)) __obj.updateDynamic("backgroundImageWidth")(backgroundImageWidth.get.asInstanceOf[js.Any])
    if (baseType != null) __obj.updateDynamic("baseType")(baseType.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (connectionPoints != null) __obj.updateDynamic("connectionPoints")(connectionPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHeight)) __obj.updateDynamic("defaultHeight")(defaultHeight.get.asInstanceOf[js.Any])
    if (defaultImageUrl != null) __obj.updateDynamic("defaultImageUrl")(defaultImageUrl.asInstanceOf[js.Any])
    if (defaultText != null) __obj.updateDynamic("defaultText")(defaultText.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageHeight)) __obj.updateDynamic("imageHeight")(imageHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageLeft)) __obj.updateDynamic("imageLeft")(imageLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageTop)) __obj.updateDynamic("imageTop")(imageTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageWidth)) __obj.updateDynamic("imageWidth")(imageWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textHeight)) __obj.updateDynamic("textHeight")(textHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textLeft)) __obj.updateDynamic("textLeft")(textLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textTop)) __obj.updateDynamic("textTop")(textTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textWidth)) __obj.updateDynamic("textWidth")(textWidth.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEditImage]
  }
}

