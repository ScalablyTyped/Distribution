package typings.devcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificatesMod {
  
  @JSImport("devcert/dist/certificates", JSImport.Default)
  @js.native
  def default(domain: String): js.Promise[Unit] = js.native
  
  @JSImport("devcert/dist/certificates", "generateKey")
  @js.native
  def generateKey(filename: String): Unit = js.native
}
