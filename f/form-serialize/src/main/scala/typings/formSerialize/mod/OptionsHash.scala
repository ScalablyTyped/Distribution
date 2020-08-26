package typings.formSerialize.mod

import typings.formSerialize.formSerializeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsHash extends Options[ResultHash] {
  @JSName("hash")
  var hash_OptionsHash: `true` = js.native
}

object OptionsHash {
  @scala.inline
  def apply(hash: `true`): OptionsHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsHash]
  }
  @scala.inline
  implicit class OptionsHashOps[Self <: OptionsHash] (val x: Self) extends AnyVal {
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
    def setHash(value: `true`): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
  
}

