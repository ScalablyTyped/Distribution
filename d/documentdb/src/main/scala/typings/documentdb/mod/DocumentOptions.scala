package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOptions extends RequestOptions {
  /** Disables the automatic id generation. If id is missing in the body and this option is true, an error will be returned. */
  var disableAutomaticIdGeneration: js.UndefOr[Boolean] = js.native
}

object DocumentOptions {
  @scala.inline
  def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  @scala.inline
  implicit class DocumentOptionsOps[Self <: DocumentOptions] (val x: Self) extends AnyVal {
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
    def setDisableAutomaticIdGeneration(value: Boolean): Self = this.set("disableAutomaticIdGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutomaticIdGeneration: Self = this.set("disableAutomaticIdGeneration", js.undefined)
  }
  
}

