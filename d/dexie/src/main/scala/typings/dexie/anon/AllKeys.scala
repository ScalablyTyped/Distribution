package typings.dexie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllKeys[B /* <: Boolean */] extends js.Object {
  var allKeys: B = js.native
}

object AllKeys {
  @scala.inline
  def apply[/* <: scala.Boolean */ B](allKeys: B): AllKeys[B] = {
    val __obj = js.Dynamic.literal(allKeys = allKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllKeys[B]]
  }
  @scala.inline
  implicit class AllKeysOps[Self <: AllKeys[_], /* <: scala.Boolean */ B] (val x: Self with AllKeys[B]) extends AnyVal {
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
    def setAllKeys(value: B): Self = this.set("allKeys", value.asInstanceOf[js.Any])
  }
  
}

