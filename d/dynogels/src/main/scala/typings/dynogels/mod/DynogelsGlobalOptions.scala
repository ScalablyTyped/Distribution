package typings.dynogels.mod

import typings.dynogels.anon.PollingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynogelsGlobalOptions extends js.Object {
  @JSName("$dynogels")
  var $dynogels: PollingInterval
}

object DynogelsGlobalOptions {
  @scala.inline
  def apply($dynogels: PollingInterval): DynogelsGlobalOptions = {
    val __obj = js.Dynamic.literal($dynogels = $dynogels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynogelsGlobalOptions]
  }
}

