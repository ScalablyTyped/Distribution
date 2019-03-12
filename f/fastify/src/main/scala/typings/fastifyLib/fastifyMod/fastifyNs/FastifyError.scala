package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fastify custom error
  */
trait FastifyError
  extends stdLib.Error {
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Validation errors
    */
  var validation: js.UndefOr[js.Array[ValidationResult]] = js.undefined
}

object FastifyError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null,
    validation: js.Array[ValidationResult] = null
  ): FastifyError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[FastifyError]
  }
}

