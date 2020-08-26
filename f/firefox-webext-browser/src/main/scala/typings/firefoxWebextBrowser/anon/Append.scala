package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Append extends js.Object {
  /** Whether to move the tabs before (false) or after (true) tabId in the succession. Defaults to false. */
  var append: js.UndefOr[Boolean] = js.native
  /**
    * Whether to link up the current predecessors or successor (depending on options.append) of tabId to the other
    * side of the chain after it is prepended or appended. If true, one of the following happens: if
    * options.append is false, the first tab in the array is set as the successor of any current predecessors of
    * tabId; if options.append is true, the current successor of tabId is set as the successor of the last tab in
    * the array. Defaults to false.
    */
  var insert: js.UndefOr[Boolean] = js.native
}

object Append {
  @scala.inline
  def apply(): Append = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Append]
  }
  @scala.inline
  implicit class AppendOps[Self <: Append] (val x: Self) extends AnyVal {
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setInsert(value: Boolean): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
  }
  
}

