package typings.dexieBatch

import typings.dexie.mod.Dexie.Collection
import typings.dexie.mod.Dexie.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dexie-batch", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DexieBatch {
    def this(opts: Options) = this()
  }
  
  type Callback[T] = js.Function2[/* item */ T, /* index */ Double, Unit]
  
  @js.native
  trait DexieBatch extends StObject {
    
    def each[T](collection: Collection[T, Any], callback: Callback[T]): Promise[Double] = js.native
    
    def eachBatch[T](collection: Collection[T, Any], callback: Callback[js.Array[T]]): Promise[Double] = js.native
    
    def eachBatchParallel[T](collection: Collection[T, Any], callback: Callback[js.Array[T]]): Promise[Double] = js.native
    
    def eachBatchSerial[T](collection: Collection[T, Any], callback: Callback[js.Array[T]]): Promise[Double] = js.native
    def eachBatchSerial[T](collection: Collection[T, Any], callback: Callback[js.Array[T]], batchIdx: Double): Promise[Double] = js.native
    
    def isParallel(): Boolean = js.native
    
    /* private */ val opts: Options = js.native
  }
  
  trait Options extends StObject {
    
    var batchSize: Double
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(batchSize: Double): Options = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
