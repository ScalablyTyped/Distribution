package typings.devtools

import typings.devtools.anon.ElementIdName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementPropertyMod {
  
  @JSImport("devtools/build/commands/getElementProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasElementIdName: ElementIdName): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementIdName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
