package typings.googleGax.fallbackMod

import typings.googleGax.gaxMod.ClientConfig
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "constructSettings")
@js.native
object constructSettings extends js.Object {
  def apply(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object
  ): js.Any = js.native
  def apply(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): js.Any = js.native
  def apply(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object,
    promise: PromiseConstructor
  ): js.Any = js.native
}

