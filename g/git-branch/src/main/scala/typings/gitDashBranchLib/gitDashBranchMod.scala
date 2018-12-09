package typings
package gitDashBranchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-branch", JSImport.Namespace)
@js.native
object gitDashBranchMod extends js.Object {
  def apply(): js.Promise[java.lang.String] = js.native
  def apply(
    callback: js.Function2[/* err */ scala.Null | java.lang.String, /* name */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def apply(cwd: java.lang.String): js.Promise[java.lang.String] = js.native
  def apply(
    cwd: java.lang.String,
    callback: js.Function2[/* err */ scala.Null | java.lang.String, /* name */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sync(): java.lang.String = js.native
  def sync(cwd: java.lang.String): java.lang.String = js.native
}

