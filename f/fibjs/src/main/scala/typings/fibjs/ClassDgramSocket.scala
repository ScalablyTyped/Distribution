package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassDgramSocket
  extends StObject
     with ClassEventEmitter {
  
  /**
    * 
    * @brief 返回一个包含 socket 地址信息的对象。对于 UDP socket，该对象将包含 address、family 和 port 属性。
    * @return 返回对象绑定地址
    * 
    * 
    * 
    */
  def address(): Any = js.native
  
  /**
    * 
    * @brief 该方法会令 dgram.Socket 在指定的 `port` 和 `addr` 上监听数据包信息。绑定完成时会触发一个 `listening` 事件。
    * @param port 指定绑定端口，若 `port` 未指定或为 0，操作系统会尝试绑定一个随机的端口
    * @param addr 指定绑定地址，若 address 未指定，操作系统会尝试在所有地址上监听。
    * 
    * 
    * @async
    */
  def bind(): Unit = js.native
  /**
    * 
    * @brief 该方法会令 dgram.Socket 在 `opts` 指定的 `port` 和 `address` 上监听数据包信息。绑定完成时会触发一个 `listening` 事件。
    * @param opts 指定绑定参数
    * 
    * 
    * @async
    */
  def bind(opts: js.Object): Unit = js.native
  def bind(port: Double): Unit = js.native
  def bind(port: Double, addr: String): Unit = js.native
  def bind(port: Unit, addr: String): Unit = js.native
  
  /**
    * 
    * @brief 关闭当前 socket
    * 
    * 
    */
  def close(): Unit = js.native
  /**
    * 
    * @brief 关闭当前 socket
    * @param callback 关闭完成后的回调函数，它相当于为 `close` 事件添加了一个监听器
    * 
    * 
    * 
    */
  def close(callback: js.Function): Unit = js.native
  
  /**
    * 
    * @brief 查询 socket 接收缓冲区大小
    * @return 返回查询结果
    * 
    * 
    * 
    */
  def getRecvBufferSize(): Double = js.native
  
  /**
    * 
    * @brief 查询 socket 发送缓冲区大小
    * @return 返回查询结果
    * 
    * 
    * 
    */
  def getSendBufferSize(): Double = js.native
  
  /**
    * 
    * @brief 维持 fibjs 进程不退出，在对象绑定期间阻止 fibjs 进程退出
    * @return 返回当前对象
    * 
    * 
    * 
    */
  def ref(): ClassDgramSocket = js.native
  
  /**
    * 
    * @brief 在 socket 上发送一个数据包
    * @param msg 指定发送的数据
    * @param offset 从指定偏移开始发送
    * @param length 之发送指定长度
    * @param port 指定发送的目的端口
    * @param address 指定发送的目的地址
    * @return 返回发送尺寸
    * 
    * 
    * @async
    */
  def send(msg: ClassBuffer, offset: Double, length: Double, port: Double): Double = js.native
  def send(msg: ClassBuffer, offset: Double, length: Double, port: Double, address: String): Double = js.native
  /**
    * 
    * @brief 在 socket 上发送一个数据包
    * @param msg 指定发送的数据
    * @param port 指定发送的目的端口
    * @param address 指定发送的目的地址
    * @return 返回发送尺寸
    * 
    * 
    * @async
    */
  def send(msg: ClassBuffer, port: Double): Double = js.native
  def send(msg: ClassBuffer, port: Double, address: String): Double = js.native
  
  /**
    * 
    * @brief 设置或清除 SO_BROADCAST socket 选项
    * @param flag 当设置为 true, UDP包会被发送到一个本地接口的广播地址
    * 
    * 
    * 
    */
  def setBroadcast(flag: Boolean): Unit = js.native
  
  /**
    * 
    * @brief 设置 socket 接收缓冲区大小
    * @param size 指定要设置的尺寸
    * 
    * 
    * 
    */
  def setRecvBufferSize(size: Double): Unit = js.native
  
  /**
    * 
    * @brief 设置 socket 发送缓冲区大小
    * @param size 指定要设置的尺寸
    * 
    * 
    * 
    */
  def setSendBufferSize(size: Double): Unit = js.native
  
  /**
    * 
    * @brief 允许 fibjs 进程退出，在对象绑定期间允许 fibjs 进程退出
    * @return 返回当前对象
    * 
    * 
    * 
    */
  def unref(): ClassDgramSocket = js.native
}
