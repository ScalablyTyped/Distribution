package typings.dndCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/utils/dirtiness", JSImport.Namespace)
@js.native
object dirtinessMod extends js.Object {
  
  val ALL: js.Array[String] = js.native
  
  val NONE: js.Array[String] = js.native
  
  def areDirty(dirtyIds: js.Array[String]): Boolean = js.native
  def areDirty(dirtyIds: js.Array[String], handlerIds: js.Array[String]): Boolean = js.native
}
