package typings.ebml.mod

import typings.ebml.ebmlStrings.close
import typings.ebml.ebmlStrings.data
import typings.ebml.ebmlStrings.end
import typings.ebml.ebmlStrings.error
import typings.ebml.ebmlStrings.readable
import typings.ebml.mod.Decoder.State
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ebml", "Decoder")
@js.native
open class Decoder () extends Transform {
  def this(opts: TransformOptions) = this()
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  // #region Duplex methods overloadings
  def addListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var buffer: Buffer = js.native
  
  var cursor: Double = js.native
  
  def end(): this.type = js.native
  def end(cb: js.Function0[Unit]): this.type = js.native
  def end(chunk: Buffer): this.type = js.native
  def end(chunk: Buffer, cb: js.Function0[Unit]): this.type = js.native
  def end(chunk: Buffer, encoding: String): this.type = js.native
  def end(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): this.type = js.native
  def end(chunk: Buffer, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def readContent(): Boolean = js.native
  
  def readSize(): Boolean = js.native
  
  def readTag(): Boolean = js.native
  
  def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def removeListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var state: State = js.native
  
  var tagStack: js.Array[TagMetadata] = js.native
  
  var total: Double = js.native
  
  def write(chunk: Buffer): Boolean = js.native
  def write(chunk: Buffer, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: String): Boolean = js.native
  def write(chunk: Buffer, encoding: String, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
}
/* static members */
object Decoder {
  
  @JSImport("ebml", "Decoder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSchemaInfo(tag: Double): EBMLTagSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaInfo")(tag.asInstanceOf[js.Any]).asInstanceOf[EBMLTagSchema]
  
  trait EventListenerMap extends StObject {
    
    def close(): Unit
    
    def data(chunk: StateAndTagData): Unit
    
    def end(): Unit
    
    def error(err: js.Error): Unit
    
    def readable(): Unit
  }
  object EventListenerMap {
    
    inline def apply(
      close: () => Unit,
      data: StateAndTagData => Unit,
      end: () => Unit,
      error: js.Error => Unit,
      readable: () => Unit
    ): EventListenerMap = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction1(data), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
      __obj.asInstanceOf[EventListenerMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerMap] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setData(value: StateAndTagData => Unit): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setReadable(value: () => Unit): Self = StObject.set(x, "readable", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ebml.ebmlInts.`1`
    - typings.ebml.ebmlInts.`2`
    - typings.ebml.ebmlInts.`3`
  */
  trait State extends StObject
  object State {
    
    inline def `1`: typings.ebml.ebmlInts.`1` = 1.asInstanceOf[typings.ebml.ebmlInts.`1`]
    
    inline def `2`: typings.ebml.ebmlInts.`2` = 2.asInstanceOf[typings.ebml.ebmlInts.`2`]
    
    inline def `3`: typings.ebml.ebmlInts.`3` = 3.asInstanceOf[typings.ebml.ebmlInts.`3`]
  }
}
