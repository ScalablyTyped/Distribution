package typings.figma.mod._Global_

import typings.figma.figmaStrings.INSTANCE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNode
  extends DefaultFrameMixin
     with SceneNode {
  var masterComponent: ComponentNode = js.native
  var scaleFactor: Double = js.native
  val `type`: INSTANCE = js.native
}

