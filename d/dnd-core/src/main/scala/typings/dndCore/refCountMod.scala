package typings.dndCore

import typings.dndCore.interfacesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refCountMod {
  
  @JSImport("dnd-core/lib/reducers/refCount", "reduce")
  @js.native
  def reduce(state: js.UndefOr[scala.Nothing], action: Action[_]): State = js.native
  @JSImport("dnd-core/lib/reducers/refCount", "reduce")
  @js.native
  def reduce(state: Double, action: Action[_]): State = js.native
  
  type State = Double
}
