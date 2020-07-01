package typings.exceljs.mod

import typings.exceljs.anon.PartialHeaderFooter
import typings.exceljs.anon.PartialPageSetup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetModel extends js.Object {
  var autoFilter: AutoFilter
  var headerFooter: PartialHeaderFooter
  var id: Double
  var media: js.Array[Media]
  var name: String
  var pageSetup: PartialPageSetup
  // dataValidations: this.dataValidations.model,
  var properties: WorksheetProperties
  var rowBreaks: js.Array[RowBreak]
  var views: js.Array[WorksheetView]
}

object WorksheetModel {
  @scala.inline
  def apply(
    autoFilter: AutoFilter,
    headerFooter: PartialHeaderFooter,
    id: Double,
    media: js.Array[Media],
    name: String,
    pageSetup: PartialPageSetup,
    properties: WorksheetProperties,
    rowBreaks: js.Array[RowBreak],
    views: js.Array[WorksheetView]
  ): WorksheetModel = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], headerFooter = headerFooter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rowBreaks = rowBreaks.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetModel]
  }
}

