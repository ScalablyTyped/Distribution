package typings.flushWriteStream

import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: WritableOptions, write: Write): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: WritableOptions, write: Write, flush: Flush): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], write.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(write: Write): Writable = ^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def apply(write: Write, flush: Flush): Writable = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  class ^ protected () extends Writable {
    def this(write: Write) = this()
    def this(opts: WritableOptions, write: Write) = this()
    def this(write: Write, flush: Flush) = this()
    def this(opts: WritableOptions, write: Write, flush: Flush) = this()
  }
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def obj(opts: WritableOptions, write: Write): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def obj(opts: WritableOptions, write: Write, flush: Flush): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], write.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def obj(write: Write): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(write.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def obj(write: Write, flush: Flush): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(write.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  type Callback = js.Function1[/* error */ js.UndefOr[Error], Unit]
  
  type Flush = js.Function1[/* callback */ Callback, Unit]
  
  type Write = js.Function3[/* chunk */ js.Any, /* encoding */ String, /* callback */ Callback, Unit]
}
