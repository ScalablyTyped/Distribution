package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Append extends js.Object {
  /** Whether to move the tabs before (false) or after (true) tabId in the succession. Defaults to false. */
  var append: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to link up the current predecessors or successor (depending on options.append) of tabId to the other
    * side of the chain after it is prepended or appended. If true, one of the following happens: if
    * options.append is false, the first tab in the array is set as the successor of any current predecessors of
    * tabId; if options.append is true, the current successor of tabId is set as the successor of the last tab in
    * the array. Defaults to false.
    */
  var insert: js.UndefOr[Boolean] = js.undefined
}

object Anon_Append {
  @scala.inline
  def apply(append: js.UndefOr[Boolean] = js.undefined, insert: js.UndefOr[Boolean] = js.undefined): Anon_Append = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Append]
  }
}

