package typings.fibjs.global

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class ClassBuffer ()
  extends StObject
     with typings.fibjs.ClassBuffer {
  /**
    * 
    * @brief 缓存对象构造函数
    * @param buffer 初始化Buffer对象
    * 
    * 
    * 
    */
  def this(buffer: typings.fibjs.ClassBuffer) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: js.Array[js.Any]) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: ArrayBuffer) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: ArrayBufferView) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: ArrayLike[js.Any]) = this()
  def this(size: Double) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param str 初始化字符串，字符串将以 utf-8 格式写入，缺省则创建一个空对象
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * 
    * 
    * 
    */
  def this(str: String) = this()
  def this(str: String, codec: String) = this()
}
object ClassBuffer {
  
  @JSGlobal("Class_Buffer")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def alloc(size: Double): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def alloc(size: Double, fill: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def alloc(size: Double, fill: String, codec: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def alloc(size: Double, fill: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def alloc(size: Double, fill: Double, codec: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def alloc(size: Double, fill: Unit, codec: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
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
  /* static member */
  inline def alloc(size: Double, fill: typings.fibjs.ClassBuffer): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def alloc(size: Double, fill: typings.fibjs.ClassBuffer, codec: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  
  /**
    * 
    * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
    * @param size 缓冲区的所需长度
    * @return 指定尺寸的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  inline def allocUnsafe(size: Double): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
  
  /**
    * 
    * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
    * @param size 缓冲区的所需长度
    * @return 指定尺寸的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  inline def allocUnsafeSlow(size: Double): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafeSlow")(size.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
  
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
  /* static member */
  inline def byteLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(str: String, codec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[Double]
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
  /* static member */
  inline def byteLength(str: typings.fibjs.ClassBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(str: typings.fibjs.ClassBuffer, codec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[Double]
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
  /* static member */
  inline def byteLength(str: ArrayBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
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
  /* static member */
  inline def byteLength(str: ArrayBufferView): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(str: ArrayBufferView, codec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def byteLength(str: ArrayBuffer, codec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  /* static member */
  inline def concat(buflist: js.Array[js.Any]): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buflist.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def concat(buflist: js.Array[js.Any], cutLength: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buflist.asInstanceOf[js.Any], cutLength.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  
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
  /* static member */
  inline def from(buffer: typings.fibjs.ClassBuffer): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(buffer: typings.fibjs.ClassBuffer, byteOffset: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(buffer: typings.fibjs.ClassBuffer, byteOffset: Double, length: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(buffer: typings.fibjs.ClassBuffer, byteOffset: Unit, length: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
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
  /* static member */
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
  inline def from(str: String): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(str: String, byteOffset: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(str: String, byteOffset: Double, length: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(str: String, byteOffset: Unit, length: Double): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  inline def from(str: String, codec: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  
  /**
    * 
    * @brief 检测给定的变量是否是 Buffer 对象
    * @param v 给定需要检测的变量
    * @return 传入对象是否 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  inline def isBuffer(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * 
    * @brief 检测编码格式是否被支持
    * @param codec 待检测的编码格式
    * @return 是否支持
    * 
    * 
    * 
    */
  /* static member */
  inline def isEncoding(codec: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(codec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
