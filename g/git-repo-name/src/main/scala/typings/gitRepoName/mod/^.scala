package typings.gitRepoName.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-repo-name", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[String] = js.native
  def apply(callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
  def apply(options: String): js.Promise[String] = js.native
  def apply(options: String, callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
  def apply(options: Options): js.Promise[String] = js.native
  def apply(options: Options, callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
}

