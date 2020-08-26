package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags extends js.Object {
  /**
    * Used to indicate that the user wants to create a file or directory if it was not previously there.
    */
  var create: js.UndefOr[Boolean] = js.native
  /**
    * By itself, exclusive must have no effect. Used with create, it must cause getFile and getDirectory to fail if the target path already exists.
    */
  var exclusive: js.UndefOr[Boolean] = js.native
}

object Flags {
  @scala.inline
  def apply(): Flags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
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
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
  }
  
}

