package typings.etag.etagMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("etag", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(entity: String): String = js.native
  def apply(entity: String, options: Options): String = js.native
  def apply(entity: StatsLike): String = js.native
  def apply(entity: StatsLike, options: Options): String = js.native
  def apply(entity: Buffer): String = js.native
  def apply(entity: Buffer, options: Options): String = js.native
}

