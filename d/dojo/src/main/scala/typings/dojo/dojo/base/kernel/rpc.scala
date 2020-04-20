package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.rpc.html
  *
  *
  */
trait rpc extends js.Object {
  /**
    *
    */
  def JsonService(): Unit
  /**
    *
    */
  def JsonpService(): Unit
  /**
    *
    */
  def RpcService(): Unit
}

object rpc {
  @scala.inline
  def apply(JsonService: () => Unit, JsonpService: () => Unit, RpcService: () => Unit): rpc = {
    val __obj = js.Dynamic.literal(JsonService = js.Any.fromFunction0(JsonService), JsonpService = js.Any.fromFunction0(JsonpService), RpcService = js.Any.fromFunction0(RpcService))
    __obj.asInstanceOf[rpc]
  }
}

