package typings.dndCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirtinessMod {
  
  @JSImport("dnd-core/lib/utils/dirtiness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnd-core/lib/utils/dirtiness", "ALL")
  @js.native
  val ALL: js.Array[String] = js.native
  
  @JSImport("dnd-core/lib/utils/dirtiness", "NONE")
  @js.native
  val NONE: js.Array[String] = js.native
  
  inline def areDirty(dirtyIds: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areDirty")(dirtyIds.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def areDirty(dirtyIds: js.Array[String], handlerIds: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areDirty")(dirtyIds.asInstanceOf[js.Any], handlerIds.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
