package typings.enhancedResolve.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceRelative extends js.Object {
  var forceRelative: Boolean = js.native
  var name: String = js.native
}

object ForceRelative {
  @scala.inline
  def apply(forceRelative: Boolean, name: String): ForceRelative = {
    val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceRelative]
  }
  @scala.inline
  implicit class ForceRelativeOps[Self <: ForceRelative] (val x: Self) extends AnyVal {
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
    def setForceRelative(value: Boolean): Self = this.set("forceRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

