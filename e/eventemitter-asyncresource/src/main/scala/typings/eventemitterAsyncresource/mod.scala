package typings.eventemitterAsyncresource

import typings.eventemitterAsyncresource.anon.Name
import typings.node.asyncHooksMod.AsyncResource
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventemitter-asyncresource", JSImport.Namespace)
  @js.native
  open class ^ () extends EventEmitterAsyncResource {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    {readonly bind <Func extends (this : ThisArg, args : ...any): any, ThisArg>(fn : Func): Func, readonly bind <Func extends (this : ThisArg, args : ...any): any, ThisArg>(fn : Func, type : string): Func, readonly bind <Func extends (this : ThisArg, args : ...any): any, ThisArg>(fn : Func, type : string, thisArg : ThisArg): Func, readonly bind <Func extends (this : ThisArg, args : ...any): any, ThisArg>(fn : Func, type : undefined, thisArg : ThisArg): Func} & new (type : string): node.async_hooks.AsyncResource extends {new (name : string): node.async_hooks.AsyncResource, new (name : string, options : infer T): node.async_hooks.AsyncResource} ? T : never
    }}}
    */
  @js.native
  trait AsyncResourceOptions extends StObject
  
  @js.native
  trait EventEmitterAsyncResource extends EventEmitter {
    
    def asyncId(): Double = js.native
    
    def asyncResource: EventEmitterReferencingAsyncResource = js.native
    
    def emitDestroy(): Unit = js.native
    
    def triggerAsyncId(): Double = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    new (): node.events.EventEmitter & {  captureRejections :boolean, readonly on (emitter : node.events.<global>.NodeJS.EventEmitter, eventName : string): std.AsyncIterableIterator<any>, readonly on (emitter : node.events.<global>.NodeJS.EventEmitter, eventName : string, options : node.events.StaticEventEmitterOptions): std.AsyncIterableIterator<any>, readonly setMaxListeners (n : number, eventTargets : ...node.events._DOMEventTarget | node.events.<global>.NodeJS.EventEmitter): void, readonly setMaxListeners (n : undefined, eventTargets : ...node.events._DOMEventTarget | node.events.<global>.NodeJS.EventEmitter): void,  readonly errorMonitor :symbol,  readonly captureRejectionSymbol :symbol,   defaultMaxListeners :number, readonly once (emitter : node.events._NodeEventTarget, eventName : string): std.Promise<std.Array<any>>, readonly once (emitter : node.events._NodeEventTarget, eventName : symbol): std.Promise<std.Array<any>>, readonly once (emitter : node.events._NodeEventTarget, eventName : string, options : node.events.StaticEventEmitterOptions): std.Promise<std.Array<any>>, readonly once (emitter : node.events._NodeEventTarget, eventName : symbol, options : node.events.StaticEventEmitterOptions): std.Promise<std.Array<any>>, readonly once (emitter : node.events._DOMEventTarget, eventName : string): std.Promise<std.Array<any>>, readonly once (emitter : node.events._DOMEventTarget, eventName : string, options : node.events.StaticEventEmitterOptions): std.Promise<std.Array<any>>, readonly listenerCount (emitter : node.events.<global>.NodeJS.EventEmitter, eventName : string): number, readonly listenerCount (emitter : node.events.<global>.NodeJS.EventEmitter, eventName : symbol): number, readonly getEventListeners (emitter : node.events._DOMEventTarget, name : string): std.Array<std.Function>, readonly getEventListeners (emitter : node.events.<global>.NodeJS.EventEmitter, name : string): std.Array<std.Function>, readonly getEventListeners (emitter : node.events._DOMEventTarget, name : symbol): std.Array<std.Function>, readonly getEventListeners (emitter : node.events.<global>.NodeJS.EventEmitter, name : symbol): std.Array<std.Function>} extends {new (): node.events.EventEmitter, new (options : infer T): node.events.EventEmitter} ? T : never
    }}}
    */
  @js.native
  trait EventEmitterOptions extends StObject
  
  @js.native
  trait EventEmitterReferencingAsyncResource extends AsyncResource {
    
    def eventEmitter: EventEmitter = js.native
  }
  
  type Options = EventEmitterOptions & AsyncResourceOptions & Name
}
