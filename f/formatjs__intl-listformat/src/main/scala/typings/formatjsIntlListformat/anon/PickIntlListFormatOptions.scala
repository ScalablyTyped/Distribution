package typings.formatjsIntlListformat.anon

import typings.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions, 'localeMatcher'> */
@js.native
trait PickIntlListFormatOptions extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}

object PickIntlListFormatOptions {
  @scala.inline
  def apply(): PickIntlListFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIntlListFormatOptions]
  }
  @scala.inline
  implicit class PickIntlListFormatOptionsOps[Self <: PickIntlListFormatOptions] (val x: Self) extends AnyVal {
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
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
  }
  
}

