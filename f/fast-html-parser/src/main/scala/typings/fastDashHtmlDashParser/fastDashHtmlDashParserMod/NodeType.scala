package typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod

import org.scalablytyped.runtime.TopLevel
import typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod.NodeType.ELEMENT_NODE
import typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod.NodeType.TEXT_NODE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
  /* 1 */ @js.native
  object ELEMENT_NODE extends TopLevel[ELEMENT_NODE with Double]
  
  /* 3 */ @js.native
  object TEXT_NODE extends TopLevel[TEXT_NODE with Double]
  
}

