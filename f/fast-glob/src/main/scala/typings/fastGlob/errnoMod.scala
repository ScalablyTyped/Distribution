package typings.fastGlob

import typings.fastGlob.typesMod.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/errno", JSImport.Namespace)
@js.native
object errnoMod extends js.Object {
  def isEnoentCodeError(error: ErrnoException): Boolean = js.native
}

