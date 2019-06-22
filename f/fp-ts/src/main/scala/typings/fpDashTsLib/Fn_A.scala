package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_A[M] extends js.Object {
  /** @deprecated */
  def apply[A](fa: stdLib.Record[java.lang.String, A], f: js.Function1[/* a */ A, M]): M = js.native
  def apply[A](f: js.Function1[/* a */ A, M]): js.Function1[/* fa */ stdLib.Record[java.lang.String, A], M] = js.native
}

