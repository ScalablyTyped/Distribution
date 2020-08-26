package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for boolean properties.
  */
@js.native
trait SchemaBooleanPropertyOptions extends js.Object {
  /**
    * If set, describes how the boolean should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaBooleanOperatorOptions] = js.native
}

object SchemaBooleanPropertyOptions {
  @scala.inline
  def apply(): SchemaBooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanPropertyOptions]
  }
  @scala.inline
  implicit class SchemaBooleanPropertyOptionsOps[Self <: SchemaBooleanPropertyOptions] (val x: Self) extends AnyVal {
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
    def setOperatorOptions(value: SchemaBooleanOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
  }
  
}

