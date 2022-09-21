package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Curve[T /* <: Vector */] extends StObject {
  
  def getLength(): Double = js.native
  
  def getLengths(): js.Array[Double] = js.native
  def getLengths(divisions: Double): js.Array[Double] = js.native
  
  def getPoint(t: Double): T = js.native
  
  def getPointAt(u: Double): T = js.native
  
  def getPoints(): js.Array[T] = js.native
  def getPoints(divisions: Double): js.Array[T] = js.native
  
  def getSpacedPoints(): js.Array[T] = js.native
  def getSpacedPoints(divisions: Double): js.Array[T] = js.native
  
  def getTangent(t: Double): T = js.native
  
  def getTangentAt(u: Double): T = js.native
  
  def getUtoTmapping(u: Double, distance: Double): Double = js.native
  
  def updateArcLengths(): Unit = js.native
}
