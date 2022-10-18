package typings.fontCarrier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classBaseMod {
  
  @JSImport("font-carrier/class/base", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with Base[T] {
    def this(arg0: T) = this()
  }
  
  @js.native
  trait Base[T] extends StObject {
    
    var defaultOptions: T = js.native
    
    /** 获取构造参数的属性  */
    def get(key: String): String | Double = js.native
    
    def init(options: T): Unit = js.native
    
    /** 构造参数 */
    var options: T = js.native
    
    /** 设置构造参数的属性 */
    def set(key: String, value: String): Unit = js.native
    def set(key: String, value: Double): Unit = js.native
    
    /** 设置构造参数 */
    def setOptions(options: T): Unit = js.native
  }
}
