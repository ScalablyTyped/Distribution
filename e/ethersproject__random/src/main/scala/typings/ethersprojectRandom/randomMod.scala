package typings.ethersprojectRandom

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("@ethersproject/random/lib/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def randomBytes(length: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
