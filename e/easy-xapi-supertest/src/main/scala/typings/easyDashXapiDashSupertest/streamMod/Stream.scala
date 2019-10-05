package typings.easyDashXapiDashSupertest.streamMod

import typings.easyDashXapiDashSupertest.Anon_End
import typings.easyDashXapiDashSupertest.NodeJS.WritableStream
import typings.easyDashXapiDashSupertest.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

