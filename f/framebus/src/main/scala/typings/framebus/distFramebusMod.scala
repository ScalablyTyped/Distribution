package typings.framebus

import typings.framebus.distLibTypesMod.FramebusOnHandler
import typings.framebus.distLibTypesMod.FramebusReplyHandler
import typings.framebus.distLibTypesMod.FramebusSubscriberArg
import typings.framebus.distLibTypesMod.global.Window
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFramebusMod {
  
  @JSImport("framebus/dist/framebus", "Framebus")
  @js.native
  open class Framebus () extends StObject {
    def this(options: FramebusOptions) = this()
    
    var channel: String = js.native
    
    /* private */ var checkOrigin: Any = js.native
    
    def emit(eventName: String): Boolean = js.native
    def emit(eventName: String, data: Unit, reply: FramebusReplyHandler): Boolean = js.native
    def emit(eventName: String, data: FramebusReplyHandler): Boolean = js.native
    def emit(eventName: String, data: FramebusReplyHandler, reply: FramebusReplyHandler): Boolean = js.native
    def emit(eventName: String, data: FramebusSubscriberArg): Boolean = js.native
    def emit(eventName: String, data: FramebusSubscriberArg, reply: FramebusReplyHandler): Boolean = js.native
    
    def emitAsPromise[T](eventName: String): js.Promise[T] = js.native
    def emitAsPromise[T](eventName: String, data: FramebusSubscriberArg): js.Promise[T] = js.native
    
    def include(childWindow: Window): Boolean = js.native
    
    /* private */ var isDestroyed: Any = js.native
    
    /* private */ var listeners: Any = js.native
    
    /* private */ var namespaceEvent: Any = js.native
    
    def off(eventName: String, originalHandler: FramebusOnHandler): Boolean = js.native
    
    def on(eventName: String, originalHandler: FramebusOnHandler): Boolean = js.native
    
    var origin: String = js.native
    
    def target(): Framebus = js.native
    def target(options: FramebusOptions): Framebus = js.native
    
    def teardown(): Unit = js.native
    
    /* private */ var verifyDomain: Any = js.native
  }
  /* static members */
  object Framebus {
    
    @JSImport("framebus/dist/framebus", "Framebus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("framebus/dist/framebus", "Framebus.Promise")
    @js.native
    def Promise: PromiseConstructor = js.native
    inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    inline def setPromise(PromiseGlobal: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPromise")(PromiseGlobal.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def target(): Framebus = ^.asInstanceOf[js.Dynamic].applyDynamic("target")().asInstanceOf[Framebus]
    inline def target(options: FramebusOptions): Framebus = ^.asInstanceOf[js.Dynamic].applyDynamic("target")(options.asInstanceOf[js.Any]).asInstanceOf[Framebus]
  }
  
  trait FramebusOptions extends StObject {
    
    var channel: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var verifyDomain: js.UndefOr[VerifyDomainMethod] = js.undefined
  }
  object FramebusOptions {
    
    inline def apply(): FramebusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FramebusOptions]
    }
    
    extension [Self <: FramebusOptions](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setVerifyDomain(value: /* domain */ String => Boolean): Self = StObject.set(x, "verifyDomain", js.Any.fromFunction1(value))
      
      inline def setVerifyDomainUndefined: Self = StObject.set(x, "verifyDomain", js.undefined)
    }
  }
  
  type VerifyDomainMethod = js.Function1[/* domain */ String, Boolean]
}
