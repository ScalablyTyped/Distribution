package typings.elasticElasticsearch.transportMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportRequestPromise[T] extends Promise[T] {
  def abort(): Unit = js.native
}

