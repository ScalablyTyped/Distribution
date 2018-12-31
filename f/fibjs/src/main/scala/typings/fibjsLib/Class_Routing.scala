package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Routing")
@js.native
/**
	 * 
	 * @brief 创建一个消息处理器路由对象
	 * @param map 初始化路由参数
	 * 
	 * 
	 * 
	 */
class Class_Routing () extends Class_Handler {
  def this(map: js.Object) = this()
  /**
  	 * 
  	 * @brief 创建一个消息处理器路由对象
  	 * @param method 指定 http 请求方法，"*" 接受所有方法
  	 * @param map 初始化路由参数
  	 * 
  	 * 
  	 * 
  	 */
  def this(method: java.lang.String, map: js.Object) = this()
  /**
  	 * 
  	 * @brief 添加一组接受所有 http 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def all(map: js.Object): Class_Routing = js.native
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
  def all(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def append(map: js.Object): Class_Routing = js.native
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
  def append(method: java.lang.String, pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
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
  def append(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 从已有路由对象中添加规则，添加后原路由将被清空
  	 * @param route 已经初始化的路由对象
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def append(route: Class_Routing): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组接受 http DELETE 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def del(map: js.Object): Class_Routing = js.native
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
  def del(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组 FIND 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def find(map: js.Object): Class_Routing = js.native
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
  def find(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组 GET 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def get(map: js.Object): Class_Routing = js.native
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
  def get(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组 PATCH 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def patch(map: js.Object): Class_Routing = js.native
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
  def patch(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组接受 http POST 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def post(map: js.Object): Class_Routing = js.native
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
  def post(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
  /**
  	 * 
  	 * @brief 添加一组 PUT 方法路由规则
  	 * @param map 路由参数
  	 * @return 返回路由对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def put(map: js.Object): Class_Routing = js.native
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
  def put(pattern: java.lang.String, hdlr: Class_Handler): Class_Routing = js.native
}

