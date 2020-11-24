package typings.fastify.loggerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyLogFn extends js.Object {
  
  def apply(msg: String, args: js.Any*): Unit = js.native
  def apply(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def apply(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
}
