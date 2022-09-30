package typings.dndCore

import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.SourceIdPayload
import typings.dndCore.interfacesMod.TargetIdPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("dnd-core/dist/actions/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnd-core/dist/actions/registry", "ADD_SOURCE")
  @js.native
  val ADD_SOURCE: /* "dnd-core/ADD_SOURCE" */ String = js.native
  
  @JSImport("dnd-core/dist/actions/registry", "ADD_TARGET")
  @js.native
  val ADD_TARGET: /* "dnd-core/ADD_TARGET" */ String = js.native
  
  @JSImport("dnd-core/dist/actions/registry", "REMOVE_SOURCE")
  @js.native
  val REMOVE_SOURCE: /* "dnd-core/REMOVE_SOURCE" */ String = js.native
  
  @JSImport("dnd-core/dist/actions/registry", "REMOVE_TARGET")
  @js.native
  val REMOVE_TARGET: /* "dnd-core/REMOVE_TARGET" */ String = js.native
  
  inline def addSource(sourceId: String): Action[SourceIdPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("addSource")(sourceId.asInstanceOf[js.Any]).asInstanceOf[Action[SourceIdPayload]]
  
  inline def addTarget(targetId: String): Action[TargetIdPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTarget")(targetId.asInstanceOf[js.Any]).asInstanceOf[Action[TargetIdPayload]]
  
  inline def removeSource(sourceId: String): Action[SourceIdPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSource")(sourceId.asInstanceOf[js.Any]).asInstanceOf[Action[SourceIdPayload]]
  
  inline def removeTarget(targetId: String): Action[TargetIdPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTarget")(targetId.asInstanceOf[js.Any]).asInstanceOf[Action[TargetIdPayload]]
}
