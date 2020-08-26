package typings.execa.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncOptions[EncodingType] extends CommonOptions[EncodingType] {
  /**
  		Write some input to the `stdin` of your binary.
  		*/
  val input: js.UndefOr[String | Buffer] = js.native
}

object SyncOptions {
  @scala.inline
  def apply[EncodingType](): SyncOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions[EncodingType]]
  }
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions[_], EncodingType] (val x: Self with SyncOptions[EncodingType]) extends AnyVal {
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
    def setInput(value: String | Buffer): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
  }
  
}

