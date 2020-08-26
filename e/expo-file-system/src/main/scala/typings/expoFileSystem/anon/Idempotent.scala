package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idempotent extends js.Object {
  var idempotent: js.UndefOr[Boolean] = js.native
}

object Idempotent {
  @scala.inline
  def apply(): Idempotent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Idempotent]
  }
  @scala.inline
  implicit class IdempotentOps[Self <: Idempotent] (val x: Self) extends AnyVal {
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
    def setIdempotent(value: Boolean): Self = this.set("idempotent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotent: Self = this.set("idempotent", js.undefined)
  }
  
}

