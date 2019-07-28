package typings.fibjs.dgramMod

import typings.fibjs.Class_DgramSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSocket(opts: js.Object): Class_DgramSocket = js.native
  def createSocket(opts: js.Object, callback: js.Function): Class_DgramSocket = js.native
  def createSocket(`type`: String): Class_DgramSocket = js.native
  def createSocket(`type`: String, callback: js.Function): Class_DgramSocket = js.native
}

