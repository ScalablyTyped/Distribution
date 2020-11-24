package typings.fastifyError.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify-error", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(code: String, message: String): FastifyError = js.native
  def apply(code: String, message: String, statusCode: js.UndefOr[scala.Nothing], Base: Error): FastifyError = js.native
  def apply(code: String, message: String, statusCode: Double): FastifyError = js.native
  def apply(code: String, message: String, statusCode: Double, Base: Error): FastifyError = js.native
}
