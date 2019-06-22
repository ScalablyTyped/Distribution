package typings
package fpDashTsLib.libRecordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Record", "getSetoid")
@js.native
object getSetoid extends js.Object {
  def apply[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[stdLib.Record[java.lang.String, A]] = js.native
}

