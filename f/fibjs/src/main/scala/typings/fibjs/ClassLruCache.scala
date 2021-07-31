package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassLruCache
  extends StObject
     with ClassEventEmitter {
  
  /**
    * 
    * @brief 清除容器数据
    * 
    * 
    */
  def clear(): Unit = js.native
  
  /**
    * 
    * @brief 查询指定键值的值
    * @param name 指定要查询的键值
    * @return 返回键值所对应的值，若不存在，则返回 undefined
    * 
    * 
    * 
    */
  def get(name: String): js.Any = js.native
  /**
    * 
    * @brief 查询指定键值的值，若不存在或过期，则调用回调函数更新数据
    * @param name 指定要查询的键值
    * @param updater 指定更新函数
    * @return 返回键值所对应的值
    * 
    * 
    * 
    */
  def get(name: String, updater: js.Function): js.Any = js.native
  
  /**
    * 
    * @brief 检查容器内是否存在指定键值的数据
    * @param name 指定要检查的键值
    * @return 返回键值是否存在
    * 
    * 
    * 
    */
  def has(name: String): Boolean = js.native
  
  /**
    * 
    * @brief 检查容器是否为空
    * @return 容器内无数值则返回 true
    * 
    * 
    * 
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和绑定数据超时事件，相当于 on("expire", func);
    * 
    * 
    * @type Function
    */
  var onexpire: js.Function = js.native
  
  /**
    * 
    * @brief 删除指定键值的全部值
    * @param name 指定要删除的键值
    * 
    * 
    * 
    */
  def remove(name: String): Unit = js.native
  
  /**
    * 
    * @brief 设定一个键值数据，键值不存在则插入新数据
    * @param map 指定要设定的键值数据字典
    * 
    * 
    * 
    */
  def set(map: js.Object): Unit = js.native
  /**
    * 
    * @brief 设定一个键值数据，键值不存在则插入一条新数据
    * @param name 指定要设定的键值
    * @param value 指定要设定的数据
    * 
    * 
    * 
    */
  def set(name: String, value: js.Any): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询容器内数值个数
    * 
    * @readonly
    * @type Integer
    */
  var size: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置容器内元素失效时间，单位是 ms，小于等于 0 不失效
    * 
    * 
    * @type Integer
    */
  var timeout: Double = js.native
}
