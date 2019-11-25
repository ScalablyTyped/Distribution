package typings.googleDashGax

import typings.googleDashGax.buildSrcStatusMod.Status
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/googleError", JSImport.Namespace)
@js.native
object buildSrcGoogleErrorMod extends js.Object {
  @js.native
  class GoogleError () extends Error {
    var code: js.UndefOr[Status] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var note: js.UndefOr[String] = js.native
  }
  
}

