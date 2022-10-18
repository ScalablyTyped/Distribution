package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetIdMod {
  
  @JSImport("@fluentui/utilities/lib/getId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[String]
  inline def getId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resetIds(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIds")().asInstanceOf[Unit]
  inline def resetIds(counter: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIds")(counter.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
