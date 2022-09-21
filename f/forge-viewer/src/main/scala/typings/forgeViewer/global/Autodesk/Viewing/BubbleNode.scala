package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.BubbleNodeSearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.BubbleNode")
@js.native
open class BubbleNode protected ()
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
  @JSGlobal("Autodesk.Viewing.BubbleNode.AEC_MODEL_DATA")
  @js.native
  def AEC_MODEL_DATA: BubbleNodeSearchProps = js.native
  inline def AEC_MODEL_DATA_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AEC_MODEL_DATA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.GEOMETRY_F2D_NODE")
  @js.native
  def GEOMETRY_F2D_NODE: BubbleNodeSearchProps = js.native
  inline def GEOMETRY_F2D_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY_F2D_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.GEOMETRY_SVF_NODE")
  @js.native
  def GEOMETRY_SVF_NODE: BubbleNodeSearchProps = js.native
  inline def GEOMETRY_SVF_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY_SVF_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.IMAGE_NODE")
  @js.native
  def IMAGE_NODE: BubbleNodeSearchProps = js.native
  inline def IMAGE_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.LEAFLET_NODE")
  @js.native
  def LEAFLET_NODE: BubbleNodeSearchProps = js.native
  inline def LEAFLET_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAFLET_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.MASTER_VIEW_NODE")
  @js.native
  def MASTER_VIEW_NODE: BubbleNodeSearchProps = js.native
  inline def MASTER_VIEW_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MASTER_VIEW_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.MODEL_NODE")
  @js.native
  def MODEL_NODE: BubbleNodeSearchProps = js.native
  inline def MODEL_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.PDF_PAGE_NODE")
  @js.native
  def PDF_PAGE_NODE: BubbleNodeSearchProps = js.native
  inline def PDF_PAGE_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDF_PAGE_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.SHEET_NODE")
  @js.native
  def SHEET_NODE: BubbleNodeSearchProps = js.native
  inline def SHEET_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHEET_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Autodesk.Viewing.BubbleNode.VIEWABLE_NODE")
  @js.native
  def VIEWABLE_NODE: BubbleNodeSearchProps = js.native
  inline def VIEWABLE_NODE_=(x: BubbleNodeSearchProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEWABLE_NODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def parseLineageUrnFromEncodedUrn(encodedUrn: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLineageUrnFromEncodedUrn")(encodedUrn.asInstanceOf[js.Any]).asInstanceOf[String]
}
