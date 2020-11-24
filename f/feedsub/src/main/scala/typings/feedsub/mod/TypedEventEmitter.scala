package typings.feedsub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type-safe event emitter from https://github.com/andywer/typed-emitter.
  *
  * Use it like this:
  *
  * interface MyEvents {
  *   error: (error: Error) => void
  *   message: (from: string, content: string) => void
  * }
  *
  * const myEmitter = new EventEmitter() as TypedEmitter<MyEvents>
  *
  * myEmitter.on("message", (from, content) => {
  *   // ...
  * })
  *
  * myEmitter.emit("error", "x")  // <- Will catch this type error
  */
@js.native
trait TypedEventEmitter[Events] extends js.Object {
  
  def addListener[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def emit[E /* <: /* keyof Events */ String */](
    event: E,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArguments<Events[E]> is not an array type */ args: EventArguments[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ]
  ): Boolean = js.native
  
  def eventNames(): js.Array[/* keyof Events */ String] = js.native
  
   // tslint:disable-line no-unnecessary-generics
  def getMaxListeners(): Double = js.native
  
   // tslint:disable-line:ban-types no-unnecessary-generics
  def listenerCount[E /* <: /* keyof Events */ String */](event: E): Double = js.native
  
   // tslint:disable-line:ban-types no-unnecessary-generics
  def listeners[E /* <: /* keyof Events */ String */](event: E): js.Array[js.Function] = js.native
  
  def off[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def on[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def once[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def prependListener[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def rawListeners[E /* <: /* keyof Events */ String */](event: E): js.Array[js.Function] = js.native
  
  def removeAllListeners[E /* <: /* keyof Events */ String */](): this.type = js.native
  def removeAllListeners[E /* <: /* keyof Events */ String */](event: E): this.type = js.native
  
   // tslint:disable-line no-unnecessary-generics
  def removeListener[E /* <: /* keyof Events */ String */](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
  ): this.type = js.native
  
  def setMaxListeners(maxListeners: Double): this.type = js.native
}
