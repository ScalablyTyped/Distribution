package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief dgram 模块提供了 UDP 数据包 socket 的实现
  * @detail 基础模块，引用方式：,```JavaScript,var dgram = require('dgram');,```
  */
object dgramMod {
  
  @JSImport("dgram", "Socket")
  @js.native
  class Socket () extends ClassDgramSocket
  
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(opts: js.Object): ClassDgramSocket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(opts: js.Object, callback: js.Function): ClassDgramSocket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(`type`: String): ClassDgramSocket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(`type`: String, callback: js.Function): ClassDgramSocket = js.native
}
