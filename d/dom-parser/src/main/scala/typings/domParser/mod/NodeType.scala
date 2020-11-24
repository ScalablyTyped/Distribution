package typings.domParser.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends js.Object
@JSImport("dom-parser", "NodeType")
@js.native
object NodeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
  
  @js.native
  sealed trait ELEMENT_NODE extends NodeType
  /* 1 */ @js.native
  object ELEMENT_NODE extends TopLevel[ELEMENT_NODE with Double]
  
  @js.native
  sealed trait TEXT_NODE extends NodeType
  /* 3 */ @js.native
  object TEXT_NODE extends TopLevel[TEXT_NODE with Double]
}
