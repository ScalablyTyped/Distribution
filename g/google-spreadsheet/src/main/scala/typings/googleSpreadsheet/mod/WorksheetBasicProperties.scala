package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetBasicProperties extends js.Object {
  /**
    * @description
    * additional properties of the worksheet if this sheet is a grid
    */
  var gridProperties: js.UndefOr[WorksheetGridProperties] = js.native
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
  var headerValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * @description
    * true if the worksheet is hidden in the UI, false if it's visible
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * @description
    * tab index in the worksheet doc (based on rightToLeft property)
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * @description
    * true if the worksheet is an RTL sheet instead of an LTR sheet
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  /**
    * @description
    * the color of the worksheet tab
    */
  var tabColor: js.UndefOr[Color] = js.native
  /**
    * @description
    * name of the worksheet tab
    */
  var title: js.UndefOr[String] = js.native
}

object WorksheetBasicProperties {
  @scala.inline
  def apply(): WorksheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetBasicProperties]
  }
  @scala.inline
  implicit class WorksheetBasicPropertiesOps[Self <: WorksheetBasicProperties] (val x: Self) extends AnyVal {
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
    def setGridProperties(value: WorksheetGridProperties): Self = this.set("gridProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridProperties: Self = this.set("gridProperties", js.undefined)
    @scala.inline
    def setHeaderValuesVarargs(value: String*): Self = this.set("headerValues", js.Array(value :_*))
    @scala.inline
    def setHeaderValues(value: js.Array[String]): Self = this.set("headerValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderValues: Self = this.set("headerValues", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightToLeft: Self = this.set("rightToLeft", js.undefined)
    @scala.inline
    def setTabColor(value: Color): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

