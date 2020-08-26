package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enum extends js.Object {
  /** Enum value definitions. */
  var enumvalue: js.UndefOr[js.Array[EnumValue]] = js.native
  /** Enum type name. */
  var name: js.UndefOr[String] = js.native
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.native
  /** The source context. */
  var sourceContext: js.UndefOr[SourceContext] = js.native
  /** The source syntax. */
  var syntax: js.UndefOr[String] = js.native
}

object Enum {
  @scala.inline
  def apply(): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enum]
  }
  @scala.inline
  implicit class EnumOps[Self <: Enum] (val x: Self) extends AnyVal {
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
    def setEnumvalueVarargs(value: EnumValue*): Self = this.set("enumvalue", js.Array(value :_*))
    @scala.inline
    def setEnumvalue(value: js.Array[EnumValue]): Self = this.set("enumvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumvalue: Self = this.set("enumvalue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSourceContext(value: SourceContext): Self = this.set("sourceContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceContext: Self = this.set("sourceContext", js.undefined)
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

