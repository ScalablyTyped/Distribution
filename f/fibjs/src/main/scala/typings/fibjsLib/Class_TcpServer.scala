package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief tcp 服务器对象，可方便创建一个标准多纤程 tcp 服务器
	* @detail 使用 TcpServer 对象可以迅速创建一个多纤程并发处理的 tcp 服务器。,```JavaScript,function func(conn),{,    var data;,,    while(data = conn.read()),        conn.write(data);,,    conn.close();,},,new net.TcpServer(8080, func).run();,```
	*/

@JSGlobal("Class_TcpServer")
@js.native
class Class_TcpServer protected () extends Class__object {
  /**
  	 * 
  	 * @brief TcpServer 构造函数，在所有本机地址侦听
  	 * @param port 指定 tcp 服务器侦听端口
  	 * @param listener 指定 tcp 接收到的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(port: scala.Double, listener: Class_Handler) = this()
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
  def this(addr: java.lang.String, port: scala.Double, listener: Class_Handler) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 服务器当前事件处理接口对象
  	 * 
  	 * 
  	 * @type Handler
  	 */
  var handler: Class_Handler = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 服务器当前侦听的 Socket 对象
  	 * 
  	 * @readonly
  	 * @type Socket
  	 */
  var socket: Class_Socket = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前服务器运行状态
  	 * 
  	 * 返回的结果为一个 Stats 对象，初始化计数器如下：
  	 * ```JavaScript
  	 * {
  	 * total : 1000,      // 总计处理的连接
  	 * connections : 100, // 当前正在处理的连接
  	 * accept : 10,       // 上次查询后新建的连接
  	 * close : 10         // 上次查询后关闭的连接
  	 * }
  	 * ```
  	 * 
  	 * 
  	 * @readonly
  	 * @type Stats
  	 */
  var stats: Class_Stats = js.native
  /**
  	 * 
  	 * @brief 异步运行服务器并开始接收和分发连接，调用后立即返回，服务器在后台运行
  	 * 
  	 * 
  	 */
  def asyncRun(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 运行服务器并开始接收和分发连接，此函数不会返回
  	 * 
  	 * @async
  	 */
  def run(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 关闭 socket中止正在运行的服务器
  	 * 
  	 * @async
  	 */
  def stop(): scala.Unit = js.native
}

