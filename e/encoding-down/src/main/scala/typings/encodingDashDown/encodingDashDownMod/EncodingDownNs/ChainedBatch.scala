package typings.encodingDashDown.encodingDashDownMod.EncodingDownNs

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractChainedBatch
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOptions
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainedBatch[K, V] extends AbstractChainedBatch[K, V] {
  def write(cb: js.Any): js.Any = js.native
  def write(options: CodecOptions with AbstractOptions, cb: js.Any): js.Any = js.native
}

