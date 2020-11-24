package typings.encodingDown.mod.EncodingDown

import typings.abstractLeveldown.mod.AbstractChainedBatch
import typings.abstractLeveldown.mod.AbstractOptions
import typings.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainedBatch[K, V] extends AbstractChainedBatch[K, V] {
  
  def write(cb: js.Any): js.Any = js.native
  def write(options: CodecOptions with AbstractOptions, cb: js.Any): js.Any = js.native
}
