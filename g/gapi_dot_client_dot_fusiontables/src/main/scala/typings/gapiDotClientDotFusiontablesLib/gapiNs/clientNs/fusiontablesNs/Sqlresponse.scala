package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sqlresponse extends js.Object {
  /** Columns in the table. */
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The kind of item this is. For responses to SQL queries, this is always fusiontables#sqlresponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The rows in the table. For each cell we print out whatever cell value (e.g., numeric, string) exists. Thus it is important that each cell contains only
               * one value.
               */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

