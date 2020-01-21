package typings.duplexify.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexify", JSImport.Namespace)
@js.native
class ^ () extends Duplexify {
  def this(writable: Writable) = this()
  def this(writable: Writable, readable: Readable) = this()
  def this(writable: Writable, readable: Readable, streamOptions: DuplexOptions) = this()
}

@JSImport("duplexify", JSImport.Namespace)
@js.native
object ^ extends TopLevel[DuplexifyConstructor]

