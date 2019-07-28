package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_SeekableStream")
@js.native
class Class_SeekableStream () extends Class_Stream {
  /**
  	 * 
  	 * @brief 查询文件是否到结尾
  	 * @return 返回 True 表示结尾
  	 * 
  	 * 
  	 * 
  	 */
  def eof(): Boolean = js.native
  /**
  	 * 
  	 * @brief 从流内读取剩余的全部数据
  	 * @return 返回从流内读取的数据，若无数据可读，或者连接中断，则返回 null
  	 * 
  	 * 
  	 * @async
  	 */
  def readAll(): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 移动当前位置到流开头
  	 * 
  	 * 
  	 */
  def rewind(): Unit = js.native
  /**
  	 * 
  	 * @brief 移动文件当前操作位置
  	 * @param offset 指定新的位置
  	 * @param whence 指定位置基准，允许的值为：SEEK_SET, SEEK_CUR, SEEK_END
  	 * 
  	 * 
  	 * 
  	 */
  def seek(offset: Double, whence: Double): Unit = js.native
  /**
  	 * 
  	 * @brief 查询流尺寸
  	 * @return 返回流尺寸
  	 * 
  	 * 
  	 * 
  	 */
  def size(): Double = js.native
  /**
  	 * 
  	 * @brief 查询当前文件的基础信息
  	 * @return 返回 Stat 对象描述文件信息
  	 * 
  	 * 
  	 * @async
  	 */
  def stat(): Class_Stat = js.native
  /**
  	 * 
  	 * @brief 查询流当前位置
  	 * @return 返回流当前位置
  	 * 
  	 * 
  	 * 
  	 */
  def tell(): Double = js.native
  /**
  	 * 
  	 * @brief 修改文件尺寸，如果新尺寸小于原尺寸，则文件被截断
  	 * @param bytes 新的文件尺寸
  	 * 
  	 * 
  	 * @async
  	 */
  def truncate(bytes: Double): Unit = js.native
}

