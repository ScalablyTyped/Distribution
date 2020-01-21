package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.fsExtra.mod.CopyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "copyAsync")
@js.native
object copyAsync extends js.Object {
  def apply(src: String, dest: String): ^[Unit] = js.native
  def apply(
    src: String,
    dest: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CopyFilter */ js.Any
  ): ^[Unit] = js.native
  def apply(src: String, dest: String, options: CopyOptions): ^[Unit] = js.native
}

