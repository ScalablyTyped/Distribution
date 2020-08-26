package typings.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClientPagespeedonline.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagespeedApiFormatStringV2 extends js.Object {
  /** List of arguments for the format string. */
  var args: js.UndefOr[js.Array[Key]] = js.native
  /**
    * A localized format string with {{FOO}} placeholders, where 'FOO' is the key of the argument whose value should be substituted. For HYPERLINK arguments,
    * the format string will instead contain {{BEGIN_FOO}} and {{END_FOO}} for the argument with key 'FOO'.
    */
  var format: js.UndefOr[String] = js.native
}

object PagespeedApiFormatStringV2 {
  @scala.inline
  def apply(): PagespeedApiFormatStringV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedApiFormatStringV2]
  }
  @scala.inline
  implicit class PagespeedApiFormatStringV2Ops[Self <: PagespeedApiFormatStringV2] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: Key*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Key]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

