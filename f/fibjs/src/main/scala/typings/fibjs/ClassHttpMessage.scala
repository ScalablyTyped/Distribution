package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassHttpMessage
  extends StObject
     with ClassMessage {
  
  /**
    * 
    * @brief 添加一个消息头，添加数据并不修改已存在的键值的消息头
    * @param map 指定要添加的键值数据字典
    * 
    * 
    * 
    */
  def addHeader(map: js.Object): Unit = js.native
  /**
    * 
    * @brief 添加一个消息头，添加数据并不修改已存在的键值的消息头
    * @param name 指定要添加的键值
    * @param value 指定要添加的数据
    * 
    * 
    * 
    */
  def addHeader(name: String, value: Any): Unit = js.native
  
  /**
    * 
    * @brief 查询指定键值的全部消息头
    * @param name 指定要查询的键值
    * @return 返回键值所对应全部值的数组，若数据不存在，则返回 null
    * 
    * 
    * 
    */
  def allHeader(name: String): js.Array[Any] = js.native
  
  /**
    * 
    * @brief 查询指定键值的第一个消息头
    * @param name 指定要查询的键值
    * @return 返回键值所对应的值，若不存在，则返回 undefined
    * 
    * 
    * 
    */
  def firstHeader(name: String): Any = js.native
  
  /**
    * 
    * @brief 检查是否存在指定键值的消息头
    * @param name 指定要检查的键值
    * @return 返回键值是否存在
    * 
    * 
    * 
    */
  def hasHeader(name: String): Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 包含消息中 http 消息头的容器，只读属性
    * 
    * @readonly
    * @type HttpCollection
    */
  var headers: ClassHttpCollection = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设定是否保持连接
    * 
    * 
    * @type Boolean
    */
  var keepAlive: Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 body 最大尺寸，以 MB 为单位，缺省为 64
    * 
    * 
    * @type Integer
    */
  var maxBodySize: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置最大请求头个数，缺省为 128
    * 
    * 
    * @type Integer
    */
  var maxHeadersCount: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 协议版本信息，允许的格式为：HTTP/#.#
    * 
    * 
    * @type String
    */
  var protocol: String = js.native
  
  /**
    * 
    * @brief 删除指定键值的全部消息头
    * @param name 指定要删除的键值
    * 
    * 
    * 
    */
  def removeHeader(name: String): Unit = js.native
  
  /**
    * 
    * @brief 设定一个消息头，设定数据将修改键值所对应的第一个数值，并清除相同键值的其余消息头
    * @param map 指定要设定的键值数据字典
    * 
    * 
    * 
    */
  def setHeader(map: js.Object): Unit = js.native
  /**
    * 
    * @brief 设定一个消息头，设定数据将修改键值所对应的第一个数值，并清除相同键值的其余消息头
    * @param name 指定要设定的键值
    * @param value 指定要设定的数据
    * 
    * 
    * 
    */
  def setHeader(name: String, value: Any): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前对象的来源 socket
    * 
    * @readonly
    * @type Stream
    */
  var socket: ClassStream = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设定是否是升级协议
    * 
    * 
    * @type Boolean
    */
  var upgrade: Boolean = js.native
}
