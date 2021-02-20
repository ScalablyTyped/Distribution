package typings.figma.mod.global

import typings.figma.figmaStrings.VECTOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  
  var handleMirroring: HandleMirroring | js.Symbol = js.native
  
  val `type`: VECTOR = js.native
  
  var vectorNetwork: VectorNetwork = js.native
  
  var vectorPaths: VectorPaths = js.native
}
