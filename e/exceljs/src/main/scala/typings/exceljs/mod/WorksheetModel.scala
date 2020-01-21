package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetModel extends js.Object {
  var autoFilter: AutoFilter
  var headerFooter: HeaderFooter
  var id: Double
  var media: js.Array[Media]
  var name: String
  var pageSetup: Partial[PageSetup]
  // dataValidations: this.dataValidations.model,
  var properties: WorksheetProperties
  var rowBreaks: js.Array[RowBreak]
  var views: js.Array[WorksheetView]
}

object WorksheetModel {
  @scala.inline
  def apply(
    autoFilter: AutoFilter,
    headerFooter: HeaderFooter,
    id: Double,
    media: js.Array[Media],
    name: String,
    pageSetup: Partial[PageSetup],
    properties: WorksheetProperties,
    rowBreaks: js.Array[RowBreak],
    views: js.Array[WorksheetView]
  ): WorksheetModel = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], headerFooter = headerFooter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rowBreaks = rowBreaks.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorksheetModel]
  }
}

