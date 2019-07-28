package typings.glue.glueMod

import typings.hapi.hapiMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compose(manifest: Manifest): js.Promise[Server] = js.native
  def compose(manifest: Manifest, options: Options): js.Promise[Server] = js.native
}

