package typings.genericPool

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generic-pool", "Pool")
  @js.native
  class Pool[T] () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def acquire(): js.Thenable[T] = js.native
    def acquire(priority: Double): js.Thenable[T] = js.native
    
    var available: Double = js.native
    
    var borrowed: Double = js.native
    
    def clear(): js.Thenable[Unit] = js.native
    
    def destroy(resource: T): js.Thenable[Unit] = js.native
    
    def drain(): js.Thenable[Unit] = js.native
    
    def isBorrowedResource(resource: T): Boolean = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var pending: Double = js.native
    
    def release(resource: T): js.Thenable[Unit] = js.native
    
    var size: Double = js.native
    
    var spareResourceCapacity: Double = js.native
    
    def start(): Unit = js.native
    
    def use[U](cb: js.Function1[/* resource */ T, U | js.Thenable[U]]): js.Thenable[U] = js.native
  }
  
  @JSImport("generic-pool", "createPool")
  @js.native
  def createPool[T](factory: Factory[T]): Pool[T] = js.native
  @JSImport("generic-pool", "createPool")
  @js.native
  def createPool[T](factory: Factory[T], opts: Options): Pool[T] = js.native
  
  @js.native
  trait Factory[T] extends StObject {
    
    def create(): js.Thenable[T] = js.native
    
    def destroy(client: T): js.Thenable[Unit] = js.native
    
    var validate: js.UndefOr[js.Function1[/* client */ T, js.Thenable[Boolean]]] = js.native
  }
  object Factory {
    
    @scala.inline
    def apply[T](create: () => js.Thenable[T], destroy: T => js.Thenable[Unit]): Factory[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
      __obj.asInstanceOf[Factory[T]]
    }
    
    @scala.inline
    implicit class FactoryMutableBuilder[Self <: Factory[_], T] (val x: Self with Factory[T]) extends AnyVal {
      
      @scala.inline
      def setCreate(value: () => js.Thenable[T]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: T => js.Thenable[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: /* client */ T => js.Thenable[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var acquireTimeoutMillis: js.UndefOr[Double] = js.native
    
    var autostart: js.UndefOr[Boolean] = js.native
    
    var evictionRunIntervalMillis: js.UndefOr[Double] = js.native
    
    var fifo: js.UndefOr[Boolean] = js.native
    
    var idleTimeoutMillis: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxWaitingClients: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var numTestsPerEvictionRun: js.UndefOr[Double] = js.native
    
    var priorityRange: js.UndefOr[Double] = js.native
    
    var softIdleTimeoutMillis: js.UndefOr[Double] = js.native
    
    var testOnBorrow: js.UndefOr[Boolean] = js.native
    
    var testOnReturn: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
      
      @scala.inline
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      @scala.inline
      def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvictionRunIntervalMillisUndefined: Self = StObject.set(x, "evictionRunIntervalMillis", js.undefined)
      
      @scala.inline
      def setFifo(value: Boolean): Self = StObject.set(x, "fifo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFifoUndefined: Self = StObject.set(x, "fifo", js.undefined)
      
      @scala.inline
      def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaxWaitingClients(value: Double): Self = StObject.set(x, "maxWaitingClients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitingClientsUndefined: Self = StObject.set(x, "maxWaitingClients", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setNumTestsPerEvictionRun(value: Double): Self = StObject.set(x, "numTestsPerEvictionRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumTestsPerEvictionRunUndefined: Self = StObject.set(x, "numTestsPerEvictionRun", js.undefined)
      
      @scala.inline
      def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
      
      @scala.inline
      def setSoftIdleTimeoutMillis(value: Double): Self = StObject.set(x, "softIdleTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftIdleTimeoutMillisUndefined: Self = StObject.set(x, "softIdleTimeoutMillis", js.undefined)
      
      @scala.inline
      def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestOnBorrowUndefined: Self = StObject.set(x, "testOnBorrow", js.undefined)
      
      @scala.inline
      def setTestOnReturn(value: Boolean): Self = StObject.set(x, "testOnReturn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestOnReturnUndefined: Self = StObject.set(x, "testOnReturn", js.undefined)
    }
  }
}
