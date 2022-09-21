package typings.genericPool

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generic-pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("generic-pool", "Pool")
  @js.native
  open class Pool[T] () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def acquire(): js.Promise[T] = js.native
    def acquire(priority: Double): js.Promise[T] = js.native
    
    var available: Double = js.native
    
    var borrowed: Double = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def destroy(resource: T): js.Promise[Unit] = js.native
    
    def drain(): js.Promise[Unit] = js.native
    
    def isBorrowedResource(resource: T): Boolean = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var pending: Double = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    def release(resource: T): js.Promise[Unit] = js.native
    
    var size: Double = js.native
    
    var spareResourceCapacity: Double = js.native
    
    def start(): Unit = js.native
    
    def use[U](cb: js.Function1[/* resource */ T, U | js.Promise[U]]): js.Promise[U] = js.native
  }
  
  inline def createPool[T](factory: Factory[T]): Pool[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(factory.asInstanceOf[js.Any]).asInstanceOf[Pool[T]]
  inline def createPool[T](factory: Factory[T], opts: Options): Pool[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(factory.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Pool[T]]
  
  trait Factory[T] extends StObject {
    
    def create(): js.Promise[T]
    
    def destroy(client: T): js.Promise[Unit]
    
    var validate: js.UndefOr[js.Function1[/* client */ T, js.Promise[Boolean]]] = js.undefined
  }
  object Factory {
    
    inline def apply[T](create: () => js.Promise[T], destroy: T => js.Promise[Unit]): Factory[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
      __obj.asInstanceOf[Factory[T]]
    }
    
    extension [Self <: Factory[?], T](x: Self & Factory[T]) {
      
      inline def setCreate(value: () => js.Promise[T]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: T => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setValidate(value: /* client */ T => js.Promise[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var autostart: js.UndefOr[Boolean] = js.undefined
    
    var evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
    
    var fifo: js.UndefOr[Boolean] = js.undefined
    
    var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxWaitingClients: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var numTestsPerEvictionRun: js.UndefOr[Double] = js.undefined
    
    var priorityRange: js.UndefOr[Double] = js.undefined
    
    var softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var testOnBorrow: js.UndefOr[Boolean] = js.undefined
    
    var testOnReturn: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
      
      inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      inline def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
      
      inline def setEvictionRunIntervalMillisUndefined: Self = StObject.set(x, "evictionRunIntervalMillis", js.undefined)
      
      inline def setFifo(value: Boolean): Self = StObject.set(x, "fifo", value.asInstanceOf[js.Any])
      
      inline def setFifoUndefined: Self = StObject.set(x, "fifo", js.undefined)
      
      inline def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxWaitingClients(value: Double): Self = StObject.set(x, "maxWaitingClients", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitingClientsUndefined: Self = StObject.set(x, "maxWaitingClients", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setNumTestsPerEvictionRun(value: Double): Self = StObject.set(x, "numTestsPerEvictionRun", value.asInstanceOf[js.Any])
      
      inline def setNumTestsPerEvictionRunUndefined: Self = StObject.set(x, "numTestsPerEvictionRun", js.undefined)
      
      inline def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
      
      inline def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
      
      inline def setSoftIdleTimeoutMillis(value: Double): Self = StObject.set(x, "softIdleTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setSoftIdleTimeoutMillisUndefined: Self = StObject.set(x, "softIdleTimeoutMillis", js.undefined)
      
      inline def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
      
      inline def setTestOnBorrowUndefined: Self = StObject.set(x, "testOnBorrow", js.undefined)
      
      inline def setTestOnReturn(value: Boolean): Self = StObject.set(x, "testOnReturn", value.asInstanceOf[js.Any])
      
      inline def setTestOnReturnUndefined: Self = StObject.set(x, "testOnReturn", js.undefined)
    }
  }
}
