package typings
package dushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dushMod {
  type DushStatic = js.Function0[Emitter]
  type Handler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[java.lang.String], /* repeated */ js.Any, scala.Unit]
}
