package typings.dojo.dojo.robotx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/robotx._runsemaphore.html
  *
  *
  */
trait _runsemaphore extends js.Object {
  /**
    *
    */
  var lock: js.Array[_]
  /**
    *
    */
  def unlock(): js.Any
}

object _runsemaphore {
  @scala.inline
  def apply(lock: js.Array[_], unlock: () => js.Any): _runsemaphore = {
    val __obj = js.Dynamic.literal(lock = lock, unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[_runsemaphore]
  }
}

