package typings.encodingDown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractChainedBatch
import typings.abstractLeveldown.mod.AbstractGetOptions
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractIteratorOptions
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.AbstractOptions
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.encodingDown.mod.EncodingDown.BatchOptions
import typings.encodingDown.mod.EncodingDown.ChainedBatch
import typings.encodingDown.mod.EncodingDown.Constructor
import typings.encodingDown.mod.EncodingDown.DelOptions
import typings.encodingDown.mod.EncodingDown.GetOptions
import typings.encodingDown.mod.EncodingDown.IteratorOptions
import typings.encodingDown.mod.EncodingDown.PutOptions
import typings.levelCodec.mod.CodecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("encoding-down", JSImport.Default)
    @js.native
    class ^[K, V] protected ()
      extends StObject
         with EncodingDown[K, V] {
      // tslint:disable-next-line:no-unnecessary-generics
      def this(db: AbstractLevelDOWN[js.Any, js.Any]) = this()
      def this(db: AbstractLevelDOWN[js.Any, js.Any], options: CodecOptions) = this()
    }
    
    @JSImport("encoding-down", JSImport.Default)
    @js.native
    val ^ : js.Object & Constructor = js.native
    
    type _To = js.Object & Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: js.Object & Constructor = ^
  }
  
  @js.native
  trait EncodingDown[K, V]
    extends StObject
       with AbstractLevelDOWN[K, V] {
    
    def batch(array: js.Array[AbstractBatch[js.Any, js.Any]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[js.Any, js.Any] = js.native
    
    def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
    
    def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
    
    def iterator(options: IteratorOptions): AbstractIterator[js.Any, js.Any] = js.native
    
    def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
  }
  object EncodingDown {
    
    trait BatchOptions
      extends StObject
         with AbstractOptions
         with CodecOptions
    object BatchOptions {
      
      inline def apply(): BatchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchOptions]
      }
    }
    
    @js.native
    trait ChainedBatch[K, V]
      extends StObject
         with AbstractChainedBatch[K, V] {
      
      def write(cb: js.Any): js.Any = js.native
      def write(options: CodecOptions & AbstractOptions, cb: js.Any): js.Any = js.native
    }
    
    @js.native
    trait Constructor
      extends StObject
         with // tslint:disable-next-line:no-unnecessary-generics
    Instantiable1[/* db */ AbstractLevelDOWN[js.Any, js.Any], EncodingDown[js.Object, js.Object]]
         with Instantiable2[
              /* db */ AbstractLevelDOWN[js.Any, js.Any], 
              /* options */ CodecOptions, 
              EncodingDown[js.Object, js.Object]
            ] {
      
      // tslint:disable-next-line:no-unnecessary-generics
      def apply[K, V](db: AbstractLevelDOWN[js.Any, js.Any]): EncodingDown[K, V] = js.native
      def apply[K, V](db: AbstractLevelDOWN[js.Any, js.Any], options: CodecOptions): EncodingDown[K, V] = js.native
    }
    
    trait DelOptions
      extends StObject
         with AbstractOptions
         with CodecOptions
    object DelOptions {
      
      inline def apply(): DelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DelOptions]
      }
    }
    
    trait GetOptions
      extends StObject
         with AbstractGetOptions
         with CodecOptions
    object GetOptions {
      
      inline def apply(): GetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptions]
      }
    }
    
    trait IteratorOptions
      extends StObject
         with AbstractIteratorOptions[js.Any]
         with CodecOptions
    object IteratorOptions {
      
      inline def apply(): IteratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IteratorOptions]
      }
    }
    
    trait PutOptions
      extends StObject
         with AbstractOptions
         with CodecOptions
    object PutOptions {
      
      inline def apply(): PutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutOptions]
      }
    }
  }
}
