package typings.dndCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirtinessMod {
  
  @JSImport("dnd-core/lib/utils/dirtiness", "ALL")
  @js.native
  val ALL: js.Array[String] = js.native
  
  @JSImport("dnd-core/lib/utils/dirtiness", "NONE")
  @js.native
  val NONE: js.Array[String] = js.native
  
  @JSImport("dnd-core/lib/utils/dirtiness", "areDirty")
  @js.native
  def areDirty(dirtyIds: js.Array[String]): Boolean = js.native
  @JSImport("dnd-core/lib/utils/dirtiness", "areDirty")
  @js.native
  def areDirty(dirtyIds: js.Array[String], handlerIds: js.Array[String]): Boolean = js.native
}
