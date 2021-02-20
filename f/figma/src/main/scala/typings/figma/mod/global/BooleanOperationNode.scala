package typings.figma.mod.global

import typings.figma.figmaStrings.BOOLEAN_OPERATION
import typings.figma.figmaStrings.EXCLUDE
import typings.figma.figmaStrings.INTERSECT
import typings.figma.figmaStrings.SUBTRACT
import typings.figma.figmaStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanOperationNode
  extends DefaultShapeMixin
     with ChildrenMixin
     with CornerMixin
     with SceneNode {
  
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  
  var expanded: Boolean = js.native
  
  val `type`: BOOLEAN_OPERATION = js.native
}
