package typings.dojo.doh.robot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/robot._runsemaphore.html
  *
  *
  */
trait runsemaphore extends js.Object {
  /**
    *
    */
  var lock: js.Array[_]
  /**
    *
    */
  def unlock(): js.Any
}

object runsemaphore {
  @scala.inline
  def apply(lock: js.Array[_], unlock: () => js.Any): runsemaphore = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any], unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[runsemaphore]
  }
}

