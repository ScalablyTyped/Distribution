package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassHttpRequest
  extends StObject
     with ClassHttpMessage {
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置请求地址
    * 
    * 
    * @type String
    */
  var address: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 获取包含消息 cookies 的容器
    * 
    * @readonly
    * @type HttpCollection
    */
  var cookies: ClassHttpCollection = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 获取包含消息 form 的容器
    * 
    * @readonly
    * @type HttpCollection
    */
  var form: ClassHttpCollection = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置请求方法
    * 
    * 
    * @type String
    */
  var method: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 获取包含消息 query 的容器
    * 
    * @readonly
    * @type HttpCollection
    */
  var query: ClassHttpCollection = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置请求查询字符串
    * 
    * 
    * @type String
    */
  var queryString: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 获取响应消息对象
    * 
    * @readonly
    * @type HttpResponse
    */
  var response: ClassHttpResponse = js.native
}
