package typings.direction

import typings.direction.mod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object directionStrings {
  @js.native
  sealed trait ltr extends Direction
  
  @js.native
  sealed trait neutral extends Direction
  
  @js.native
  sealed trait rtl extends Direction
  
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  @scala.inline
  def neutral: neutral = "neutral".asInstanceOf[neutral]
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
}

