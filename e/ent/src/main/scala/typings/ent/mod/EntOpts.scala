package typings.ent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntOpts extends js.Object {
  /**
    * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
    */
  var named: js.UndefOr[Boolean] = js.native
  /**
    * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
    */
  var numeric: js.UndefOr[Boolean] = js.native
  /**
    * If opts.special is set to an Object, the key names will be forced to be encoded (defaults to forcing: <>'"&)
    */
  var special: js.UndefOr[js.Any] = js.native
}

object EntOpts {
  @scala.inline
  def apply(): EntOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntOpts]
  }
  @scala.inline
  implicit class EntOptsOps[Self <: EntOpts] (val x: Self) extends AnyVal {
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
    def setNamed(value: Boolean): Self = this.set("named", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamed: Self = this.set("named", js.undefined)
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setSpecial(value: js.Any): Self = this.set("special", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecial: Self = this.set("special", js.undefined)
  }
  
}

