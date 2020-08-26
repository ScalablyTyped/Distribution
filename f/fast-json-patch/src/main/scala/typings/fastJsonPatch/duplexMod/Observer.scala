package typings.fastJsonPatch.duplexMod

import typings.fastJsonPatch.coreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  var `object`: T = js.native
  var patches: js.Array[Operation] = js.native
  def callback(patches: js.Array[Operation]): Unit = js.native
  def unobserve(): Unit = js.native
}

object Observer {
  @scala.inline
  def apply[T](
    callback: js.Array[Operation] => Unit,
    `object`: T,
    patches: js.Array[Operation],
    unobserve: () => Unit
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), patches = patches.asInstanceOf[js.Any], unobserve = js.Any.fromFunction0(unobserve))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
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
    def setCallback(value: js.Array[Operation] => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setObject(value: T): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchesVarargs(value: Operation*): Self = this.set("patches", js.Array(value :_*))
    @scala.inline
    def setPatches(value: js.Array[Operation]): Self = this.set("patches", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnobserve(value: () => Unit): Self = this.set("unobserve", js.Any.fromFunction0(value))
  }
  
}

