package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapsValidateResponse extends js.Object {
  var result: js.UndefOr[SchemaUrlMapValidationResult] = js.native
}

object SchemaUrlMapsValidateResponse {
  @scala.inline
  def apply(): SchemaUrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateResponse]
  }
  @scala.inline
  implicit class SchemaUrlMapsValidateResponseOps[Self <: SchemaUrlMapsValidateResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: SchemaUrlMapValidationResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

