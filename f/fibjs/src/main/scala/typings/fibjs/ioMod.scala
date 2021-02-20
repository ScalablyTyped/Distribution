package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 输入输出处理模块
  * @detail 使用方法：,```JavaScript,var io = require('io');,```
  */
object ioMod {
  
  @JSImport("io", "BufferedStream")
  @js.native
  class BufferedStream () extends ClassBufferedStream
  
  @JSImport("io", "MemoryStream")
  @js.native
  class MemoryStream () extends ClassMemoryStream
  
  @JSImport("io", "bridge")
  @js.native
  def bridge(stm1: ClassStream, stm2: ClassStream): Unit = js.native
  
  @JSImport("io", "copyStream")
  @js.native
  def copyStream(from: ClassStream, to: ClassStream): Double = js.native
  @JSImport("io", "copyStream")
  @js.native
  def copyStream(from: ClassStream, to: ClassStream, bytes: Double): Double = js.native
}
