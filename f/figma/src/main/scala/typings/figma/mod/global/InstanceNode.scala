package typings.figma.mod.global

import typings.figma.figmaStrings.INSTANCE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceNode
  extends DefaultFrameMixin
     with SceneNode {
  
  var masterComponent: ComponentNode = js.native
  
  var scaleFactor: Double = js.native
  
  val `type`: INSTANCE = js.native
}
