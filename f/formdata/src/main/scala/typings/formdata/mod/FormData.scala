package typings.formdata.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  var boundary: js.UndefOr[String] = js.native
  var nodeChunkedEncoding: Boolean = js.native
  var `type`: js.UndefOr[String] = js.native
  def append(key: /* keyof any */ String, value: js.Any): js.UndefOr[Error] = js.native
  def getContentType(): String = js.native
  def serialize(): js.UndefOr[EventEmitter] = js.native
  def serialize(intendedType: String): js.UndefOr[EventEmitter] = js.native
  def setNodeChunkedEncoding(`val`: Boolean): Unit = js.native
}

