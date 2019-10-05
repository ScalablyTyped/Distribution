package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief dgram 模块提供了 UDP 数据包 socket 的实现
	* @detail 基础模块，引用方式：,```JavaScript,var dgram = require('dgram');,```
	*/
@JSImport("dgram", JSImport.Namespace)
@js.native
object dgramMod extends js.Object {
  @js.native
  class Socket () extends Class_DgramSocket
  
  def createSocket(opts: js.Object): Class_DgramSocket = js.native
  def createSocket(opts: js.Object, callback: js.Function): Class_DgramSocket = js.native
  def createSocket(`type`: String): Class_DgramSocket = js.native
  def createSocket(`type`: String, callback: js.Function): Class_DgramSocket = js.native
}

