package typings.engineIoClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yeastMod {
  
  @JSImport("engine.io-client/build/esm/contrib/yeast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(str: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encode(num: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def yeast(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("yeast")().asInstanceOf[String]
}
