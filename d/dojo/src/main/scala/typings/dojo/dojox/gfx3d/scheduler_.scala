package typings.dojo.dojox.gfx3d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/scheduler.html
  *
  *
  */
@JSName("scheduler")
trait scheduler_ extends js.Object {
  /**
    *
    */
  var drawer: js.Object
  /**
    *
    */
  var scheduler: js.Object
  /**
    *
    */
  def BinarySearchTree(): Unit
}

object scheduler_ {
  @scala.inline
  def apply(BinarySearchTree: () => Unit, drawer: js.Object, scheduler: js.Object): scheduler_ = {
    val __obj = js.Dynamic.literal(BinarySearchTree = js.Any.fromFunction0(BinarySearchTree), drawer = drawer, scheduler = scheduler)
  
    __obj.asInstanceOf[scheduler_]
  }
}

