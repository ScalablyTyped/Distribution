package typings.expressValidator.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressValidator.expressValidatorStrings.body
  - typings.expressValidator.expressValidatorStrings.cookies
  - typings.expressValidator.expressValidatorStrings.headers
  - typings.expressValidator.expressValidatorStrings.params
  - typings.expressValidator.expressValidatorStrings.query
*/
trait Location extends js.Object

object Location {
  @scala.inline
  def body: typings.expressValidator.expressValidatorStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookies: typings.expressValidator.expressValidatorStrings.cookies = this.cast("cookies")
  @scala.inline
  def headers: typings.expressValidator.expressValidatorStrings.headers = this.cast("headers")
  @scala.inline
  def params: typings.expressValidator.expressValidatorStrings.params = this.cast("params")
  @scala.inline
  def query: typings.expressValidator.expressValidatorStrings.query = this.cast("query")
}

