package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief zeroMQ 消息队列模块
  * @detail 基础模块。提供 zeroMQ 消息队列支撑。,```JavaScript,var zmq = require('zmq');,```
  */
object zmqMod {
  
  @JSImport("zmq", "DEALER")
  @js.native
  val DEALER: /* 5 */ Double = js.native
  
  @JSImport("zmq", "PAIR")
  @js.native
  val PAIR: /* 0 */ Double = js.native
  
  @JSImport("zmq", "PUB")
  @js.native
  val PUB: /* 1 */ Double = js.native
  
  @JSImport("zmq", "PULL")
  @js.native
  val PULL: /* 7 */ Double = js.native
  
  @JSImport("zmq", "PUSH")
  @js.native
  val PUSH: /* 8 */ Double = js.native
  
  @JSImport("zmq", "REP")
  @js.native
  val REP: /* 4 */ Double = js.native
  
  @JSImport("zmq", "REQ")
  @js.native
  val REQ: /* 3 */ Double = js.native
  
  @JSImport("zmq", "ROUTER")
  @js.native
  val ROUTER: /* 6 */ Double = js.native
  
  @JSImport("zmq", "SUB")
  @js.native
  val SUB: /* 2 */ Double = js.native
  
  @JSImport("zmq", "Socket")
  @js.native
  class Socket ()
    extends StObject
       with ClassZmqSocket
  
  @JSImport("zmq", "XPUB")
  @js.native
  val XPUB: /* 9 */ Double = js.native
  
  @JSImport("zmq", "XSUB")
  @js.native
  val XSUB: /* 10 */ Double = js.native
}
