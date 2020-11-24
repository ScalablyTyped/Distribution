package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief zeroMQ 消息队列模块
  * @detail 基础模块。提供 zeroMQ 消息队列支撑。,```JavaScript,var zmq = require('zmq');,```
  */
@JSImport("zmq", JSImport.Namespace)
@js.native
object zmqMod extends js.Object {
  
  val DEALER: /* 5 */ Double = js.native
  
  val PAIR: /* 0 */ Double = js.native
  
  val PUB: /* 1 */ Double = js.native
  
  val PULL: /* 7 */ Double = js.native
  
  val PUSH: /* 8 */ Double = js.native
  
  val REP: /* 4 */ Double = js.native
  
  val REQ: /* 3 */ Double = js.native
  
  val ROUTER: /* 6 */ Double = js.native
  
  val SUB: /* 2 */ Double = js.native
  
  val XPUB: /* 9 */ Double = js.native
  
  val XSUB: /* 10 */ Double = js.native
  
  @js.native
  class Socket () extends ClassZmqSocket
}
