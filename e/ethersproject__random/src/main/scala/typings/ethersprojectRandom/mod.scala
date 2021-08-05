package typings.ethersprojectRandom

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomBytes(length: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def shuffled(array: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffled")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
}
