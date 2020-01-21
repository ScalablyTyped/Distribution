package typings.googleAppsScript.GoogleAppsScript.URLFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleAppsScript.googleAppsScriptStrings.get
  - typings.googleAppsScript.googleAppsScriptStrings.delete
  - typings.googleAppsScript.googleAppsScriptStrings.patch
  - typings.googleAppsScript.googleAppsScriptStrings.post
  - typings.googleAppsScript.googleAppsScriptStrings.put
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.googleAppsScript.googleAppsScriptStrings.delete = this.cast("delete")
  @scala.inline
  def get: typings.googleAppsScript.googleAppsScriptStrings.get = this.cast("get")
  @scala.inline
  def patch: typings.googleAppsScript.googleAppsScriptStrings.patch = this.cast("patch")
  @scala.inline
  def post: typings.googleAppsScript.googleAppsScriptStrings.post = this.cast("post")
  @scala.inline
  def put: typings.googleAppsScript.googleAppsScriptStrings.put = this.cast("put")
}

