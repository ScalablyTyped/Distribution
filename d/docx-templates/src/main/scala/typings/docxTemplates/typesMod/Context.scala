package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.anon.Wp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var buffers: Wp = js.native
  
  var cmd: String = js.native
  
  var fCmd: Boolean = js.native
  
  var fJump: Boolean = js.native
  
  var fSeekQuery: Boolean = js.native
  
  var gCntIf: Double = js.native
  
  var htmlId: Double = js.native
  
  var htmls: Htmls = js.native
  
  var imageId: Double = js.native
  
  var images: Images = js.native
  
  var jsSandbox: js.UndefOr[js.Object] = js.native
  
  var level: Double = js.native
  
  var linkId: Double = js.native
  
  var links: Links = js.native
  
  var loops: js.Array[LoopStatus] = js.native
  
  var options: CreateReportOptions = js.native
  
  var pendingHtmlNode: js.UndefOr[TextNode | NonTextNode] = js.native
  
  var pendingImageNode: js.UndefOr[NonTextNode] = js.native
  
  var pendingLinkNode: js.UndefOr[NonTextNode] = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var shorthands: StringDictionary[String] = js.native
  
  var textRunPropsNode: js.UndefOr[NonTextNode] = js.native
  
  var vars: StringDictionary[VarValue] = js.native
}
object Context {
  
  @scala.inline
  def apply(
    buffers: Wp,
    cmd: String,
    fCmd: Boolean,
    fJump: Boolean,
    fSeekQuery: Boolean,
    gCntIf: Double,
    htmlId: Double,
    htmls: Htmls,
    imageId: Double,
    images: Images,
    level: Double,
    linkId: Double,
    links: Links,
    loops: js.Array[LoopStatus],
    options: CreateReportOptions,
    shorthands: StringDictionary[String],
    vars: StringDictionary[VarValue]
  ): Context = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], fCmd = fCmd.asInstanceOf[js.Any], fJump = fJump.asInstanceOf[js.Any], fSeekQuery = fSeekQuery.asInstanceOf[js.Any], gCntIf = gCntIf.asInstanceOf[js.Any], htmlId = htmlId.asInstanceOf[js.Any], htmls = htmls.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], loops = loops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setBuffers(value: Wp): Self = this.set("buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFCmd(value: Boolean): Self = this.set("fCmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFJump(value: Boolean): Self = this.set("fJump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFSeekQuery(value: Boolean): Self = this.set("fSeekQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGCntIf(value: Double): Self = this.set("gCntIf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlId(value: Double): Self = this.set("htmlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmls(value: Htmls): Self = this.set("htmls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: Double): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: Images): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: Double): Self = this.set("linkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: Links): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopsVarargs(value: LoopStatus*): Self = this.set("loops", js.Array(value :_*))
    
    @scala.inline
    def setLoops(value: js.Array[LoopStatus]): Self = this.set("loops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: CreateReportOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthands(value: StringDictionary[String]): Self = this.set("shorthands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: StringDictionary[VarValue]): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsSandbox(value: js.Object): Self = this.set("jsSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsSandbox: Self = this.set("jsSandbox", js.undefined)
    
    @scala.inline
    def setPendingHtmlNode(value: TextNode | NonTextNode): Self = this.set("pendingHtmlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingHtmlNode: Self = this.set("pendingHtmlNode", js.undefined)
    
    @scala.inline
    def setPendingImageNode(value: NonTextNode): Self = this.set("pendingImageNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingImageNode: Self = this.set("pendingImageNode", js.undefined)
    
    @scala.inline
    def setPendingLinkNode(value: NonTextNode): Self = this.set("pendingLinkNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingLinkNode: Self = this.set("pendingLinkNode", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setTextRunPropsNode(value: NonTextNode): Self = this.set("textRunPropsNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRunPropsNode: Self = this.set("textRunPropsNode", js.undefined)
  }
}
