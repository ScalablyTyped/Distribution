package typings.figma.mod.global

import typings.figma.figmaStrings.COMPONENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentNode
  extends StObject
     with DefaultFrameMixin
     with SceneNode {
  
  def createInstance(): InstanceNode = js.native
  
  var description: String = js.native
  
  val key: String = js.native
  
  val remote: Boolean = js.native
  
  val `type`: COMPONENT = js.native
}
