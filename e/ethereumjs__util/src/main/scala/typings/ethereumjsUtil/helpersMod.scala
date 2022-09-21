package typings.ethereumjsUtil

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@ethereumjs/util/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertIsArray(input: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsArray")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertIsBuffer(input: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertIsHexString(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsHexString")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertIsString(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsString")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
