package typings
package dndDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfacesMod {
  type ActionCreator[Payload] = js.Function1[/* args */ js.Array[js.Any], Action[Payload]]
  type BackendFactory = js.Function1[/* dragDropManager */ DragDropManager[js.Any], Backend]
  type Identifier = java.lang.String | js.Symbol
  type Listener = js.Function0[scala.Unit]
  type SourceType = Identifier
  type TargetType = Identifier | js.Array[Identifier]
  type Unsubscribe = js.Function0[scala.Unit]
}
