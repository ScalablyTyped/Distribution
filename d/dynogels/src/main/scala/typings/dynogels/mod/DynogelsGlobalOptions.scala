package typings.dynogels.mod

import typings.dynogels.anon.PollingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynogelsGlobalOptions extends js.Object {
  @JSName("$dynogels")
  var $dynogels: PollingInterval = js.native
}

object DynogelsGlobalOptions {
  @scala.inline
  def apply($dynogels: PollingInterval): DynogelsGlobalOptions = {
    val __obj = js.Dynamic.literal($dynogels = $dynogels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynogelsGlobalOptions]
  }
  @scala.inline
  implicit class DynogelsGlobalOptionsOps[Self <: DynogelsGlobalOptions] (val x: Self) extends AnyVal {
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
    def set$dynogels(value: PollingInterval): Self = this.set("$dynogels", value.asInstanceOf[js.Any])
  }
  
}

