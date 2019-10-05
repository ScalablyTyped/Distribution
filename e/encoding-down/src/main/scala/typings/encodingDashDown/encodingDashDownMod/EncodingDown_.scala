package typings.encodingDashDown.encodingDashDownMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractBatch
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorValueCallback
import typings.encodingDashDown.encodingDashDownMod.EncodingDown.BatchOptions
import typings.encodingDashDown.encodingDashDownMod.EncodingDown.ChainedBatch
import typings.encodingDashDown.encodingDashDownMod.EncodingDown.DelOptions
import typings.encodingDashDown.encodingDashDownMod.EncodingDown.GetOptions
import typings.encodingDashDown.encodingDashDownMod.EncodingDown.IteratorOptions
import typings.encodingDashDown.encodingDashDownMod.EncodingDown.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("EncodingDown")
@js.native
trait EncodingDown_[K, V] extends AbstractLevelDOWN[K, V] {
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[_, _] = js.native
  def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
  def iterator(options: IteratorOptions): AbstractIterator[_, _] = js.native
  def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
}

