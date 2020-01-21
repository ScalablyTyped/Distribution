package typings.dfVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dfVisibleStrings {
  @js.native
  sealed trait both extends Direction
  
  @js.native
  sealed trait horizontal extends Direction
  
  @js.native
  sealed trait vertical extends Direction
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

