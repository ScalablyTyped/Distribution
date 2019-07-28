package typings.findDashJavaDashHome

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-java-home", JSImport.Namespace)
@js.native
object findDashJavaDashHomeMod extends js.Object {
  def apply(callback: js.Function2[/* err */ js.UndefOr[Error], /* home */ String, Unit]): Unit = js.native
  def apply(
    options: Anon_AllowJre,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* home */ String, Unit]
  ): Unit = js.native
  def __promisify__(): js.Promise[String] = js.native
  def __promisify__(options: Anon_AllowJre): js.Promise[String] = js.native
}

