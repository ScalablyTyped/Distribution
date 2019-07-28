package typings.googleDashAuthDashLibrary.buildSrcTransportersMod

import typings.gaxios.gaxiosMod.GaxiosError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestError
  extends GaxiosError[js.Any] {
  var errors: js.Array[Error] = js.native
}

