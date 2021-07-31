package typings.forgeViewer.Autodesk.Viewing

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTree extends StObject {
  
  def enumNodeChildren(node: js.Any, callback: js.Function1[/* dbId */ Double, Unit]): Unit = js.native
  def enumNodeChildren(node: js.Any, callback: js.Function1[/* dbId */ Double, Unit], recursive: Boolean): Unit = js.native
  
  def enumNodeFragments(node: js.Any, callback: js.Function1[/* fragId */ Double, Unit]): Unit = js.native
  def enumNodeFragments(node: js.Any, callback: js.Function1[/* fragId */ Double, Unit], recursive: Boolean): Unit = js.native
  
  def getChildCount(dbId: Double): Double = js.native
  
  def getNodeBox(dbId: Double, nodeBox: Float32Array): Unit = js.native
  
  def getNodeParentId(dbId: Double): Double = js.native
  
  def getRootId(): Double = js.native
  
  var maxDepth: Double = js.native
  
  var nodeAccess: InstanceTreeAccess = js.native
  
  var numHidden: Double = js.native
  
  var numOff: Double = js.native
  
  var objectCount: Double = js.native
  
  def setFlagGlobal(flag: js.Any, value: js.Any): Unit = js.native
  
  def setFlagNode(dbId: Double, flag: js.Any, value: js.Any): Boolean = js.native
}
