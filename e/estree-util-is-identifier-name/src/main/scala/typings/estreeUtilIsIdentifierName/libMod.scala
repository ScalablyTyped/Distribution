package typings.estreeUtilIsIdentifierName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("estree-util-is-identifier-name/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cont(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cont")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def name(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def start(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
