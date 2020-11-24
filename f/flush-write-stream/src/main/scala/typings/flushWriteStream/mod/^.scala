package typings.flushWriteStream.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ^ extends TopLevel[
      (Instantiable1[/* write */ Write, Writable]) with (Instantiable2[/* opts */ WritableOptions, /* write */ Write, Writable]) with (Instantiable2[/* write */ Write, /* flush */ Flush, Writable]) with (Instantiable3[/* opts */ WritableOptions, /* write */ Write, /* flush */ Flush, Writable])
    ] {
  
  def apply(opts: WritableOptions, write: Write): Writable = js.native
  def apply(opts: WritableOptions, write: Write, flush: Flush): Writable = js.native
  def apply(write: Write): Writable = js.native
  def apply(write: Write, flush: Flush): Writable = js.native
  
  def obj(opts: WritableOptions, write: Write): Writable = js.native
  def obj(opts: WritableOptions, write: Write, flush: Flush): Writable = js.native
  def obj(write: Write): Writable = js.native
  def obj(write: Write, flush: Flush): Writable = js.native
}
