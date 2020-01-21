package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  def getHeight(): Double
  def getWidth(): Double
}

object Dimensions {
  @scala.inline
  def apply(getHeight: () => Double, getWidth: () => Double): Dimensions = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
  
    __obj.asInstanceOf[Dimensions]
  }
}

