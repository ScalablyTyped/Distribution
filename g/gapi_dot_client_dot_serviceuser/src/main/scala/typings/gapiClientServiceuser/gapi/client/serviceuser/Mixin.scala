package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mixin extends js.Object {
  /** The fully qualified name of the interface which is included. */
  var name: js.UndefOr[String] = js.native
  /**
    * If non-empty specifies a path under which inherited HTTP paths
    * are rooted.
    */
  var root: js.UndefOr[String] = js.native
}

object Mixin {
  @scala.inline
  def apply(): Mixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin]
  }
  @scala.inline
  implicit class MixinOps[Self <: Mixin] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

