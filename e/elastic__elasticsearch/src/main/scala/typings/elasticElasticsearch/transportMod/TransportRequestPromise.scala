package typings.elasticElasticsearch.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportRequestPromise[T]
  extends js.Promise[T] {
  def abort(): Unit = js.native
}

