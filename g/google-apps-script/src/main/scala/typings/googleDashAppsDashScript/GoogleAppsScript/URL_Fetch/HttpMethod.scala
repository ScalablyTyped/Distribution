package typings.googleDashAppsDashScript.GoogleAppsScript.URL_Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.get
  - typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.delete
  - typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.patch
  - typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.post
  - typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.put
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.delete = this.cast("delete")
  @scala.inline
  def get: typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.get = this.cast("get")
  @scala.inline
  def patch: typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.patch = this.cast("patch")
  @scala.inline
  def post: typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.post = this.cast("post")
  @scala.inline
  def put: typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.put = this.cast("put")
}

