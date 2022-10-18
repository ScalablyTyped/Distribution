package typings.ethersprojectRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShuffleMod {
  
  @JSImport("@ethersproject/random/lib/shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shuffled(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffled")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
