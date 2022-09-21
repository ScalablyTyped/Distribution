package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  var b: Double = js.native
  
  def copy(color: Color): Color = js.native
  
  def equals(color: Color): Boolean = js.native
  
  var g: Double = js.native
  
  def getHexString(): String = js.native
  
  var r: Double = js.native
  
  def set(color: String): Color = js.native
  def set(color: Double): Color = js.native
  def set(color: Color): Color = js.native
  
  def setHSL(h: Double, s: Double, l: Double): Color = js.native
  
  def setHex(hex: Double): Color = js.native
  
  def setRGB(r: Double, g: Double, b: Double): Color = js.native
  
  def setStyle(style: String): Color = js.native
}
