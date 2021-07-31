package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_LruCache")
@js.native
class ClassLruCache protected ()
  extends StObject
     with typings.fibjs.ClassLruCache {
  /**
    * 
    * @brief LruCache 对象构造函数
    * @param size 缓存最大尺寸
    * @param timeout 元素失效时间，单位是 ms，小于等于 0 不失效，缺省为 0
    * 
    * 
    * 
    */
  def this(size: Double) = this()
  def this(size: Double, timeout: Double) = this()
}
