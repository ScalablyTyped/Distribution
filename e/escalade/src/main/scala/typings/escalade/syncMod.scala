package typings.escalade

import typings.escalade.escaladeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("escalade/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(directory: String, callback: Callback): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(directory.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  type Callback = js.Function2[/* directory */ String, /* files */ js.Array[String], String | `false` | Unit]
}
