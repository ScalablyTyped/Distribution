package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.BubbleNodeSearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.BubbleNode")
@js.native
class BubbleNode protected ()
  extends StObject
     with typings.forgeViewer.Autodesk.Viewing.BubbleNode {
  def this(rawNode: js.Object) = this()
  def this(rawNode: js.Object, parent: typings.forgeViewer.Autodesk.Viewing.BubbleNode) = this()
}
object BubbleNode {
  
  @JSGlobal("Autodesk.Viewing.BubbleNode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.GEOMETRY_F2D_NODE")
  @js.native
  def GEOMETRY_F2D_NODE: BubbleNodeSearchProps = js.native
  @scala.inline
  def GEOMETRY_F2D_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY_F2D_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.GEOMETRY_SVF_NODE")
  @js.native
  def GEOMETRY_SVF_NODE: BubbleNodeSearchProps = js.native
  @scala.inline
  def GEOMETRY_SVF_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY_SVF_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.MODEL_NODE")
  @js.native
  def MODEL_NODE: BubbleNodeSearchProps = js.native
  @scala.inline
  def MODEL_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.SHEET_NODE")
  @js.native
  def SHEET_NODE: BubbleNodeSearchProps = js.native
  @scala.inline
  def SHEET_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHEET_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.VIEWABLE_NODE")
  @js.native
  def VIEWABLE_NODE: BubbleNodeSearchProps = js.native
  @scala.inline
  def VIEWABLE_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEWABLE_NODE")(x.asInstanceOf[js.Any])
}
