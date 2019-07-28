package typings.dndDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfacesMod {
  type ActionCreator[Payload] = js.Function1[/* args */ js.Array[js.Any], Action[Payload]]
  type BackendFactory = js.Function3[
    /* manager */ DragDropManager, 
    /* globalContext */ js.UndefOr[js.Any], 
    /* configuration */ js.UndefOr[js.Any], 
    Backend
  ]
  type Identifier = String | js.Symbol
  type Listener = js.Function0[Unit]
  type SourceType = Identifier
  type TargetType = Identifier | js.Array[Identifier]
  type Unsubscribe = js.Function0[Unit]
}
