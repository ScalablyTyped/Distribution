package typings.devtools

import typings.devtools.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementSendKeysMod {
  
  @JSImport("devtools/build/commands/elementSendKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasElementIdText: Text): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementIdText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
}
