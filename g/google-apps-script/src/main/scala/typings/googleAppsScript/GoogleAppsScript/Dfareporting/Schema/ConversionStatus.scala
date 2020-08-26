package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionStatus extends js.Object {
  var conversion: js.UndefOr[Conversion] = js.native
  var errors: js.UndefOr[js.Array[ConversionError]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object ConversionStatus {
  @scala.inline
  def apply(): ConversionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionStatus]
  }
  @scala.inline
  implicit class ConversionStatusOps[Self <: ConversionStatus] (val x: Self) extends AnyVal {
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
    def setConversion(value: Conversion): Self = this.set("conversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversion: Self = this.set("conversion", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: ConversionError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ConversionError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

