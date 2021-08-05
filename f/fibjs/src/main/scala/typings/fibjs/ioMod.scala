package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 输入输出处理模块
  * @detail 使用方法：,```JavaScript,var io = require('io');,```
  */
object ioMod {
  
  @JSImport("io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io", "BufferedStream")
  @js.native
  class BufferedStream ()
    extends StObject
       with ClassBufferedStream
  
  @JSImport("io", "MemoryStream")
  @js.native
  class MemoryStream ()
    extends StObject
       with ClassMemoryStream
  
  inline def bridge(stm1: ClassStream, stm2: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bridge")(stm1.asInstanceOf[js.Any], stm2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyStream(from: ClassStream, to: ClassStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copyStream")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copyStream(from: ClassStream, to: ClassStream, bytes: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copyStream")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Double]
}
