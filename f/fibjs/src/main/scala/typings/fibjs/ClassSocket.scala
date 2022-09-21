package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSocket
  extends StObject
     with ClassStream {
  
  /**
    * 
    * @brief 等待并接受一个连接
    * @return 返回接收到得连接对象
    * 
    * 
    * @async
    */
  def accept(): ClassSocket = js.native
  
  /**
    * 
    * @brief 将当前 Socket 绑定至指定地址的指定端口
    * @param addr 指定绑定的地址
    * @param port 指定绑定的端口
    * @param allowIPv4 指定是否接受 ipv4 连接，缺省为 true。本参数在 ipv6 时有效，并依赖于操作系统
    * 
    * 
    * 
    */
  def bind(addr: String, port: Double): Unit = js.native
  def bind(addr: String, port: Double, allowIPv4: Boolean): Unit = js.native
  /**
    * 
    * @brief 将当前 Socket 绑定至本地所有地址的指定端口
    * @param port 指定绑定的端口
    * @param allowIPv4 指定是否接受 ipv4 连接，缺省为 true。本参数在 ipv6 时有效，并依赖于操作系统
    * 
    * 
    * 
    */
  def bind(port: Double): Unit = js.native
  def bind(port: Double, allowIPv4: Boolean): Unit = js.native
  
  /**
    * 
    * @brief 建立一个 tcp 连接
    * @param host 指定对方地址或主机名
    * @param port 指定对方端口
    * 
    * 
    * @async
    */
  def connect(host: String, port: Double): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前 Socket 对象的地址集
    * 
    * @readonly
    * @type Integer
    */
  var family: Double = js.native
  
  /**
    * 
    * @brief 开始监听连接请求
    * @param backlog 指定请求队列长度，超出的请求将被拒绝，缺省为 120
    * 
    * 
    * 
    */
  def listen(): Unit = js.native
  def listen(backlog: Double): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前连接的本地地址
    * 
    * @readonly
    * @type String
    */
  var localAddress: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前连接的本地端口
    * 
    * @readonly
    * @type Integer
    */
  var localPort: Double = js.native
  
  /**
    * 
    * @brief 从连接读取指定大小的数据，不同于 read 方法，recv 并不保证读完要求的数据，而是在读取到数据后立即返回
    * @param bytes 指定要读取的数据量，缺省读取任意尺寸的数据
    * @return 返回从连接读取的数据
    * 
    * 
    * @async
    */
  def recv(): ClassBuffer = js.native
  def recv(bytes: Double): ClassBuffer = js.native
  
  /**
    * 
    * @brief 读取一个 UDP 包
    * recvfrom 返回结果中包含以下内容：
    * - data: 接收到的二进制数据块
    * - address: 发送方的地址
    * - port: 发送方的端口
    * @param bytes 指定要读取的数据量，缺省读取任意尺寸的数据
    * @return 返回从连接读取的数据包
    * 
    * 
    * @async
    */
  def recvfrom(): Any = js.native
  def recvfrom(bytes: Double): Any = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前连接的对方地址
    * 
    * @readonly
    * @type String
    */
  var remoteAddress: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前连接的对方端口
    * 
    * @readonly
    * @type Integer
    */
  var remotePort: Double = js.native
  
  /**
    * 
    * @brief 将给定的数据写入连接，此方法等效于 write 方法
    * @param data 给定要写入的数据
    * 
    * 
    * @async
    */
  def send(data: ClassBuffer): Unit = js.native
  
  /**
    * 
    * @brief 向给定 ip:port 发送一个 UDP 包
    * @param data 给定要写入的数据
    * @param host 指定目标 ip 或主机名
    * @param port 指定目标端口
    * 
    * 
    * @async
    */
  def sendto(data: ClassBuffer, host: String, port: Double): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置超时时间 单位毫秒
    * 
    * 
    * @type Integer
    */
  var timeout: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前 Socket 对象的协议族
    * 
    * @readonly
    * @type Integer
    */
  var `type`: Double = js.native
}
