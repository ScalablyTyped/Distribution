package typings.fastJsonPatch

import typings.fastJsonPatch.moduleCoreMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleDuplexMod {
  
  @JSImport("fast-json-patch/module/duplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(tree1: js.Array[Any], tree2: js.Array[Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Array[Any], tree2: js.Array[Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Array[Any], tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Array[Any], tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Array[Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Array[Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def generate[T](observer: Observer[js.Object]): js.Array[Operation] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Operation]]
  inline def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def observe[T](obj: js.Array[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def observe[T](obj: js.Object): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  
  inline def unobserve[T](root: T, observer: Observer[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(root.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Observer[T] extends StObject {
    
    def callback(patches: js.Array[Operation]): Unit
    
    var `object`: T
    
    var patches: js.Array[Operation]
    
    def unobserve(): Unit
  }
  object Observer {
    
    inline def apply[T](
      callback: js.Array[Operation] => Unit,
      `object`: T,
      patches: js.Array[Operation],
      unobserve: () => Unit
    ): Observer[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), patches = patches.asInstanceOf[js.Any], unobserve = js.Any.fromFunction0(unobserve))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setCallback(value: js.Array[Operation] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPatches(value: js.Array[Operation]): Self = StObject.set(x, "patches", value.asInstanceOf[js.Any])
      
      inline def setPatchesVarargs(value: Operation*): Self = StObject.set(x, "patches", js.Array(value*))
      
      inline def setUnobserve(value: () => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction0(value))
    }
  }
}
