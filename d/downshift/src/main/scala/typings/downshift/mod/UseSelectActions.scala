package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectActions[Item] extends StObject {
  
  def closeMenu(): Unit = js.native
  
  def openMenu(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def selectItem(): Unit = js.native
  def selectItem(item: Item): Unit = js.native
  
  def setHighlightedIndex(index: Double): Unit = js.native
  
  def toggleMenu(): Unit = js.native
}
