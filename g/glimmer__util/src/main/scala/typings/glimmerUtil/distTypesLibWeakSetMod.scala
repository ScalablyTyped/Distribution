package typings.glimmerUtil

import org.scalablytyped.runtime.Shortcut
import typings.std.WeakSet
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibWeakSetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@glimmer/util/dist/types/lib/weak-set", JSImport.Default)
  @js.native
  /* standard es2015.collection */
  open class default[T /* <: js.Object */] ()
    extends StObject
       with WeakSet[T] {
    /* standard es2015.iterable */
    def this(iterable: js.Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("@glimmer/util/dist/types/lib/weak-set", JSImport.Default)
  @js.native
  val default: WeakSetConstructor = js.native
  
  type _To = WeakSetConstructor
  
  /* This means you don't have to write `default`, but can instead just say `distTypesLibWeakSetMod.foo` */
  override def _to: WeakSetConstructor = default
}
