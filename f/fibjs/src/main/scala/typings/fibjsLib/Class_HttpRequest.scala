package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_HttpRequest")
@js.native
class Class_HttpRequest () extends Class_HttpMessage {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置请求地址
  	 * 
  	 * 
  	 * @type String
  	 */
  var address: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取包含消息 cookies 的容器
  	 * 
  	 * @readonly
  	 * @type HttpCollection
  	 */
  var cookies: Class_HttpCollection = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取包含消息 form 的容器
  	 * 
  	 * @readonly
  	 * @type HttpCollection
  	 */
  var form: Class_HttpCollection = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置请求方法
  	 * 
  	 * 
  	 * @type String
  	 */
  var method: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取包含消息 query 的容器
  	 * 
  	 * @readonly
  	 * @type HttpCollection
  	 */
  var query: Class_HttpCollection = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置请求查询字符串
  	 * 
  	 * 
  	 * @type String
  	 */
  var queryString: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取响应消息对象
  	 * 
  	 * @readonly
  	 * @type HttpResponse
  	 */
  var response: Class_HttpResponse = js.native
}

