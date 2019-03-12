package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 二进制数据缓存对象，用于 io 读写的数据处理
	* @detail Buffer 对象为全局基础类，在任何时候都可以直接以 new Buffer(...) 创建：,```JavaScript,var buf = new Buffer();,```
	*/
@JSGlobal("Class_Buffer")
@js.native
/**
	 * 
	 * @brief 缓存对象构造函数
	 * @param size 初始化缓冲区大小
	 * 
	 * 
	 * 
	 */
class Class_Buffer () extends Class__object {
  /**
  	 * 
  	 * @brief 缓存对象构造函数
  	 * @param buffer 初始化Buffer对象
  	 * 
  	 * 
  	 * 
  	 */
  def this(buffer: Class_Buffer) = this()
  /**
  	 * 
  	 * @brief 缓存对象构造函数
  	 * @param datas 初始化数据数组
  	 * 
  	 * 
  	 * 
  	 */
  def this(datas: js.Array[_]) = this()
  /**
  	 * 
  	 * @brief 缓存对象构造函数
  	 * @param datas 初始化数据数组
  	 * 
  	 * 
  	 * 
  	 */
  def this(datas: stdLib.ArrayBuffer) = this()
  /**
  	 * 
  	 * @brief 缓存对象构造函数
  	 * @param datas 初始化数据数组
  	 * 
  	 * 
  	 * 
  	 */
  def this(datas: stdLib.ArrayBufferView) = this()
  /**
  	 * 
  	 * @brief 缓存对象构造函数
  	 * @param datas 初始化数据数组
  	 * 
  	 * 
  	 * 
  	 */
  def this(datas: stdLib.ArrayLike[_]) = this()
  def this(size: scala.Double) = this()
  /**
  	 * 
  	 * @brief 缓存对象构造函数
  	 * @param str 初始化字符串，字符串将以 utf-8 格式写入，缺省则创建一个空对象
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * 
  	 * 
  	 * 
  	 */
  def this(str: java.lang.String) = this()
  def this(str: java.lang.String, codec: java.lang.String) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取缓存对象的尺寸
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var length: scala.Double = js.native
  /**
  	 * 
  	 * @brief 在缓存对象尾部写入一组二进制数据
  	 * @param data 初始化二进制数据
  	 * 
  	 * 
  	 * 
  	 */
  def append(data: Class_Buffer): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 在缓存对象尾部写入字符串，字符串将以 utf-8 格式写入
  	 * @param str 要写入的字符串
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * 
  	 * 
  	 * 
  	 */
  def append(str: java.lang.String): scala.Unit = js.native
  def append(str: java.lang.String, codec: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 使用 base64 编码缓存对象内容
  	 * @return 返回编码字符串
  	 * 
  	 * 
  	 * 
  	 */
  def base64(): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 比较缓存区的内容
  	 * @param buf 待比较缓存对象
  	 * @return 内容比较结果
  	 * 
  	 * 
  	 * 
  	 */
  def compare(buf: Class_Buffer): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从源缓存对象区域拷贝数据到目标缓存对象区域
  	 * @param targetBuffer 目标缓存对象
  	 * @param targetStart 目标缓存对象开始拷贝字节位置，缺省为 0
  	 * @param sourceStart 源缓存对象开始字节位置, 缺省为 0
  	 * @param sourceEnd 源缓存对象结束字节位置, 缺省为 -1,表示源数据长度
  	 * @return 拷贝的数据字节长度
  	 * 
  	 * 
  	 * 
  	 */
  def copy(targetBuffer: Class_Buffer): scala.Double = js.native
  def copy(targetBuffer: Class_Buffer, targetStart: scala.Double): scala.Double = js.native
  def copy(targetBuffer: Class_Buffer, targetStart: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def copy(
    targetBuffer: Class_Buffer,
    targetStart: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回包含对象数据 [index, byte] 对的迭代器
  	 * @return [index, byte] 对的迭代器
  	 * ```JavaScript
  	 * const buf = Buffer.from('buffer');
  	 * 
  	 * // Prints:
  	 * //   [0, 98]
  	 * //   [1, 117]
  	 * //   [2, 102]
  	 * //   [3, 102]
  	 * //   [4, 101]
  	 * //   [5, 114]
  	 * for (const pair of buf.entries()) {
  	 * console.log(pair);
  	 * }
  	 * ```
  	 * 
  	 * 
  	 * 
  	 */
  def entries(): stdLib.Iterable[_] = js.native
  /**
  	 * 
  	 * @brief 比较当前对象与给定的对象是否相等
  	 * @param expected 制定比较的目标对象
  	 * @return 返回对象比较的结果
  	 * 
  	 * 
  	 * 
  	 */
  def equals(expected: Class__object): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 为 Buffer 对象填充指定内容数据
  	 * @param v 需要填充的数据，如果未指定 offset 和 end，将填充满整个 buffer
  	 * @param offset 填充起始位置
  	 * @param end 填充终止位置
  	 * @return 返回当前 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def fill(v: Class_Buffer): Class_Buffer = js.native
  def fill(v: Class_Buffer, offset: scala.Double): Class_Buffer = js.native
  def fill(v: Class_Buffer, offset: scala.Double, end: scala.Double): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 为 Buffer 对象填充指定内容数据
  	 * @param v 需要填充的数据，如果未指定 offset 和 end，将填充满整个 buffer
  	 * @param offset 填充起始位置
  	 * @param end 填充终止位置
  	 * @return 返回当前 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def fill(v: java.lang.String): Class_Buffer = js.native
  def fill(v: java.lang.String, offset: scala.Double): Class_Buffer = js.native
  def fill(v: java.lang.String, offset: scala.Double, end: scala.Double): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 为 Buffer 对象填充指定内容数据
  	 * @param v 需要填充的数据，如果未指定 offset 和 end，将填充满整个 buffer
  	 * @param offset 填充起始位置
  	 * @param end 填充终止位置
  	 * @return 返回当前 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def fill(v: scala.Double): Class_Buffer = js.native
  def fill(v: scala.Double, offset: scala.Double): Class_Buffer = js.native
  def fill(v: scala.Double, offset: scala.Double, end: scala.Double): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 使用 16 进制编码缓存对象内容
  	 * @return 返回编码字符串
  	 * 
  	 * 
  	 * 
  	 */
  def hex(): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 返回某个指定数据在 Buffer 中首次出现的位置
  	 * @param v 待查找数据，如果未指定 offset，默认从起始位开始
  	 * @param offset 起始查找位置
  	 * @return 返回查找到的位置，未找到返回 -1
  	 * 
  	 * 
  	 * 
  	 */
  def indexOf(v: Class_Buffer): scala.Double = js.native
  def indexOf(v: Class_Buffer, offset: scala.Double): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回某个指定数据在 Buffer 中首次出现的位置
  	 * @param v 待查找数据，如果未指定 offset，默认从起始位开始
  	 * @param offset 起始查找位置
  	 * @return 返回查找到的位置，未找到返回 -1
  	 * 
  	 * 
  	 * 
  	 */
  def indexOf(v: java.lang.String): scala.Double = js.native
  def indexOf(v: java.lang.String, offset: scala.Double): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回某个指定数据在 Buffer 中首次出现的位置
  	 * @param v 待查找数据，如果未指定 offset，默认从起始位开始
  	 * @param offset 起始查找位置
  	 * @return 返回查找到的位置，未找到返回 -1
  	 * 
  	 * 
  	 * 
  	 */
  def indexOf(v: scala.Double): scala.Double = js.native
  def indexOf(v: scala.Double, offset: scala.Double): scala.Double = js.native
  /**
  	 * 
  	 * @brief 把当前对象中的所有元素放入一个字符串
  	 * @param separator 分割字符，缺省为 ","
  	 * @return 返回生成的字符串
  	 * 
  	 * 
  	 * 
  	 */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 返回全部二进制数据的数组
  	 * @return 返回包含对象数据索引的迭代器
  	 * 
  	 * 
  	 * 
  	 */
  def keys(): stdLib.Iterable[_] = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个双精度浮点数，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的双精度浮点数
  	 * 
  	 * 
  	 * 
  	 */
  def readDoubleBE(): scala.Double = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  def readDoubleBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个双精度浮点数，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的双精度浮点数
  	 * 
  	 * 
  	 * 
  	 */
  def readDoubleLE(): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  def readDoubleLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个浮点数，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的浮点数
  	 * 
  	 * 
  	 * 
  	 */
  def readFloatBE(): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  def readFloatBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个浮点数，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的浮点数
  	 * 
  	 * 
  	 * 
  	 */
  def readFloatLE(): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  def readFloatLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 16 位整型数值，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt16BE(): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  def readInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 16 位整型数值，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt16LE(): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  def readInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 32 位整型数值，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt32BE(): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  def readInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 32 位整型数值，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt32LE(): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  def readInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 64 位整型数值，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt64BE(): Class_Int64 = js.native
  def readInt64BE(offset: scala.Double): Class_Int64 = js.native
  def readInt64BE(offset: scala.Double, noAssert: scala.Boolean): Class_Int64 = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 64 位整型数值，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt64LE(): Class_Int64 = js.native
  def readInt64LE(offset: scala.Double): Class_Int64 = js.native
  def readInt64LE(offset: scala.Double, noAssert: scala.Boolean): Class_Int64 = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 8 位整型数值
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readInt8(): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  def readInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个整型数值，最大支持 48 位，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readIntBE(): scala.Double = js.native
  def readIntBE(offset: scala.Double): scala.Double = js.native
  def readIntBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个整型数值，最大支持 48 位，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readIntLE(): scala.Double = js.native
  def readIntLE(offset: scala.Double): scala.Double = js.native
  def readIntLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 16 位无符号整型数值，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUInt16BE(): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  def readUInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 16 位无符号整型数值，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUInt16LE(): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  def readUInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 32 位无符号整型数值，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUInt32BE(): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  def readUInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 32 位无符号整型数值，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUInt32LE(): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  def readUInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个 8 位无符号整型数值
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUInt8(): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  def readUInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个无符号整型数值，最大支持 48 位，以高字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUIntBE(): scala.Double = js.native
  def readUIntBE(offset: scala.Double): scala.Double = js.native
  def readUIntBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 从缓存对象读取一个无符号整型数值，最大支持 48 位，以低字节序的存储方式
  	 * @param offset 指定读取的起始位置，缺省为 0
  	 * @param noAssert 指定读取越界时不抛出错误，缺省为 flase，抛出
  	 * @return 返回读取的整型数值
  	 * 
  	 * 
  	 * 
  	 */
  def readUIntLE(): scala.Double = js.native
  def readUIntLE(offset: scala.Double): scala.Double = js.native
  def readUIntLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 修改缓存对象尺寸
  	 * @param sz 指定新尺寸
  	 * 
  	 * 
  	 * 
  	 */
  def resize(sz: scala.Double): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 返回一个新缓存对象，包含当前对象数据的倒序
  	 * @return 返回新的缓存对象
  	 * 
  	 * 
  	 * 
  	 */
  def reverse(): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 返回一个新缓存对象，包含指定起始到缓存结尾的数据
  	 * @param start 指定范围的起始，缺省从头开始
  	 * @return 返回新的缓存对象
  	 * 
  	 * 
  	 * 
  	 */
  def slice(): Class_Buffer = js.native
  def slice(start: scala.Double): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 返回一个新缓存对象，包含指定范围的数据，若范围超出缓存，则只返回有效部分数据
  	 * @param start 指定范围的起始
  	 * @param end 指定范围的结束
  	 * @return 返回新的缓存对象
  	 * 
  	 * 
  	 * 
  	 */
  def slice(start: scala.Double, end: scala.Double): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 返回全部二进制数据的数组
  	 * @return 返回包含对象数据的数组
  	 * 
  	 * 
  	 * 
  	 */
  def toArray(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 返回二进制数据的编码字符串
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @param offset 读取起始位置
  	 * @param end 读取终止位置
  	 * @return 返回对象的字符串表示
  	 * 
  	 * 
  	 * 
  	 */
  def toString(codec: java.lang.String): java.lang.String = js.native
  def toString(codec: java.lang.String, offset: scala.Double): java.lang.String = js.native
  def toString(codec: java.lang.String, offset: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
  	 * 
  	 * @brief 返回全部二进制数据的数组
  	 * @return 返回包含对象数据值的迭代器
  	 * 
  	 * 
  	 * 
  	 */
  def values(): stdLib.Iterable[_] = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入指定字符串，字符串默认为utf-8，越界时只写入部分数据
  	 * @param str 待写入的字符串
  	 * @param offset 写入起始位置
  	 * @param length 写入长度（单位字节，默认值-1），未指定时为待写入字符串的长度
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 写入的数据字节长度
  	 * 
  	 * 
  	 * 
  	 */
  def write(str: java.lang.String): scala.Double = js.native
  def write(str: java.lang.String, codec: java.lang.String): scala.Double = js.native
  def write(str: java.lang.String, offset: scala.Double): scala.Double = js.native
  def write(str: java.lang.String, offset: scala.Double, codec: java.lang.String): scala.Double = js.native
  def write(str: java.lang.String, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(str: java.lang.String, offset: scala.Double, length: scala.Double, codec: java.lang.String): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个双精度浮点数，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeDoubleBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个双精度浮点数，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeDoubleLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个浮点数，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeFloatBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个浮点数，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeFloatLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 16 位整型数值，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt16BE(value: scala.Double): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 16 位整型数值，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt16LE(value: scala.Double): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 32 位整型数值，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt32BE(value: scala.Double): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 32 位整型数值，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt32LE(value: scala.Double): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 64 位整型数值，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt64BE(value: Class_Int64): scala.Double = js.native
  def writeInt64BE(value: Class_Int64, offset: scala.Double): scala.Double = js.native
  def writeInt64BE(value: Class_Int64, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 64 位整型数值，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt64LE(value: Class_Int64): scala.Double = js.native
  def writeInt64LE(value: Class_Int64, offset: scala.Double): scala.Double = js.native
  def writeInt64LE(value: Class_Int64, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 8 位整型数值
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeInt8(value: scala.Double): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个整型数值，最大支持 48 位，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeIntBE(value: scala.Double): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个整型数值，最大支持 48 位，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeIntLE(value: scala.Double): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 16 位无符号整型数值，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUInt16BE(value: scala.Double): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 16 位无符号整型数值，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUInt16LE(value: scala.Double): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 32 位无符号整型数值，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUInt32BE(value: scala.Double): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 32 位无符号整型数值，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUInt32LE(value: scala.Double): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个 8 位无符号整型数值
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUInt8(value: scala.Double): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个无符号整型数值，最大支持 48 位，以高字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUIntBE(value: scala.Double): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 向缓存对象写入一个无符号整型数值，最大支持 48 位，以低字节序的存储方式
  	 * @param value 指定写入的数值
  	 * @param offset 指定写入的起始位置
  	 * @param noAssert 指定写入越界时不抛出错误，缺省为 flase，抛出
  	 * @return offset 加上写入的字节数
  	 * 
  	 * 
  	 * 
  	 */
  def writeUIntLE(value: scala.Double): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
}

/* static members */
@JSGlobal("Class_Buffer")
@js.native
object Class_Buffer extends js.Object {
  /**
  	 * 
  	 * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
  	 * @param size 缓冲区的所需长度
  	 * @param fill 预先填充新缓冲区的值，可使用 string/buffer/integer 值类型。 默认值：0
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 填充好的新 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def alloc(size: scala.Double): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
  	 * @param size 缓冲区的所需长度
  	 * @param fill 预先填充新缓冲区的值，可使用 string/buffer/integer 值类型。 默认值：0
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 填充好的新 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def alloc(size: scala.Double, fill: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def alloc(size: scala.Double, fill: fibjsLib.Class_Buffer, codec: java.lang.String): fibjsLib.Class_Buffer = js.native
  def alloc(size: scala.Double, fill: java.lang.String): fibjsLib.Class_Buffer = js.native
  def alloc(size: scala.Double, fill: java.lang.String, codec: java.lang.String): fibjsLib.Class_Buffer = js.native
  def alloc(size: scala.Double, fill: scala.Double): fibjsLib.Class_Buffer = js.native
  def alloc(size: scala.Double, fill: scala.Double, codec: java.lang.String): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
  	 * @param size 缓冲区的所需长度
  	 * @return 指定尺寸的新 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def allocUnsafe(size: scala.Double): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
  	 * @param size 缓冲区的所需长度
  	 * @return 指定尺寸的新 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def allocUnsafeSlow(size: scala.Double): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 返回字符串的实际字节长度
  	 * @param str 待取字节的字符串，如果str为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 返回实际字节长度
  	 * 
  	 * 
  	 * 
  	 */
  def byteLength(str: fibjsLib.Class_Buffer): scala.Double = js.native
  def byteLength(str: fibjsLib.Class_Buffer, codec: java.lang.String): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回字符串的实际字节长度
  	 * @param str 待取字节的字符串，如果str为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 返回实际字节长度
  	 * 
  	 * 
  	 * 
  	 */
  def byteLength(str: java.lang.String): scala.Double = js.native
  def byteLength(str: java.lang.String, codec: java.lang.String): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回字符串的实际字节长度
  	 * @param str 待取字节的字符串，如果str为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 返回实际字节长度
  	 * 
  	 * 
  	 * 
  	 */
  def byteLength(str: stdLib.ArrayBuffer): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回字符串的实际字节长度
  	 * @param str 待取字节的字符串，如果 str 为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 返回实际字节长度
  	 * 
  	 * 
  	 * 
  	 */
  def byteLength(str: stdLib.ArrayBufferView): scala.Double = js.native
  def byteLength(str: stdLib.ArrayBufferView, codec: java.lang.String): scala.Double = js.native
  def byteLength(str: stdLib.ArrayBuffer, codec: java.lang.String): scala.Double = js.native
  /**
  	 * 
  	 * @brief 拼接多个缓存区中的数据
  	 * @param buflist 待拼接的Buffer数组
  	 * @param cutLength 截取多少个Buffer对象
  	 * @return 拼接后产生的新 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def concat(buflist: js.Array[_]): fibjsLib.Class_Buffer = js.native
  def concat(buflist: js.Array[_], cutLength: scala.Double): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 通过其他 Buffer 创建 Buffer 对象
  	 * @param buffer 给定 Buffer 类型变量用于创建 Buffer 对象
  	 * @param byteOffset 指定数据起始位置，起始为 0
  	 * @param length 指定数据长度，起始位 -1，表示剩余所有数据
  	 * @return 返回 Buffer 实例
  	 * 
  	 * 
  	 * 
  	 */
  def from(buffer: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def from(buffer: fibjsLib.Class_Buffer, byteOffset: scala.Double): fibjsLib.Class_Buffer = js.native
  def from(buffer: fibjsLib.Class_Buffer, byteOffset: scala.Double, length: scala.Double): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 通过字符串创建 Buffer 对象
  	 * @param str 初始化字符串，字符串将以 utf-8 格式写入
  	 * @param byteOffset 指定数据起始位置，起始为 0
  	 * @param length 指定数据长度，起始位 -1，表示剩余所有数据
  	 * @return 返回 Buffer 实例
  	 * 
  	 * 
  	 * 
  	 */
  /**
  	 * 
  	 * @brief 通过字符串创建 Buffer 对象
  	 * @param str 初始化字符串，字符串将以 utf-8 格式写入，缺省则创建一个空对象
  	 * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 返回 Buffer 实例
  	 * 
  	 * 
  	 * 
  	 */
  def from(str: java.lang.String): fibjsLib.Class_Buffer = js.native
  def from(str: java.lang.String, byteOffset: scala.Double): fibjsLib.Class_Buffer = js.native
  def from(str: java.lang.String, byteOffset: scala.Double, length: scala.Double): fibjsLib.Class_Buffer = js.native
  def from(str: java.lang.String, codec: java.lang.String): fibjsLib.Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 检测给定的变量是否是 Buffer 对象
  	 * @param v 给定需要检测的变量
  	 * @return 传入对象是否 Buffer 对象
  	 * 
  	 * 
  	 * 
  	 */
  def isBuffer(v: js.Any): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 检测编码格式是否被支持
  	 * @param codec 待检测的编码格式
  	 * @return 是否支持
  	 * 
  	 * 
  	 * 
  	 */
  def isEncoding(codec: java.lang.String): scala.Boolean = js.native
}

