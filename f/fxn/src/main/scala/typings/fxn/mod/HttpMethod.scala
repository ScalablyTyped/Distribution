package typings.fxn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fxn.fxnStrings.GET
  - typings.fxn.fxnStrings.POST
  - typings.fxn.fxnStrings.PUT
  - typings.fxn.fxnStrings.DELETE
  - typings.fxn.fxnStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.fxn.fxnStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.fxn.fxnStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typings.fxn.fxnStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def POST: typings.fxn.fxnStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.fxn.fxnStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

