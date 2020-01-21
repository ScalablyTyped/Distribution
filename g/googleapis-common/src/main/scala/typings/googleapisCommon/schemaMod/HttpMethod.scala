package typings.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleapisCommon.googleapisCommonStrings.GET
  - typings.googleapisCommon.googleapisCommonStrings.PATCH
  - typings.googleapisCommon.googleapisCommonStrings.PUT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def GET: typings.googleapisCommon.googleapisCommonStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.googleapisCommon.googleapisCommonStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def PUT: typings.googleapisCommon.googleapisCommonStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

