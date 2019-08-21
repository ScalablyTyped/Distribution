package typings.figma

import typings.figma.figmaStrings.FRAME
import typings.figma.figmaStrings.GROUP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameNode
  extends DefaultContainerMixin
     with SceneNode {
  val `type`: FRAME | GROUP = js.native
}

