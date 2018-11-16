package typings
package flipsnapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlipsnap extends js.Object {
  var element: HTMLElement = js.native
  /**
       * Return true or false. true is returned when there is next element.
       */
  def hasNext(): scala.Boolean = js.native
  /**
       * Return true or false. true is returned when there is previous element.
       */
  def hasPrev(): scala.Boolean = js.native
  /**
       * Move to item of number.
       */
  def moveToPoint(point: scala.Double): scala.Unit = js.native
  /**
       * Move to item of number.
       */
  def moveToPoint(point: scala.Double, transitionDuration: scala.Double): scala.Unit = js.native
  /**
       * Recalculate values
       */
  def refresh(): scala.Unit = js.native
  /**
       * Move to next item.
       */
  def toNext(): scala.Unit = js.native
  /**
       * Move to next item.
       */
  def toNext(transitionDuration: scala.Double): scala.Unit = js.native
  /**
       * Move to previous item.
       */
  def toPrev(): scala.Unit = js.native
  /**
       * Move to previous item.
       */
  def toPrev(transitionDuration: scala.Double): scala.Unit = js.native
}

