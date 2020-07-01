package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetBasicProperties extends js.Object {
  /**
    * @description
    * additional properties of the worksheet if this sheet is a grid
    */
  var gridProperties: js.UndefOr[WorksheetGridProperties] = js.undefined
  // #region BASIC PROPERTIES
  /* separates basic (editable) properties as they are used as inputs to various methods
    * non-basic properties should be added to the extending interface below
    */
  /**
    * @description
    * first row values
    * - used in row-based interactions
    * - defines the dynamic properties of the Worksheet's GoogleSpreadsheetRows
    */
  var headerValues: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @description
    * true if the worksheet is hidden in the UI, false if it's visible
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * @description
    * tab index in the worksheet doc (based on rightToLeft property)
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @description
    * true if the worksheet is an RTL sheet instead of an LTR sheet
    */
  var rightToLeft: js.UndefOr[Boolean] = js.undefined
  /**
    * @description
    * the color of the worksheet tab
    */
  var tabColor: js.UndefOr[Color] = js.undefined
  /**
    * @description
    * name of the worksheet tab
    */
  var title: js.UndefOr[String] = js.undefined
}

object WorksheetBasicProperties {
  @scala.inline
  def apply(
    gridProperties: WorksheetGridProperties = null,
    headerValues: js.Array[String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    tabColor: Color = null,
    title: String = null
  ): WorksheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    if (gridProperties != null) __obj.updateDynamic("gridProperties")(gridProperties.asInstanceOf[js.Any])
    if (headerValues != null) __obj.updateDynamic("headerValues")(headerValues.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft.get.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetBasicProperties]
  }
}

