package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eurekaJsClient.eurekaJsClientStrings.Netflix
  - typings.eurekaJsClient.eurekaJsClientStrings.Amazon
  - typings.eurekaJsClient.eurekaJsClientStrings.MyOwn
*/
trait DataCenterName extends js.Object

object DataCenterName {
  @scala.inline
  def Amazon: typings.eurekaJsClient.eurekaJsClientStrings.Amazon = this.cast("Amazon")
  @scala.inline
  def MyOwn: typings.eurekaJsClient.eurekaJsClientStrings.MyOwn = this.cast("MyOwn")
  @scala.inline
  def Netflix: typings.eurekaJsClient.eurekaJsClientStrings.Netflix = this.cast("Netflix")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

