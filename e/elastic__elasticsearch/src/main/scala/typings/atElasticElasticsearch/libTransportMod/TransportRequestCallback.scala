package typings.atElasticElasticsearch.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestCallback extends js.Object {
  def abort(): Unit
}

object TransportRequestCallback {
  @scala.inline
  def apply(abort: () => Unit): TransportRequestCallback = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[TransportRequestCallback]
  }
}

