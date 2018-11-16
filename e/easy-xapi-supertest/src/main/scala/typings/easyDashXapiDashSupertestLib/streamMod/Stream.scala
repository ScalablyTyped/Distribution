package typings
package easyDashXapiDashSupertestLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter {
  def pipe[T /* <: easyDashXapiDashSupertestLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: easyDashXapiDashSupertestLib.NodeJSNs.WritableStream */](destination: T, options: easyDashXapiDashSupertestLib.Anon_End): T = js.native
}

