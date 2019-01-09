package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellPropertiesTableCellBackgroundFill extends js.Object {
  // The kind of background fill.
  var kind: googleDashAppsDashScriptLib.Anon_SolidfillSolidFill
  // The background fill property state.
  //
  // Updating the fill on a table cell will implicitly update this field
  // to `RENDERED`, unless another value is specified in the same request. To
  // have no fill on a table cell, set this field to `NOT_RENDERED`. In this
  // case, any other fill fields set in the same request will be ignored.
  var property_state: PropertyState
}

