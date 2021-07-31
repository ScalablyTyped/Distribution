package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief tcp 服务器对象，可方便创建一个标准多纤程 tcp 服务器
  * @detail 使用 TcpServer 对象可以迅速创建一个多纤程并发处理的 tcp 服务器。,```JavaScript,function func(conn),{,    var data;,,    while(data = conn.read()),        conn.write(data);,,    conn.close();,},,new net.TcpServer(8080, func).run();,```
  */
@JSGlobal("Class_TcpServer")
@js.native
class ClassTcpServer protected ()
  extends StObject
     with typings.fibjs.ClassTcpServer {
  /**
    * 
    * @brief TcpServer 构造函数，在所有本机地址侦听
    * @param port 指定 tcp 服务器侦听端口
    * @param listener 指定 tcp 接收到的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * 
    * 
    * 
    */
  def this(port: Double, listener: typings.fibjs.ClassHandler) = this()
  /**
    * 
    * @brief TcpServer 构造函数
    * @param addr 指定 tcp 服务器侦听地址，为 "" 则在本机所有地址侦听
    * @param port 指定 tcp 服务器侦听端口
    * @param listener 指定 tcp 接收到的连接的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * 
    * 
    * 
    */
  def this(addr: String, port: Double, listener: typings.fibjs.ClassHandler) = this()
}
