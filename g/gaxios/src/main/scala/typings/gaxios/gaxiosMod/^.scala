package typings.gaxios.gaxiosMod

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val instance: typings.gaxios.buildSrcGaxiosMod.Gaxios = js.native
  def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
}

