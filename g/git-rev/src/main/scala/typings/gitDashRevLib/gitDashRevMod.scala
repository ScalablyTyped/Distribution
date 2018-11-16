package typings
package gitDashRevLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-rev", JSImport.Namespace)
@js.native
object gitDashRevMod extends js.Object {
  def branch(callback: js.Function1[/* branch */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def log(callback: js.Function1[/* log */ js.Array[js.Array[java.lang.String]], scala.Unit]): scala.Unit = js.native
  def long(callback: js.Function1[/* long */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def short(callback: js.Function1[/* short */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def tag(callback: js.Function1[/* tag */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

