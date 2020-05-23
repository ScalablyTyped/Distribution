package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.anon.Wp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var buffers: Wp
  var cmd: String
  var fCmd: Boolean
  var fJump: Boolean
  var fSeekQuery: Boolean
  var htmlId: Double
  var htmls: Htmls
  var imageId: Double
  var images: Images
  var jsSandbox: js.UndefOr[js.Object] = js.undefined
  var level: Double
  var linkId: Double
  var links: Links
  var loops: js.Array[LoopStatus]
  var options: CreateReportOptions
  var pendingHtmlNode: js.UndefOr[TextNode | NonTextNode] = js.undefined
  var pendingImageNode: js.UndefOr[NonTextNode] = js.undefined
  var pendingLinkNode: js.UndefOr[NonTextNode] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var shorthands: StringDictionary[String]
  var textRunPropsNode: js.UndefOr[NonTextNode] = js.undefined
  var vars: StringDictionary[VarValue]
}

object Context {
  @scala.inline
  def apply(
    buffers: Wp,
    cmd: String,
    fCmd: Boolean,
    fJump: Boolean,
    fSeekQuery: Boolean,
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
    vars: StringDictionary[VarValue],
    jsSandbox: js.Object = null,
    pendingHtmlNode: TextNode | NonTextNode = null,
    pendingImageNode: NonTextNode = null,
    pendingLinkNode: NonTextNode = null,
    query: Query = null,
    textRunPropsNode: NonTextNode = null
  ): Context = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], fCmd = fCmd.asInstanceOf[js.Any], fJump = fJump.asInstanceOf[js.Any], fSeekQuery = fSeekQuery.asInstanceOf[js.Any], htmlId = htmlId.asInstanceOf[js.Any], htmls = htmls.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], loops = loops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    if (jsSandbox != null) __obj.updateDynamic("jsSandbox")(jsSandbox.asInstanceOf[js.Any])
    if (pendingHtmlNode != null) __obj.updateDynamic("pendingHtmlNode")(pendingHtmlNode.asInstanceOf[js.Any])
    if (pendingImageNode != null) __obj.updateDynamic("pendingImageNode")(pendingImageNode.asInstanceOf[js.Any])
    if (pendingLinkNode != null) __obj.updateDynamic("pendingLinkNode")(pendingLinkNode.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (textRunPropsNode != null) __obj.updateDynamic("textRunPropsNode")(textRunPropsNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

