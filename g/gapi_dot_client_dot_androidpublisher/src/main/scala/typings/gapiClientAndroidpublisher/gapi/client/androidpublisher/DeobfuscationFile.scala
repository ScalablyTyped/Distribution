package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeobfuscationFile extends js.Object {
  /** The type of the deobfuscation file. */
  var symbolType: js.UndefOr[String] = js.native
}

object DeobfuscationFile {
  @scala.inline
  def apply(): DeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeobfuscationFile]
  }
  @scala.inline
  implicit class DeobfuscationFileOps[Self <: DeobfuscationFile] (val x: Self) extends AnyVal {
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
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
  }
  
}

