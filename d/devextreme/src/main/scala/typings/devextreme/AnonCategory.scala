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
import typings.devextreme.devextremeStrings.containers
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.data
import typings.devextreme.devextremeStrings.database
import typings.devextreme.devextremeStrings.decision
import typings.devextreme.devextremeStrings.delay
import typings.devextreme.devextremeStrings.diamond
import typings.devextreme.devextremeStrings.display
import typings.devextreme.devextremeStrings.document
import typings.devextreme.devextremeStrings.ellipse
import typings.devextreme.devextremeStrings.flowchart
import typings.devextreme.devextremeStrings.general
import typings.devextreme.devextremeStrings.hardDisk
import typings.devextreme.devextremeStrings.heart
import typings.devextreme.devextremeStrings.horizontalContainer
import typings.devextreme.devextremeStrings.icons
import typings.devextreme.devextremeStrings.internalStorage
import typings.devextreme.devextremeStrings.manualInput
import typings.devextreme.devextremeStrings.manualOperation
import typings.devextreme.devextremeStrings.merge
import typings.devextreme.devextremeStrings.multipleDocuments
import typings.devextreme.devextremeStrings.octagon
import typings.devextreme.devextremeStrings.or
import typings.devextreme.devextremeStrings.orgChart
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
import typings.devextreme.devextremeStrings.texts
import typings.devextreme.devextremeStrings.triangle
import typings.devextreme.devextremeStrings.verticalContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategory extends js.Object {
  var category: js.UndefOr[general | flowchart | orgChart | containers | custom | String] = js.undefined
  var displayMode: js.UndefOr[icons | texts] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var shapes: js.UndefOr[
    js.Array[
      text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ]
  ] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonCategory {
  @scala.inline
  def apply(
    category: general | flowchart | orgChart | containers | custom | String = null,
    displayMode: icons | texts = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    shapes: js.Array[
      text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ] = null,
    title: String = null
  ): AnonCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
}

