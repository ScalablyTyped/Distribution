package typings.figma

import typings.figma.figmaStrings.INSTANCE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNode
  extends DefaultContainerMixin
     with SceneNode {
  var masterComponent: ComponentNode = js.native
  val `type`: INSTANCE = js.native
}

