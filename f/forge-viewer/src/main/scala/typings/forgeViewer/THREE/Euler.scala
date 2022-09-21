package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Euler extends StObject {
  
  var order: String = js.native
  
  def setFromQuaternion(q: Quaternion): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: String): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: String, update: Boolean): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: Unit, update: Boolean): Euler = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
