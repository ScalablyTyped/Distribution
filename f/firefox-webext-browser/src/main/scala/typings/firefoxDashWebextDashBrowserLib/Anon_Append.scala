package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Append extends js.Object {
  /** Whether to move the tabs before (false) or after (true) tabId in the succession. Defaults to false. */
  var append: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to link up the current predecessors or successor (depending on options.append) of tabId to the other
    * side of the chain after it is prepended or appended. If true, one of the following happens: if
    * options.append is false, the first tab in the array is set as the successor of any current predecessors of
    * tabId; if options.append is true, the current successor of tabId is set as the successor of the last tab in
    * the array. Defaults to false.
    */
  var insert: js.UndefOr[scala.Boolean] = js.undefined
}

