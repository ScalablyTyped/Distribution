package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoFillRequest extends js.Object {
  /**
               * The range to autofill. This will examine the range and detect
               * the location that has data and automatically fill that data
               * in to the rest of the range.
               */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
               * The source and destination areas to autofill.
               * This explicitly lists the source of the autofill and where to
               * extend that data.
               */
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.undefined
  /**
               * True if we should generate data with the "alternate" series.
               * This differs based on the type and amount of source data.
               */
  var useAlternateSeries: js.UndefOr[scala.Boolean] = js.undefined
}

