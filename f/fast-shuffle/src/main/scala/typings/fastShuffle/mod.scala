package typings.fastShuffle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](randomSeed: Double, deck: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(randomSeed.asInstanceOf[js.Any], deck.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def shuffle[T](deck: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(deck.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
