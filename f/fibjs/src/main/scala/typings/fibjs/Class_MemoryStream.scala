package typings.fibjs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_MemoryStream")
@js.native
/**
	 * 
	 * @brief MemoryStream 构造函数
	 * 
	 * 
	 */
class Class_MemoryStream () extends Class_SeekableStream {
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

