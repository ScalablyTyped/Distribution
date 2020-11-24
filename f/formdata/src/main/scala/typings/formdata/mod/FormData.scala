package typings.formdata.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormData extends js.Object {
  
  def append(key: /* keyof any */ String, value: js.Any): js.UndefOr[Error] = js.native
  
  var boundary: js.UndefOr[String] = js.native
  
  def getContentType(): String = js.native
  
  var nodeChunkedEncoding: Boolean = js.native
  
  def serialize(): js.UndefOr[EventEmitter] = js.native
  def serialize(intendedType: String): js.UndefOr[EventEmitter] = js.native
  
  def setNodeChunkedEncoding(`val`: Boolean): Unit = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
