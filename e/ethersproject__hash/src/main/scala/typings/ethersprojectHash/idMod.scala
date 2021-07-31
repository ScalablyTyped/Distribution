package typings.ethersprojectHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idMod {
  
  @JSImport("@ethersproject/hash/lib/id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def id(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
