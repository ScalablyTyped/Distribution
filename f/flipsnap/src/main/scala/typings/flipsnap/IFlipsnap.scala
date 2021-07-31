package typings.flipsnap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlipsnap extends StObject {
  
  var element: HTMLElement = js.native
  
  /**
    * Return true or false. true is returned when there is next element.
    */
  def hasNext(): Boolean = js.native
  
  /**
    * Return true or false. true is returned when there is previous element.
    */
  def hasPrev(): Boolean = js.native
  
  /**
    * Move to item of number.
    */
  def moveToPoint(point: Double): Unit = js.native
  def moveToPoint(point: Double, transitionDuration: Double): Unit = js.native
  
  /**
    * Recalculate values
    */
  def refresh(): Unit = js.native
  
  /**
    * Move to next item.
    */
  def toNext(): Unit = js.native
  def toNext(transitionDuration: Double): Unit = js.native
  
  /**
    * Move to previous item.
    */
  def toPrev(): Unit = js.native
  def toPrev(transitionDuration: Double): Unit = js.native
}
