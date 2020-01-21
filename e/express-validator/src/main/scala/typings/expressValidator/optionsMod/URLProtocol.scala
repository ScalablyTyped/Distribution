package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressValidator.expressValidatorStrings.http
  - typings.expressValidator.expressValidatorStrings.https
  - typings.expressValidator.expressValidatorStrings.ftp
*/
trait URLProtocol extends js.Object

object URLProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftp: typings.expressValidator.expressValidatorStrings.ftp = this.cast("ftp")
  @scala.inline
  def http: typings.expressValidator.expressValidatorStrings.http = this.cast("http")
  @scala.inline
  def https: typings.expressValidator.expressValidatorStrings.https = this.cast("https")
}

