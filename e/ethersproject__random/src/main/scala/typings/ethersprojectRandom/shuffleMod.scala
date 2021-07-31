package typings.ethersprojectRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shuffleMod {
  
  @JSImport("@ethersproject/random/lib/shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shuffled(array: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffled")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
}
