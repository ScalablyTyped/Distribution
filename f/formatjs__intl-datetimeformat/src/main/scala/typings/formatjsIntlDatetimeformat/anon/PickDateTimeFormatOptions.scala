package typings.formatjsIntlDatetimeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-datetimeformat.@formatjs/intl-datetimeformat/src/types.DateTimeFormatOptions, 'localeMatcher'> */
@js.native
trait PickDateTimeFormatOptions extends js.Object {
  var localeMatcher: js.UndefOr[String] = js.native
}

object PickDateTimeFormatOptions {
  @scala.inline
  def apply(): PickDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDateTimeFormatOptions]
  }
  @scala.inline
  implicit class PickDateTimeFormatOptionsOps[Self <: PickDateTimeFormatOptions] (val x: Self) extends AnyVal {
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
    def setLocaleMatcher(value: String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
  }
  
}

