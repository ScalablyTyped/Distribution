package typings.easyXHeaders.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZlibOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.native
  var dictionary: js.UndefOr[js.Any] = js.native
  var level: js.UndefOr[Double] = js.native
  var memLevel: js.UndefOr[Double] = js.native
  var strategy: js.UndefOr[Double] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object ZlibOptions {
  @scala.inline
  def apply(): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZlibOptions]
  }
  @scala.inline
  implicit class ZlibOptionsOps[Self <: ZlibOptions] (val x: Self) extends AnyVal {
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setDictionary(value: js.Any): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
  
}

