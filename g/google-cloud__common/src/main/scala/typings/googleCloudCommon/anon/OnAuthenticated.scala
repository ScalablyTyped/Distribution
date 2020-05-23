package typings.googleCloudCommon.anon

import typings.std.Error
import typings.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAuthenticated extends js.Object {
  def onAuthenticated(): Unit = js.native
  def onAuthenticated(err: Null, authenticatedReqOpts: Options): Unit = js.native
  def onAuthenticated(err: Error): Unit = js.native
  def onAuthenticated(err: Error, authenticatedReqOpts: Options): Unit = js.native
}

