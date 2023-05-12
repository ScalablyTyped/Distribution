package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassHttpHandler
  extends StObject
     with ClassHandlerEx {
  
  /**
    *
    * @brief 允许跨域请求
    * @param allowHeaders 指定接受的 http 头字段
    *
    *
    *
    */
  def enableCrossOrigin(): Unit = js.native
  def enableCrossOrigin(allowHeaders: String): Unit = js.native
  
  /**
    * class prop
    *
    *
    * @brief 查询和设置是否允强制使用 gzip 压缩输出，缺省为 false
    *
    *
    * @type Boolean
    */
  var forceGZIP: Boolean = js.native
  
  /**
    * class prop
    *
    *
    * @brief 查询和设置 body 最大尺寸，以 MB 为单位，缺省为 64
    *
    *
    * @note Assumed to be an integer.
    */
  var maxBodySize: Double = js.native
  
  /**
    * class prop
    *
    *
    * @brief 查询和设置最大请求头个数，缺省为 128
    *
    *
    * @note Assumed to be an integer.
    */
  var maxHeadersCount: Double = js.native
  
  /**
    * class prop
    *
    *
    * @brief 查询和设置服务器名称，缺省为：fibjs/0.x.0
    *
    *
    *
    */
  var serverName: String = js.native
}
