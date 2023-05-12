package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassFile
  extends StObject
     with ClassSeekableStream {
  
  /**
    *
    * @brief 查询当前文件的访问权限，Windows 不支持此方法
    * @param mode 指定设定的访问权限
    *
    *
    * @async
    */
  def chmod(mode: Double): Unit = js.native
  
  /**
    * class prop
    *
    *
    * @brief 查询当前文件描述符
    *
    * @readonly
    * @note Assumed to be an integer.
    */
  var fd: Double = js.native
  
  /**
    * class prop
    *
    *
    * @brief 查询当前文件名
    *
    * @readonly
    *
    */
  var name: String = js.native
}
