package typings.fileEntryCache.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  val hash: js.UndefOr[String] = js.native
  val mtime: js.UndefOr[Double] = js.native
  val size: js.UndefOr[Double] = js.native
}

object Hash {
  @scala.inline
  def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

