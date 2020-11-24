package typings.figma.mod.global

import typings.figma.figmaStrings.COMPONENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentNode
  extends DefaultFrameMixin
     with SceneNode {
  
  def createInstance(): InstanceNode = js.native
  
  var description: String = js.native
  
  val key: String = js.native
  
  val remote: Boolean = js.native
  
  val `type`: COMPONENT = js.native
}
