package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleNode extends StObject {
  
  var children: js.Array[BubbleNode] = js.native
  
  var data: ViewerItem = js.native
  
  def findByGuid(guid: String): BubbleNode = js.native
  
  def findParentGeom2Dor3D(): BubbleNode = js.native
  
  def findPropertyDbPath(): String = js.native
  
  def findViewableParent(): BubbleNode = js.native
  
  def getDefaultGeometry(): Any = js.native
  
  def getDocument(): Document = js.native
  
  def getInputFileType(): String = js.native
  
  def getLodNode(): Boolean = js.native
  
  def getModelName(): String = js.native
  
  def getNamedViews(): js.Array[String] = js.native
  
  def getPlacementTransform(): js.Object = js.native
  
  def getRootNode(): BubbleNode = js.native
  
  def getTag(tag: String): Any = js.native
  
  def getViewableRootPath(): String = js.native
  
  def guid(): String = js.native
  
  var id: Double = js.native
  
  def is2D(): Boolean = js.native
  
  def is2DGeom(): Boolean = js.native
  
  def is3D(): Boolean = js.native
  
  def is3DGeom(): Boolean = js.native
  
  def isGeomLeaf(): Boolean = js.native
  
  def isGeometry(): Boolean = js.native
  
  var isLeaf: Boolean = js.native
  
  def isMetadata(): Boolean = js.native
  
  def isRevitPdf(): Boolean = js.native
  
  def isViewPreset(): Boolean = js.native
  
  def isViewable(): Boolean = js.native
  
  def lineageUrn(): String = js.native
  def lineageUrn(encode: Boolean): String = js.native
  
  var lodNode: js.Object = js.native
  
  def name(): String = js.native
  
  var parent: BubbleNode = js.native
  
  def search(propsToMatch: BubbleNodeSearchProps): js.Array[BubbleNode] = js.native
  
  def searchByTag(tagsToMatch: js.Object): js.Array[BubbleNode] = js.native
  
  def setTag(tag: String, value: Any): Unit = js.native
  
  var sharedPropertyDbPath: String = js.native
  
  def traverse(cb: js.Function1[/* bubble */ this.type, Boolean]): Boolean = js.native
  
  def urn(): String = js.native
  def urn(searchParent: Boolean): String = js.native
  
  def useAsDefault(): Boolean = js.native
}
