package typings.emberOrderedSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/ordered-set", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait OrderedSet[T] extends js.Object {
    def add(value: T): this.type = js.native
    def clear(): Unit = js.native
    def copy(): OrderedSet[T] = js.native
    def delete(value: T): Boolean = js.native
    def forEach(
      callbackfn: js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ T, 
          /* value2 */ T, 
          /* set */ OrderedSet[T], 
          Unit
        ]
    ): Unit = js.native
    def forEach[Ctx](
      callbackfn: js.ThisFunction3[/* this */ Ctx, /* value */ T, /* value2 */ T, /* set */ OrderedSet[T], Unit],
      context: Ctx
    ): Unit = js.native
    def has(value: T): Boolean = js.native
    def isEmpty(): Boolean = js.native
    def toArray(): js.Array[T] = js.native
  }
  
  @js.native
  class default[T] () extends OrderedSet[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    // Disable this to let users call like `OrderedSet.create<string>();`. This
    // is a rare case where it's preferable, because it's *much* briefer than
    // `let set: OrderedSet<string> = OrderedSet.create();`. If TS could infer
    // from usage what the type would be, this wouldn't be required, but until
    // it does, this is better than *not* allowing it.
    // tslint:disable-next-line:no-unnecessary-generics
    def create[T](): OrderedSet[T] = js.native
  }
  
}

