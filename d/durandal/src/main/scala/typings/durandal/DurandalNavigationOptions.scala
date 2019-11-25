package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalNavigationOptions extends js.Object {
  var replace: Boolean
  var trigger: Boolean
}

object DurandalNavigationOptions {
  @scala.inline
  def apply(replace: Boolean, trigger: Boolean): DurandalNavigationOptions = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DurandalNavigationOptions]
  }
}

