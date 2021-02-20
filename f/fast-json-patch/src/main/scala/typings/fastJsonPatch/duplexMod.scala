package typings.fastJsonPatch

import typings.fastJsonPatch.coreMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplexMod {
  
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_]): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Object): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Array[_]): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  
  @JSImport("fast-json-patch/commonjs/duplex", "generate")
  @js.native
  def generate[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "generate")
  @js.native
  def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
  
  @JSImport("fast-json-patch/commonjs/duplex", "observe")
  @js.native
  def observe[T](obj: js.Array[T]): Observer[T] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "observe")
  @js.native
  def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "observe")
  @js.native
  def observe[T](obj: js.Object): Observer[T] = js.native
  @JSImport("fast-json-patch/commonjs/duplex", "observe")
  @js.native
  def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  
  @JSImport("fast-json-patch/commonjs/duplex", "unobserve")
  @js.native
  def unobserve[T](root: T, observer: Observer[T]): Unit = js.native
  
  @js.native
  trait Observer[T] extends StObject {
    
    def callback(patches: js.Array[Operation]): Unit = js.native
    
    var `object`: T = js.native
    
    var patches: js.Array[Operation] = js.native
    
    def unobserve(): Unit = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[T](
      callback: js.Array[Operation] => Unit,
      `object`: T,
      patches: js.Array[Operation],
      unobserve: () => Unit
    ): Observer[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), patches = patches.asInstanceOf[js.Any], unobserve = js.Any.fromFunction0(unobserve))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Array[Operation] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatches(value: js.Array[Operation]): Self = StObject.set(x, "patches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchesVarargs(value: Operation*): Self = StObject.set(x, "patches", js.Array(value :_*))
      
      @scala.inline
      def setUnobserve(value: () => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction0(value))
    }
  }
}
