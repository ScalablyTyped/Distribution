package typings.esrever

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esrever", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reverse(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("esrever", "version")
  @js.native
  val version: String = js.native
}
