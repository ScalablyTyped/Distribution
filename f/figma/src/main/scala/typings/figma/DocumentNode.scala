package typings.figma

import typings.figma.figmaStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Nodes
@js.native
trait DocumentNode
  extends BaseNodeMixin
     with ChildrenMixin
     with BaseNode {
  val `type`: DOCUMENT = js.native
}

