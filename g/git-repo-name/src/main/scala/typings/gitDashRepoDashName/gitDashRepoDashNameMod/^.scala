package typings.gitDashRepoDashName.gitDashRepoDashNameMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-repo-name", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[String] = js.native
  def apply(callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
  def apply(options: String | Options): js.Promise[String] = js.native
  def apply(
    options: String | Options,
    callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]
  ): Unit = js.native
  def promise(): js.Promise[String] = js.native
  def promise(options: String): js.Promise[String] = js.native
  def promise(options: Options): js.Promise[String] = js.native
  def sync(): String = js.native
  def sync(options: String): String = js.native
  def sync(options: Options): String = js.native
}

