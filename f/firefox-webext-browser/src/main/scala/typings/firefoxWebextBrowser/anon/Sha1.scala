package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha1 extends js.Object {
  var sha1: String = js.native
  var sha256: String = js.native
}

object Sha1 {
  @scala.inline
  def apply(sha1: String, sha256: String): Sha1 = {
    val __obj = js.Dynamic.literal(sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1]
  }
  @scala.inline
  implicit class Sha1Ops[Self <: Sha1] (val x: Self) extends AnyVal {
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
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
  }
  
}

