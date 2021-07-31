package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle extends StObject {
  
  def contains(x: Double, y: Double): Boolean = js.native
  def contains(x: Double, y: Double, width: Double): Boolean = js.native
  def contains(x: Double, y: Double, width: Double, height: Double): Boolean = js.native
  def contains(x: Double, y: Double, width: Unit, height: Double): Boolean = js.native
  
  def copy(rectangle: Rectangle): Rectangle = js.native
  
  def extend(x: Double, y: Double): Rectangle = js.native
  def extend(x: Double, y: Double, width: Double): Rectangle = js.native
  def extend(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  def extend(x: Double, y: Double, width: Unit, height: Double): Rectangle = js.native
  
  // properties
  var height: Double = js.native
  
  def intersection(rect: Rectangle): Rectangle = js.native
  
  def intersects(rect: Rectangle): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def pad(top: Double, left: Double, bottom: Double, right: Double): Rectangle = js.native
  
  def setValues(): Rectangle = js.native
  def setValues(x: Double): Rectangle = js.native
  def setValues(x: Double, y: Double): Rectangle = js.native
  def setValues(x: Double, y: Double, width: Double): Rectangle = js.native
  def setValues(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  def setValues(x: Double, y: Double, width: Unit, height: Double): Rectangle = js.native
  def setValues(x: Double, y: Unit, width: Double): Rectangle = js.native
  def setValues(x: Double, y: Unit, width: Double, height: Double): Rectangle = js.native
  def setValues(x: Double, y: Unit, width: Unit, height: Double): Rectangle = js.native
  def setValues(x: Unit, y: Double): Rectangle = js.native
  def setValues(x: Unit, y: Double, width: Double): Rectangle = js.native
  def setValues(x: Unit, y: Double, width: Double, height: Double): Rectangle = js.native
  def setValues(x: Unit, y: Double, width: Unit, height: Double): Rectangle = js.native
  def setValues(x: Unit, y: Unit, width: Double): Rectangle = js.native
  def setValues(x: Unit, y: Unit, width: Double, height: Double): Rectangle = js.native
  def setValues(x: Unit, y: Unit, width: Unit, height: Double): Rectangle = js.native
  
  def union(rect: Rectangle): Rectangle = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
