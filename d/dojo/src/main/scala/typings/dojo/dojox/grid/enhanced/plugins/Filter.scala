package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Filter.html
  *
  * Provide filter functionality for grid.
  *
  * Acceptable plugin parameters:
  *
  * itemsName: string:
  *  the name shown on the filter bar.
  * statusTipTimeout: number:
  *  when does the status tip show.
  * ruleCount: number:
  *  default to 3, should not change to more. The Claro theme limits it.
  * disabledConditions: object:
  *  If you don't need all of the conditions provided for a data type,
  *  you can explicitly declare them here:
  *  e.g.: disabledConditions: {string: ["contains", "is"], number: ["equalto"], ...}
  * isServerSide: boolean:
  *  Whether to use server side filtering. Default to false.
  * isStateful: boolean:
  *  If isServerSide is true, set the server side filter to be stateful or not. default to false.
  * url: string:
  *  If using stateful, this is the url to send commands. default to store.url.
  * ruleCountToConfirmClearFilter: Integer | null |Infinity:
  *  If the filter rule count is larger than or equal to this value, then a confirm dialog will show when clearing filter.
  *  If set to less than 1 or null, then always show the confirm dialog.
  *  If set to Infinity, then never show the confirm dialog.
  *  Default value is 2.
  * Acceptable cell parameters defined in layout:
  *
  * filterable: boolean:
  *  The column is not filterable only when this is set to false explicitly.
  * datatype: string:
  *  The data type of this column. Can be "string", "number", "date", "time", "boolean".
  *  Default to "string".
  * autoComplete: boolean:
  *  If need auto-complete in the ComboBox for String type, set this to true.
  * dataTypeArgs: object:
  *  Some arguments helping convert store data to something the filter UI understands.
  *  Different data type arguments can be provided to different data types.
  *  For date/time, this is a dojo.date.locale.__FormatOptions, so the DataTimeBox can understand the store data.
  *  For boolean, this object contains:
  * trueLabel: string:
  *   A label to display in the filter definition dialog for true value. Default to "True".
  * falseLabel: string:
  *   A label to display in the filter definition dialog for false value. Default to "False".
  *
  * disabledConditions: object:
  *  If you don't need all of the conditions provided by the filter UI on this column, you can explicitly say it out here.
  *  e.g.: disabledConditions: ["contains", "is"]
  *  This will disable the "contains" condition for this column, if this column is of string type.
  *  For full set of conditions, please refer to dojox.grid.enhanced.plugins.filter.FilterDefDialog._setupData.
  *
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.Filter")
@js.native
class Filter protected () extends _Plugin {
  def this(grid: js.Any, args: js.Any) = this()
}

