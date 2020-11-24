package typings.duplexify.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("duplexify", JSImport.Namespace)
@js.native
class ^ () extends Duplexify {
  def this(writable: Writable) = this()
  def this(writable: js.UndefOr[scala.Nothing], readable: Readable) = this()
  def this(writable: Writable, readable: Readable) = this()
  def this(
    writable: js.UndefOr[scala.Nothing],
    readable: js.UndefOr[scala.Nothing],
    streamOptions: DuplexOptions
  ) = this()
  def this(writable: js.UndefOr[scala.Nothing], readable: Readable, streamOptions: DuplexOptions) = this()
  def this(writable: Writable, readable: js.UndefOr[scala.Nothing], streamOptions: DuplexOptions) = this()
  def this(writable: Writable, readable: Readable, streamOptions: DuplexOptions) = this()
}
@JSImport("duplexify", JSImport.Namespace)
@js.native
object ^ extends TopLevel[DuplexifyConstructor]
