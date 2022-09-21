package typings.fastCrc32c

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-crc32c", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculate(buf: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculate(buf: String, initial: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculate(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculate(buf: Buffer, initial: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[Double]
}
