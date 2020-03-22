package typings.devextreme

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

trait AnonAllowEditImage extends js.Object {
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
  var connectionPoints: js.UndefOr[js.Array[AnonY]] = js.undefined
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

object AnonAllowEditImage {
  @scala.inline
  def apply(
    allowEditImage: js.UndefOr[Boolean] = js.undefined,
    allowEditText: js.UndefOr[Boolean] = js.undefined,
    backgroundImageHeight: Int | Double = null,
    backgroundImageLeft: Int | Double = null,
    backgroundImageTop: Int | Double = null,
    backgroundImageUrl: String = null,
    backgroundImageWidth: Int | Double = null,
    baseType: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String = null,
    category: String = null,
    connectionPoints: js.Array[AnonY] = null,
    defaultHeight: Int | Double = null,
    defaultImageUrl: String = null,
    defaultText: String = null,
    defaultWidth: Int | Double = null,
    imageHeight: Int | Double = null,
    imageLeft: Int | Double = null,
    imageTop: Int | Double = null,
    imageWidth: Int | Double = null,
    textHeight: Int | Double = null,
    textLeft: Int | Double = null,
    textTop: Int | Double = null,
    textWidth: Int | Double = null,
    title: String = null,
    `type`: String = null
  ): AnonAllowEditImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditImage)) __obj.updateDynamic("allowEditImage")(allowEditImage.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditText)) __obj.updateDynamic("allowEditText")(allowEditText.asInstanceOf[js.Any])
    if (backgroundImageHeight != null) __obj.updateDynamic("backgroundImageHeight")(backgroundImageHeight.asInstanceOf[js.Any])
    if (backgroundImageLeft != null) __obj.updateDynamic("backgroundImageLeft")(backgroundImageLeft.asInstanceOf[js.Any])
    if (backgroundImageTop != null) __obj.updateDynamic("backgroundImageTop")(backgroundImageTop.asInstanceOf[js.Any])
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (backgroundImageWidth != null) __obj.updateDynamic("backgroundImageWidth")(backgroundImageWidth.asInstanceOf[js.Any])
    if (baseType != null) __obj.updateDynamic("baseType")(baseType.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (connectionPoints != null) __obj.updateDynamic("connectionPoints")(connectionPoints.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultImageUrl != null) __obj.updateDynamic("defaultImageUrl")(defaultImageUrl.asInstanceOf[js.Any])
    if (defaultText != null) __obj.updateDynamic("defaultText")(defaultText.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (imageHeight != null) __obj.updateDynamic("imageHeight")(imageHeight.asInstanceOf[js.Any])
    if (imageLeft != null) __obj.updateDynamic("imageLeft")(imageLeft.asInstanceOf[js.Any])
    if (imageTop != null) __obj.updateDynamic("imageTop")(imageTop.asInstanceOf[js.Any])
    if (imageWidth != null) __obj.updateDynamic("imageWidth")(imageWidth.asInstanceOf[js.Any])
    if (textHeight != null) __obj.updateDynamic("textHeight")(textHeight.asInstanceOf[js.Any])
    if (textLeft != null) __obj.updateDynamic("textLeft")(textLeft.asInstanceOf[js.Any])
    if (textTop != null) __obj.updateDynamic("textTop")(textTop.asInstanceOf[js.Any])
    if (textWidth != null) __obj.updateDynamic("textWidth")(textWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowEditImage]
  }
}

