package typings.dfVisible

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfVisibleStrings {
  
  @js.native
  sealed trait both
    extends StObject
       with Direction
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Direction
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Direction
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}
