package typings.flushWriteStream

import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  def apply(opts: WritableOptions, write: Write): Writable = js.native
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  def apply(opts: WritableOptions, write: Write, flush: Flush): Writable = js.native
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  def apply(write: Write): Writable = js.native
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  def apply(write: Write, flush: Flush): Writable = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("flush-write-stream", JSImport.Namespace)
  @js.native
  class ^ protected () extends Writable {
    def this(write: Write) = this()
    def this(opts: WritableOptions, write: Write) = this()
    def this(write: Write, flush: Flush) = this()
    def this(opts: WritableOptions, write: Write, flush: Flush) = this()
  }
  
  @JSImport("flush-write-stream", "obj")
  @js.native
  def obj(opts: WritableOptions, write: Write): Writable = js.native
  @JSImport("flush-write-stream", "obj")
  @js.native
  def obj(opts: WritableOptions, write: Write, flush: Flush): Writable = js.native
  @JSImport("flush-write-stream", "obj")
  @js.native
  def obj(write: Write): Writable = js.native
  @JSImport("flush-write-stream", "obj")
  @js.native
  def obj(write: Write, flush: Flush): Writable = js.native
  
  type Callback = js.Function1[/* error */ js.UndefOr[Error], Unit]
  
  type Flush = js.Function1[/* callback */ Callback, Unit]
  
  type Write = js.Function3[/* chunk */ js.Any, /* encoding */ String, /* callback */ Callback, Unit]
}
