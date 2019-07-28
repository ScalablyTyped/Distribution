package typings.gaxios.gaxiosMod

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios", "GaxiosError")
@js.native
class GaxiosError[T] protected ()
  extends typings.gaxios.buildSrcCommonMod.GaxiosError[T] {
  def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
}

