package typings.dndCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type ActionCreator[Payload] = js.Function1[/* args */ js.Array[js.Any], typings.dndCore.interfacesMod.Action[Payload]]
  type BackendFactory = js.Function3[
    /* manager */ typings.dndCore.interfacesMod.DragDropManager, 
    /* globalContext */ js.UndefOr[js.Any], 
    /* configuration */ js.UndefOr[js.Any], 
    typings.dndCore.interfacesMod.Backend
  ]
  type Identifier = java.lang.String | js.Symbol
  type Listener = js.Function0[scala.Unit]
  type SourceType = typings.dndCore.interfacesMod.Identifier
  type TargetType = typings.dndCore.interfacesMod.Identifier | js.Array[typings.dndCore.interfacesMod.Identifier]
  type Unsubscribe = js.Function0[scala.Unit]
}
