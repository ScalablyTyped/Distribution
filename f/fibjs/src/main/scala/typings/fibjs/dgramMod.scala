package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief dgram 模块提供了 UDP 数据包 socket 的实现
  * @detail 基础模块，引用方式：,```JavaScript,var dgram = require('dgram');,```
  */
object dgramMod {
  
  @JSImport("dgram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dgram", "Socket")
  @js.native
  class Socket ()
    extends StObject
       with ClassDgramSocket
  
  inline def createSocket(opts: js.Object): ClassDgramSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(opts.asInstanceOf[js.Any]).asInstanceOf[ClassDgramSocket]
  inline def createSocket(opts: js.Object, callback: js.Function): ClassDgramSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClassDgramSocket]
  inline def createSocket(`type`: String): ClassDgramSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[ClassDgramSocket]
  inline def createSocket(`type`: String, callback: js.Function): ClassDgramSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClassDgramSocket]
}
