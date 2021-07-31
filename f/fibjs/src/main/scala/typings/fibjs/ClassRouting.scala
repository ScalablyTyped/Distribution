package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassRouting
  extends StObject
     with ClassHandler {
  
  /**
    * 
    * @brief 添加一组接受所有 http 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def all(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受所有 http 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def all(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def append(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条路由规则
    * @param method 指定 http 请求方法，"*" 接受所有方法
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def append(method: String, pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def append(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  /**
    * 
    * @brief 从已有路由对象中添加规则，添加后原路由将被清空
    * @param route 已经初始化的路由对象
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def append(route: ClassRouting): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组接受 http DELETE 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def del(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受 http DELETE 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def del(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组 FIND 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def find(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受 http FIND 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def find(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组 GET 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def get(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受 http GET 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def get(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组 PATCH 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def patch(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受 http PATCH 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def patch(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组接受 http POST 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def post(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受 http POST 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def post(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
  
  /**
    * 
    * @brief 添加一组 PUT 方法路由规则
    * @param map 路由参数
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def put(map: js.Object): ClassRouting = js.native
  /**
    * 
    * @brief 添加一条接受 http PUT 方法路由规则
    * @param pattern 消息匹配格式
    * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * @return 返回路由对象本身
    * 
    * 
    * 
    */
  def put(pattern: String, hdlr: ClassHandler): ClassRouting = js.native
}
