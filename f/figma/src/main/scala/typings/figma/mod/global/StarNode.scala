package typings.figma.mod.global

import typings.figma.figmaStrings.STAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  
  var innerRadius: Double = js.native
  
  var pointCount: Double = js.native
  
  val `type`: STAR = js.native
}
