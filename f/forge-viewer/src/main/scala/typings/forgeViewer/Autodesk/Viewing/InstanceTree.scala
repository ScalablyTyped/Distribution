package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.FragmentList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTree extends StObject {
  
  def enumNodeChildren(node: Any, callback: js.Function1[/* dbId */ Double, Unit]): Unit = js.native
  def enumNodeChildren(node: Any, callback: js.Function1[/* dbId */ Double, Unit], recursive: Boolean): Unit = js.native
  
  def enumNodeFragments(node: Any, callback: js.Function1[/* fragId */ Double, Unit]): Unit = js.native
  def enumNodeFragments(node: Any, callback: js.Function1[/* fragId */ Double, Unit], recursive: Boolean): Unit = js.native
  
  var fragList: FragmentList = js.native
  
  def getChildCount(dbId: Double): Double = js.native
  
  def getNodeBox(dbId: Double, nodeBox: js.typedarray.Float32Array): Unit = js.native
  
  def getNodeIndex(dbId: Double): Double = js.native
  
  def getNodeName(dbId: Double): String = js.native
  
  def getNodeParentId(dbId: Double): Double = js.native
  
  def getNodeType(dbId: Double): Double = js.native
  
  def getRootId(): Double = js.native
  
  def isNodeExplodeLocked(dbId: Double): Boolean = js.native
  
  def isNodeHidden(dbId: Double): Boolean = js.native
  
  def isNodeOff(dbId: Double): Boolean = js.native
  
  def isNodeSelectable(dbId: Double): Boolean = js.native
  
  def isNodeSelectionLocked(dbId: Double): Boolean = js.native
  
  def isNodeVisibleLocked(dbId: Double): Boolean = js.native
  
  def lockNodeExplode(dbId: Double, value: Boolean): Boolean = js.native
  
  def lockNodeSelection(dbId: Double, value: Boolean): Boolean = js.native
  
  def lockNodeVisible(dbId: Double, value: Boolean): Boolean = js.native
  
  var maxDepth: Double = js.native
  
  var nodeAccess: InstanceTreeAccess = js.native
  
  var numHidden: Double = js.native
  
  var numOff: Double = js.native
  
  var objectCount: Double = js.native
  
  var root: InstanceTreeNode = js.native
  
  def setFlagGlobal(flag: Any, value: Any): Unit = js.native
  
  def setFlagNode(dbId: Double, flag: Any, value: Any): Boolean = js.native
  
  def setNodeHidden(dbId: Double, flag: Any, value: Boolean): Boolean = js.native
  
  def setNodeOff(dbId: Double, flag: Any, value: Boolean): Boolean = js.native
}
