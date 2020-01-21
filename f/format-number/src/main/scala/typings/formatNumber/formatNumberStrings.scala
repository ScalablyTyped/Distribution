package typings.formatNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formatNumberStrings {
  @js.native
  sealed trait brackets extends js.Object
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait right extends js.Object
  
  @scala.inline
  def brackets: brackets = "brackets".asInstanceOf[brackets]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}

