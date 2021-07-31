package typings.figma.mod.global

import typings.figma.figmaStrings.ELLIPSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipseNode
  extends StObject
     with DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  
  var arcData: ArcData = js.native
  
  val `type`: ELLIPSE = js.native
}
