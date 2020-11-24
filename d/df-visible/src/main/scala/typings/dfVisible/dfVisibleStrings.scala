package typings.dfVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfVisibleStrings {
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait both extends Direction
  
  @js.native
  sealed trait horizontal extends Direction
  
  @js.native
  sealed trait vertical extends Direction
}
