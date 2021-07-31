package typings.devtools

import typings.devtools.anon.ElementIdName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementAttributeMod {
  
  @JSImport("devtools/build/commands/getElementAttribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasElementIdName: ElementIdName): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementIdName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
}
