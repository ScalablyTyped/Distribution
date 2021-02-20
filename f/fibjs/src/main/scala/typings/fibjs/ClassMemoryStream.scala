package typings.fibjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassMemoryStream extends ClassSeekableStream {
  
  /**
    * 
    * @brief 清空内存文件数据，复位指针
    * 
    * 
    */
  def clear(): Unit = js.native
  
  /**
    * 
    * @brief 强制设定内存流对象的最后更新时间
    * @param d 指定要设定的时间
    * 
    * 
    * 
    */
  def setTime(d: Date): Unit = js.native
}
