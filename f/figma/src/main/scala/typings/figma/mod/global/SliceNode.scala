package typings.figma.mod.global

import typings.figma.figmaStrings.SLICE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with LayoutMixin
     with ExportMixin {
  
  val `type`: SLICE = js.native
}
