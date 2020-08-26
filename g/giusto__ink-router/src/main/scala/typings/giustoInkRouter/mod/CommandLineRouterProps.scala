package typings.giustoInkRouter.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineRouterProps extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var initialEntries: js.UndefOr[js.Array[String]] = js.native
  var initialIndex: js.UndefOr[Double] = js.native
  var options: js.UndefOr[Record[String, _]] = js.native
}

object CommandLineRouterProps {
  @scala.inline
  def apply(): CommandLineRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandLineRouterProps]
  }
  @scala.inline
  implicit class CommandLineRouterPropsOps[Self <: CommandLineRouterProps] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setInitialEntriesVarargs(value: String*): Self = this.set("initialEntries", js.Array(value :_*))
    @scala.inline
    def setInitialEntries(value: js.Array[String]): Self = this.set("initialEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialEntries: Self = this.set("initialEntries", js.undefined)
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    @scala.inline
    def setOptions(value: Record[String, _]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

