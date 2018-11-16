package typings
package easyDashXDashHeadersLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter {
  def pipe[T /* <: easyDashXDashHeadersLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: easyDashXDashHeadersLib.NodeJSNs.WritableStream */](destination: T, options: easyDashXDashHeadersLib.Anon_End): T = js.native
}

