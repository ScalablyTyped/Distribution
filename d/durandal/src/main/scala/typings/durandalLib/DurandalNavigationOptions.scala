package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalNavigationOptions extends js.Object {
  var replace: scala.Boolean
  var trigger: scala.Boolean
}

object DurandalNavigationOptions {
  @scala.inline
  def apply(replace: scala.Boolean, trigger: scala.Boolean): DurandalNavigationOptions = {
    val __obj = js.Dynamic.literal(replace = replace, trigger = trigger)
  
    __obj.asInstanceOf[DurandalNavigationOptions]
  }
}

