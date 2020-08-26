package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arg extends js.Object {
  /** Argument matches any value provided. */
  var anyValue: js.UndefOr[js.Any] = js.native
  /** Argument exactly matches value provided. */
  var exactValue: js.UndefOr[js.Any] = js.native
}

object Arg {
  @scala.inline
  def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  @scala.inline
  implicit class ArgOps[Self <: Arg] (val x: Self) extends AnyVal {
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
    def setAnyValue(value: js.Any): Self = this.set("anyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyValue: Self = this.set("anyValue", js.undefined)
    @scala.inline
    def setExactValue(value: js.Any): Self = this.set("exactValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactValue: Self = this.set("exactValue", js.undefined)
  }
  
}

