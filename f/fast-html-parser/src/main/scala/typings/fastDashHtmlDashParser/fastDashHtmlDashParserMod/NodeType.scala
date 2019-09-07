package typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

@JSImport("fast-html-parser", "NodeType")
@js.native
object NodeType extends js.Object {
  @js.native
  sealed trait ELEMENT_NODE extends NodeType
  
  @js.native
  sealed trait TEXT_NODE extends NodeType
  
  /* 1 */ val ELEMENT_NODE: typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod.NodeType.ELEMENT_NODE with Double = js.native
  /* 3 */ val TEXT_NODE: typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod.NodeType.TEXT_NODE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
}

