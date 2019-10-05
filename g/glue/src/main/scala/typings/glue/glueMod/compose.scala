package typings.glue.glueMod

import typings.hapi.hapiMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glue", "compose")
@js.native
object compose extends js.Object {
  def apply(manifest: Manifest): js.Promise[Server] = js.native
  def apply(manifest: Manifest, options: Options): js.Promise[Server] = js.native
}

