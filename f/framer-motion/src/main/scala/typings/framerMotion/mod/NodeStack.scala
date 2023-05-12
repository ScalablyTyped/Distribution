package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeStack extends StObject {
  
  def add(node: IProjectionNode[Any]): Unit = js.native
  
  def exitAnimationComplete(): Unit = js.native
  
  var lead: js.UndefOr[IProjectionNode[Any]] = js.native
  
  var members: js.Array[IProjectionNode[Any]] = js.native
  
  var prevLead: js.UndefOr[IProjectionNode[Any]] = js.native
  
  def promote(node: IProjectionNode[Any]): Unit = js.native
  def promote(node: IProjectionNode[Any], preserveFollowOpacity: Boolean): Unit = js.native
  
  def relegate(node: IProjectionNode[Any]): Boolean = js.native
  
  def remove(node: IProjectionNode[Any]): Unit = js.native
  
  /**
    * Clear any leads that have been removed this render to prevent them from being
    * used in future animations and to prevent memory leaks
    */
  def removeLeadSnapshot(): Unit = js.native
  
  def scheduleRender(): Unit = js.native
}
