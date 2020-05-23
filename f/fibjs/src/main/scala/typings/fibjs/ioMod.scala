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
  class BufferedStream () extends ClassBufferedStream
  
  @js.native
  class MemoryStream () extends ClassMemoryStream
  
  def bridge(stm1: ClassStream, stm2: ClassStream): Unit = js.native
  def copyStream(from: ClassStream, to: ClassStream): Double = js.native
  def copyStream(from: ClassStream, to: ClassStream, bytes: Double): Double = js.native
}

