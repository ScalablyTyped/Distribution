package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 输入输出处理模块
	* @detail 使用方法：,```JavaScript,var io = require('io');,```
	*/
@JSImport("io", JSImport.Namespace)
@js.native
object ioMod extends js.Object {
  @js.native
  class BufferedStream () extends Class_BufferedStream
  
  @js.native
  class MemoryStream () extends Class_MemoryStream
  
  def bridge(stm1: Class_Stream, stm2: Class_Stream): Unit = js.native
  def copyStream(from: Class_Stream, to: Class_Stream): Double = js.native
  def copyStream(from: Class_Stream, to: Class_Stream, bytes: Double): Double = js.native
}

