package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eurekaJsClient.eurekaJsClientStrings.ADDED
  - typings.eurekaJsClient.eurekaJsClientStrings.MODIFIED
  - typings.eurekaJsClient.eurekaJsClientStrings.DELETED
*/
trait ActionType extends js.Object

object ActionType {
  @scala.inline
  def ADDED: typings.eurekaJsClient.eurekaJsClientStrings.ADDED = this.cast("ADDED")
  @scala.inline
  def DELETED: typings.eurekaJsClient.eurekaJsClientStrings.DELETED = this.cast("DELETED")
  @scala.inline
  def MODIFIED: typings.eurekaJsClient.eurekaJsClientStrings.MODIFIED = this.cast("MODIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

