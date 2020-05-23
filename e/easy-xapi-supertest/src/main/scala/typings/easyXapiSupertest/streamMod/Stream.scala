package typings.easyXapiSupertest.streamMod

import typings.easyXapiSupertest.NodeJS.WritableStream
import typings.easyXapiSupertest.anon.End
import typings.easyXapiSupertest.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

