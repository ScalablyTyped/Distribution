package typings.framebus

import typings.framebus.typesMod.FramebusOnHandler
import typings.framebus.typesMod.FramebusReplyHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import typings.framebus.typesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object framebusMod {
  
  @JSImport("framebus/dist/framebus", "Framebus")
  @js.native
  class Framebus () extends StObject {
    def this(options: FramebusOptions) = this()
    
    var channel: String = js.native
    
    var checkOrigin: js.Any = js.native
    
    def emit(eventName: String): Boolean = js.native
    def emit(eventName: String, data: js.UndefOr[scala.Nothing], reply: FramebusReplyHandler): Boolean = js.native
    def emit(eventName: String, data: FramebusReplyHandler): Boolean = js.native
    def emit(eventName: String, data: FramebusReplyHandler, reply: FramebusReplyHandler): Boolean = js.native
    def emit(eventName: String, data: FramebusSubscriberArg): Boolean = js.native
    def emit(eventName: String, data: FramebusSubscriberArg, reply: FramebusReplyHandler): Boolean = js.native
    
    def include(childWindow: Window): Boolean = js.native
    
    var isDestroyed: js.Any = js.native
    
    var listeners: js.Any = js.native
    
    var namespaceEvent: js.Any = js.native
    
    def off(eventName: String, originalHandler: FramebusOnHandler): Boolean = js.native
    
    def on(eventName: String, originalHandler: FramebusOnHandler): Boolean = js.native
    
    var origin: String = js.native
    
    def target(): Framebus = js.native
    def target(options: FramebusOptions): Framebus = js.native
    
    def teardown(): Unit = js.native
    
    var verifyDomain: js.Any = js.native
  }
  /* static members */
  object Framebus {
    
    @JSImport("framebus/dist/framebus", "Framebus.target")
    @js.native
    def target(): Framebus = js.native
    @JSImport("framebus/dist/framebus", "Framebus.target")
    @js.native
    def target(options: FramebusOptions): Framebus = js.native
  }
  
  @js.native
  trait FramebusOptions extends StObject {
    
    var channel: js.UndefOr[String] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var verifyDomain: js.UndefOr[VerifyDomainMethod] = js.native
  }
  object FramebusOptions {
    
    @scala.inline
    def apply(): FramebusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FramebusOptions]
    }
    
    @scala.inline
    implicit class FramebusOptionsMutableBuilder[Self <: FramebusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setVerifyDomain(value: /* domain */ String => Boolean): Self = StObject.set(x, "verifyDomain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyDomainUndefined: Self = StObject.set(x, "verifyDomain", js.undefined)
    }
  }
  
  type VerifyDomainMethod = js.Function1[/* domain */ String, Boolean]
}
