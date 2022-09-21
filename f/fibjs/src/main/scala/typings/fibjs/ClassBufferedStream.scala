package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBufferedStream
  extends StObject
     with ClassStream {
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置行结尾标识，缺省时，posix:\"\\n\"；windows:\"\\r\\n\"
    * 
    * 
    * @type String
    */
  var EOL: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置当前对象处理文本时的字符集，缺省为 utf-8
    * 
    * 
    * @type String
    */
  var charset: String = js.native
  
  /**
    * 
    * @brief 读取一行文本，行结尾标识基于 EOL 属性的设置，缺省时，posix:\"\\n\"；windows:\"\\r\\n\"
    * @param maxlen 指定此次读取的最大字符串，以 utf8 编码字节数为准，缺省不限制字符数
    * @return 返回读取的文本字符串，若无数据可读，或者连接中断，则返回 null
    * 
    * 
    * @async
    */
  def readLine(): String = js.native
  def readLine(maxlen: Double): String = js.native
  
  /**
    * 
    * @brief 以数组方式读取一组文本行，行结尾标识基于 EOL 属性的设置，缺省时，posix:\"\\n\"；windows:\"\\r\\n\"
    * @param maxlines 指定此次读取的最大行数，缺省读取全部文本行
    * @return 返回读取的文本行数组，若无数据可读，或者连接中断，空数组
    * 
    * 
    * 
    */
  def readLines(): js.Array[Any] = js.native
  def readLines(maxlines: Double): js.Array[Any] = js.native
  
  /**
    * 
    * @brief 读取指定字符的文本
    * @param size 指定读取的文本字符个数，以 utf8 或者指定的编码字节数为准
    * @return 返回读取的文本字符串，若无数据可读，或者连接中断，则返回 null
    * 
    * 
    * @async
    */
  def readText(size: Double): String = js.native
  
  /**
    * 
    * @brief 读取一个文本字符串，以指定的字节为结尾
    * @param mk 指定结尾的字符串
    * @param maxlen 指定此次读取的最大字符串，以 utf8 编码字节数为准，缺省不限制字符数
    * @return 返回读取的文本字符串，若无数据可读，或者连接中断，则返回 null
    * 
    * 
    * @async
    */
  def readUntil(mk: String): String = js.native
  def readUntil(mk: String, maxlen: Double): String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询创建缓存对象时的流对象
    * 
    * @readonly
    * @type Stream
    */
  var stream: ClassStream = js.native
  
  /**
    * 
    * @brief 写入一个字符串，并写入换行符
    * @param txt 指定写入的字符串
    * 
    * 
    * @async
    */
  def writeLine(txt: String): Unit = js.native
  
  /**
    * 
    * @brief 写入一个字符串
    * @param txt 指定写入的字符串
    * 
    * 
    * @async
    */
  def writeText(txt: String): Unit = js.native
}
