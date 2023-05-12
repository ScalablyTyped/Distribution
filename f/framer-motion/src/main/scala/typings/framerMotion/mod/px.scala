package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object px {
  
  @JSImport("framer-motion", "px")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("framer-motion", "px.parse")
  @js.native
  def parse: js.Function1[/* string */ String, Double] = js.native
  inline def parse_=(x: js.Function1[/* string */ String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  
  inline def test(v: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def test(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transform(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def transform(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(v.asInstanceOf[js.Any]).asInstanceOf[String]
}
