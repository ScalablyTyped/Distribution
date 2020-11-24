package typings.figma.mod.global

import typings.figma.figmaStrings.VECTOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ConstraintMixin
     with CornerMixin {
  
  var handleMirroring: HandleMirroring | js.Symbol = js.native
  
  val `type`: VECTOR = js.native
  
  var vectorNetwork: VectorNetwork = js.native
  
  var vectorPaths: VectorPaths = js.native
}
