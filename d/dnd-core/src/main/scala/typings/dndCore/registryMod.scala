package typings.dndCore

import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.SourceIdPayload
import typings.dndCore.interfacesMod.TargetIdPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("dnd-core/lib/actions/registry", "ADD_SOURCE")
  @js.native
  val ADD_SOURCE: /* "dnd-core/ADD_SOURCE" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "ADD_TARGET")
  @js.native
  val ADD_TARGET: /* "dnd-core/ADD_TARGET" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "REMOVE_SOURCE")
  @js.native
  val REMOVE_SOURCE: /* "dnd-core/REMOVE_SOURCE" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "REMOVE_TARGET")
  @js.native
  val REMOVE_TARGET: /* "dnd-core/REMOVE_TARGET" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "addSource")
  @js.native
  def addSource(sourceId: String): Action[SourceIdPayload] = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "addTarget")
  @js.native
  def addTarget(targetId: String): Action[TargetIdPayload] = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "removeSource")
  @js.native
  def removeSource(sourceId: String): Action[SourceIdPayload] = js.native
  
  @JSImport("dnd-core/lib/actions/registry", "removeTarget")
  @js.native
  def removeTarget(targetId: String): Action[TargetIdPayload] = js.native
}
