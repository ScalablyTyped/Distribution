package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AddFilterViewRequest extends js.Object {
  /**
               * The filter to add. The filterViewId
               * field is optional; if one is not set, an id will be randomly generated. (It
               * is an error to specify the ID of a filter that already exists.)
               */
  var filter: js.UndefOr[FilterView] = js.undefined
}

