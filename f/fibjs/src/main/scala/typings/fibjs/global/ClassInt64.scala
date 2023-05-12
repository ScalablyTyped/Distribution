package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 64位整数对象
  * @detail 创建方法：,```JavaScript,var n = new Int64(123);,```
  */
@JSGlobal("Class_Int64")
@js.native
/**
  *
  * @brief Int64 构造函数
  * @param num 初始化的值
  *
  *
  *
  */
open class ClassInt64 ()
  extends StObject
     with typings.fibjs.ClassInt64 {
  /**
    *
    * @brief Int64 构造函数
    * @param num 数字字符串
    * @param base 数字字符串的编码方式，可以接受 2-16, 32, 64，默认为 10，为 10 时自动识别 0x 编码
    *
    *
    *
    */
  def this(num: String) = this()
  def this(num: Double) = this()
  /**
    *
    * @brief Int64 构造函数
    * @param num 初始化的值
    *
    *
    *
    */
  def this(num: typings.fibjs.ClassInt64) = this()
  /**
    *
    * @brief Int64 构造函数
    * @param hi 高32位数
    * @param lo 低32位数
    *
    *
    *
    */
  def this(hi: Double, lo: Double) = this()
  def this(num: String, base: Double) = this()
}
