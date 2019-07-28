package typings.dush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dushMod {
  type DushStatic = js.Function0[Emitter]
  type Handler = js.Function1[/* repeated */ js.Any, Unit]
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[String], /* repeated */ js.Any, Unit]
}
