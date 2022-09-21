package typings.es6WeakMap

import typings.es6WeakMap.mod.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WeakMap {
    
    @JSGlobal("WeakMap")
    @js.native
    open class ^[K, V] ()
      extends typings.es6WeakMap.mod.^[K, V] {
      def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
    }
  }
}
