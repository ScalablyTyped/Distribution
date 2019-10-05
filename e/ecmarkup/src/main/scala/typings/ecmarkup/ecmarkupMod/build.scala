package typings.ecmarkup.ecmarkupMod

import typings.ecmarkup.libSpecMod.Spec
import typings.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup", "build")
@js.native
object build extends js.Object {
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]]
  ): js.Promise[Spec] = js.native
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: Options
  ): js.Promise[Spec] = js.native
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: Options,
    token: CancellationToken
  ): js.Promise[Spec] = js.native
}

