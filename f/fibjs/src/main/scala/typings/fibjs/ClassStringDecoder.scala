package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 流解码对象
  * @detail
  */
@js.native
trait ClassStringDecoder
  extends StObject
     with ClassObject {
  
  /**
    * class prop
    *
    *
    * @brief 解码编码.内部使用。
    *
    *
    *
    */
  var encoding: String = js.native
  
  /**
    *
    * @brief 将内部存留的 buffer 作为字符返回。不完整的 UTF-8 和 UTF-16 字节会尝试补全。
    * @return 解码后的字符串.
    *
    *
    *
    */
  def end(): String = js.native
  /**
    *
    * @brief 将内部存留的 buffer 作为字符返回。不完整的 UTF-8 和 UTF-16 字节会尝试补全。
    * @param buf 需要解码的 Buffer. 在执行 end 之前，会先调用 write 将 buffer 写入。
    * @return 解码后的字符串.
    *
    *
    *
    */
  def end(buf: ClassBuffer): String = js.native
  
  /**
    *
    * @brief 内部使用。.
    * @param buf A Buffer containing the bytes to decode.
    * @return 解码后的字符串.
    *
    *
    *
    */
  def fillLast(buf: ClassBuffer): String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 内部使用。
    *
    *
    * @type Buffer
    */
  var lastChar: ClassBuffer = js.native
  
  /**
    * class prop
    *
    *
    * @brief 内部使用。
    *
    *
    * @note Assumed to be an integer.
    */
  var lastNeed: Double = js.native
  
  /**
    * class prop
    *
    *
    * @brief 内部使用。
    *
    *
    * @note Assumed to be an integer.
    */
  var lastTotal: Double = js.native
  
  /**
    *
    * @brief 内部使用。.
    * @param buf 需要解码的 Buffer。
    * @param offset 解码偏移量
    * @return 解码后的字符串.
    *
    *
    *
    */
  def text(buf: ClassBuffer, offset: Double): String = js.native
  
  /**
    *
    * @brief 返回一个解码后的字符串, 确保任何非完整的末尾字符被省略此次不返回，并被存储在内部供下一次的 write 或者 end 方法使用。
    * @param  buf 需要解码的 Buffer。
    * @return 解码后的字符串.
    *
    *
    *
    */
  def write(buf: ClassBuffer): String = js.native
}
