package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eurekaJsClient.eurekaJsClientStrings.UP
  - typings.eurekaJsClient.eurekaJsClientStrings.DOWN
  - typings.eurekaJsClient.eurekaJsClientStrings.STARTING
  - typings.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE
  - typings.eurekaJsClient.eurekaJsClientStrings.UNKNOWN
*/
trait InstanceStatus extends js.Object

object InstanceStatus {
  @scala.inline
  def DOWN: typings.eurekaJsClient.eurekaJsClientStrings.DOWN = this.cast("DOWN")
  @scala.inline
  def OUT_OF_SERVICE: typings.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE = this.cast("OUT_OF_SERVICE")
  @scala.inline
  def STARTING: typings.eurekaJsClient.eurekaJsClientStrings.STARTING = this.cast("STARTING")
  @scala.inline
  def UNKNOWN: typings.eurekaJsClient.eurekaJsClientStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def UP: typings.eurekaJsClient.eurekaJsClientStrings.UP = this.cast("UP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

