package typings.googleapisDashCommon.buildSrcSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleapisDashCommon.googleapisDashCommonStrings.GET
  - typings.googleapisDashCommon.googleapisDashCommonStrings.PATCH
  - typings.googleapisDashCommon.googleapisDashCommonStrings.PUT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def GET: typings.googleapisDashCommon.googleapisDashCommonStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.googleapisDashCommon.googleapisDashCommonStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def PUT: typings.googleapisDashCommon.googleapisDashCommonStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

