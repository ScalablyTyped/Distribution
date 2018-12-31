package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 流解码对象
	* @detail 
	*/
@JSGlobal("Class_StringDecoder")
@js.native
/**
	 * 
	 * @brief 解码器构造函数
	 * @param encoding 解码编码. 默认 'utf8'.
	 * 
	 * 
	 * 
	 */
class Class_StringDecoder () extends Class__object {
  def this(encoding: java.lang.String) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 解码编码.内部使用。
  	 * 
  	 * 
  	 * @type String
  	 */
  var encoding: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 内部使用。
  	 * 
  	 * 
  	 * @type Buffer
  	 */
  var lastChar: Class_Buffer = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 内部使用。
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var lastNeed: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 内部使用。
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var lastTotal: scala.Double = js.native
  /**
  	 * 
  	 * @brief 将内部存留的 buffer 作为字符返回。不完整的 UTF-8 和 UTF-16 字节会尝试补全。
  	 * @return 解码后的字符串.
  	 * 
  	 * 
  	 * 
  	 */
  def end(): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 将内部存留的 buffer 作为字符返回。不完整的 UTF-8 和 UTF-16 字节会尝试补全。
  	 * @param buf 需要解码的 Buffer. 在执行 end 之前，会先调用 write 将 buffer 写入。
  	 * @return 解码后的字符串.
  	 * 
  	 * 
  	 * 
  	 */
  def end(buf: Class_Buffer): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 内部使用。.
  	 * @param buf A Buffer containing the bytes to decode.
  	 * @return 解码后的字符串.
  	 * 
  	 * 
  	 * 
  	 */
  def fillLast(buf: Class_Buffer): java.lang.String = js.native
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
  def text(buf: Class_Buffer, offset: scala.Double): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 返回一个解码后的字符串, 确保任何非完整的末尾字符被省略此次不返回，并被存储在内部供下一次的 write 或者 end 方法使用。
  	 * @param  buf 需要解码的 Buffer。
  	 * @return 解码后的字符串.
  	 * 
  	 * 
  	 * 
  	 */
  def write(buf: Class_Buffer): java.lang.String = js.native
}

