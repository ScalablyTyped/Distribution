package typings.dynogels.mod

import typings.dynogels.AnonPollingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynogelsGlobalOptions extends js.Object {
  @JSName("$dynogels")
  var $dynogels: AnonPollingInterval
}

object DynogelsGlobalOptions {
  @scala.inline
  def apply($dynogels: AnonPollingInterval): DynogelsGlobalOptions = {
    val __obj = js.Dynamic.literal($dynogels = $dynogels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynogelsGlobalOptions]
  }
}

