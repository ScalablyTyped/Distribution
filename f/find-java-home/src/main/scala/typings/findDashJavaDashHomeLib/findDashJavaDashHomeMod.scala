package typings
package findDashJavaDashHomeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-java-home", JSImport.Namespace)
@js.native
object findDashJavaDashHomeMod extends js.Object {
  def apply(
    callback: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* home */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    options: findDashJavaDashHomeLib.Anon_AllowJre,
    callback: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* home */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def __promisify__(): js.Promise[java.lang.String] = js.native
  def __promisify__(options: findDashJavaDashHomeLib.Anon_AllowJre): js.Promise[java.lang.String] = js.native
}

