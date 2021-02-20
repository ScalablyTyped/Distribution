package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSnapshot extends StObject {
  
  /**
    * Base URL that `Document` or `FrameOwner` node uses for URL completion.
    */
  var baseURL: StringIndex = js.native
  
  /**
    * Document content height.
    */
  var contentHeight: js.UndefOr[Double] = js.native
  
  /**
    * Contains the document's content language.
    */
  var contentLanguage: StringIndex = js.native
  
  /**
    * Document content width.
    */
  var contentWidth: js.UndefOr[Double] = js.native
  
  /**
    * Document URL that `Document` or `FrameOwner` node points to.
    */
  var documentURL: StringIndex = js.native
  
  /**
    * Contains the document's character set encoding.
    */
  var encodingName: StringIndex = js.native
  
  /**
    * Frame ID for frame owner elements and also for the document node.
    */
  var frameId: StringIndex = js.native
  
  /**
    * The nodes in the layout tree.
    */
  var layout: LayoutTreeSnapshot = js.native
  
  /**
    * A table with dom nodes.
    */
  var nodes: NodeTreeSnapshot = js.native
  
  /**
    * `DocumentType` node's publicId.
    */
  var publicId: StringIndex = js.native
  
  /**
    * Horizontal scroll offset.
    */
  var scrollOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Vertical scroll offset.
    */
  var scrollOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * `DocumentType` node's systemId.
    */
  var systemId: StringIndex = js.native
  
  /**
    * The post-layout inline text nodes.
    */
  var textBoxes: TextBoxSnapshot = js.native
  
  /**
    * Document title.
    */
  var title: StringIndex = js.native
}
object DocumentSnapshot {
  
  @scala.inline
  def apply(
    baseURL: StringIndex,
    contentLanguage: StringIndex,
    documentURL: StringIndex,
    encodingName: StringIndex,
    frameId: StringIndex,
    layout: LayoutTreeSnapshot,
    nodes: NodeTreeSnapshot,
    publicId: StringIndex,
    systemId: StringIndex,
    textBoxes: TextBoxSnapshot,
    title: StringIndex
  ): DocumentSnapshot = {
    val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], contentLanguage = contentLanguage.asInstanceOf[js.Any], documentURL = documentURL.asInstanceOf[js.Any], encodingName = encodingName.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], textBoxes = textBoxes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSnapshot]
  }
  
  @scala.inline
  implicit class DocumentSnapshotMutableBuilder[Self <: DocumentSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseURL(value: StringIndex): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: StringIndex): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    @scala.inline
    def setDocumentURL(value: StringIndex): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingName(value: StringIndex): Self = StObject.set(x, "encodingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: StringIndex): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: LayoutTreeSnapshot): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: NodeTreeSnapshot): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: StringIndex): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetX(value: Double): Self = StObject.set(x, "scrollOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetXUndefined: Self = StObject.set(x, "scrollOffsetX", js.undefined)
    
    @scala.inline
    def setScrollOffsetY(value: Double): Self = StObject.set(x, "scrollOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetYUndefined: Self = StObject.set(x, "scrollOffsetY", js.undefined)
    
    @scala.inline
    def setSystemId(value: StringIndex): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBoxes(value: TextBoxSnapshot): Self = StObject.set(x, "textBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: StringIndex): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
