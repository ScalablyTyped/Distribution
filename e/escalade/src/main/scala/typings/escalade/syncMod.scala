package typings.escalade

import typings.escalade.escaladeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("escalade/sync", JSImport.Default)
  @js.native
  def default(directory: String, callback: Callback): String | Unit = js.native
  
  type Callback = js.Function2[/* directory */ String, /* files */ js.Array[String], String | `false` | Unit]
}
