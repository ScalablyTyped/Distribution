package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A point representing a location.
  */
trait Point extends js.Object {
  def getX(): Double
  def getY(): Double
}

object Point {
  @scala.inline
  def apply(getX: () => Double, getY: () => Double): Point = {
    val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY))
  
    __obj.asInstanceOf[Point]
  }
}

