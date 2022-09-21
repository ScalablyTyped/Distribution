package typings.figma.mod.global

import typings.figma.figmaStrings.`1Dot0Dot0`
import typings.figma.figmaStrings.close_
import typings.figma.figmaStrings.currentpagechange
import typings.figma.figmaStrings.selectionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginAPI extends StObject {
  
  val apiVersion: `1Dot0Dot0` = js.native
  
  val clientStorage: ClientStorageAPI = js.native
  
  def closePlugin(): Unit = js.native
  def closePlugin(message: String): Unit = js.native
  
  val command: String = js.native
  
  /**
    * [DEPRECATED]: This API often fails to create a valid boolean operation. Use figma.union, figma.subtract, figma.intersect and figma.exclude instead.
    */
  def createBooleanOperation(): BooleanOperationNode = js.native
  
  def createComponent(): ComponentNode = js.native
  
  def createEffectStyle(): EffectStyle = js.native
  
  def createEllipse(): EllipseNode = js.native
  
  def createFrame(): FrameNode = js.native
  
  def createGridStyle(): GridStyle = js.native
  
  def createImage(data: js.typedarray.Uint8Array): Image = js.native
  
  def createLine(): LineNode = js.native
  
  def createNodeFromSvg(svg: String): FrameNode = js.native
  
  def createPage(): PageNode = js.native
  
  def createPaintStyle(): PaintStyle = js.native
  
  def createPolygon(): PolygonNode = js.native
  
  def createRectangle(): RectangleNode = js.native
  
  def createSlice(): SliceNode = js.native
  
  def createStar(): StarNode = js.native
  
  def createText(): TextNode = js.native
  
  def createTextStyle(): TextStyle = js.native
  
  def createVector(): VectorNode = js.native
  
  var currentPage: PageNode = js.native
  
  def exclude(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin): BooleanOperationNode = js.native
  def exclude(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin, index: Double): BooleanOperationNode = js.native
  
  def flatten(nodes: js.Array[BaseNode]): VectorNode = js.native
  def flatten(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin): VectorNode = js.native
  def flatten(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin, index: Double): VectorNode = js.native
  def flatten(nodes: js.Array[BaseNode], parent: Unit, index: Double): VectorNode = js.native
  
  def getImageByHash(hash: String): Image = js.native
  
  def getLocalEffectStyles(): js.Array[EffectStyle] = js.native
  
  def getLocalGridStyles(): js.Array[GridStyle] = js.native
  
  // The styles are returned in the same order as displayed in the UI. Only
  // local styles are returned. Never styles from team library.
  def getLocalPaintStyles(): js.Array[PaintStyle] = js.native
  
  def getLocalTextStyles(): js.Array[TextStyle] = js.native
  
  def getNodeById(id: String): BaseNode | Null = js.native
  
  def getStyleById(id: String): BaseStyle | Null = js.native
  
  def group(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin): GroupNode = js.native
  def group(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin, index: Double): GroupNode = js.native
  
  val hasMissingFont: Boolean = js.native
  
  def importComponentByKeyAsync(key: String): js.Promise[ComponentNode] = js.native
  
  def importStyleByKeyAsync(key: String): js.Promise[BaseStyle] = js.native
  
  def intersect(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin): BooleanOperationNode = js.native
  def intersect(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin, index: Double): BooleanOperationNode = js.native
  
  def listAvailableFontsAsync(): js.Promise[js.Array[Font]] = js.native
  
  def loadFontAsync(fontName: FontName): js.Promise[Unit] = js.native
  
  val mixed: js.Symbol = js.native
  
  def notify(message: String): NotificationHandler = js.native
  def notify(message: String, options: NotificationOptions): NotificationHandler = js.native
  
  def off(`type`: selectionchange | currentpagechange | close_, callback: js.Function0[Unit]): Unit = js.native
  
  def on(`type`: selectionchange | currentpagechange | close_, callback: js.Function0[Unit]): Unit = js.native
  
  def once(`type`: selectionchange | currentpagechange | close_, callback: js.Function0[Unit]): Unit = js.native
  
  val root: DocumentNode = js.native
  
  def showUI(html: String): Unit = js.native
  def showUI(html: String, options: ShowUIOptions): Unit = js.native
  
  def subtract(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin): BooleanOperationNode = js.native
  def subtract(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin, index: Double): BooleanOperationNode = js.native
  
  val ui: UIAPI = js.native
  
  def union(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin): BooleanOperationNode = js.native
  def union(nodes: js.Array[BaseNode], parent: BaseNode & ChildrenMixin, index: Double): BooleanOperationNode = js.native
  
  val viewport: ViewportAPI = js.native
}
