package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSnapshot extends js.Object {
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
  implicit class DocumentSnapshotOps[Self <: DocumentSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseURL(value: StringIndex): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentLanguage(value: StringIndex): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentURL(value: StringIndex): Self = this.set("documentURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodingName(value: StringIndex): Self = this.set("encodingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameId(value: StringIndex): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: LayoutTreeSnapshot): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: NodeTreeSnapshot): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicId(value: StringIndex): Self = this.set("publicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemId(value: StringIndex): Self = this.set("systemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextBoxes(value: TextBoxSnapshot): Self = this.set("textBoxes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: StringIndex): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentHeight(value: Double): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHeight: Self = this.set("contentHeight", js.undefined)
    @scala.inline
    def setContentWidth(value: Double): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentWidth: Self = this.set("contentWidth", js.undefined)
    @scala.inline
    def setScrollOffsetX(value: Double): Self = this.set("scrollOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOffsetX: Self = this.set("scrollOffsetX", js.undefined)
    @scala.inline
    def setScrollOffsetY(value: Double): Self = this.set("scrollOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOffsetY: Self = this.set("scrollOffsetY", js.undefined)
  }
  
}

