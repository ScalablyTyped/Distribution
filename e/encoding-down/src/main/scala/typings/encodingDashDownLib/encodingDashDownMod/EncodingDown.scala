package typings
package encodingDashDownLib.encodingDashDownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingDown[K, V]
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[K, V] {
  def batch(
    array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]],
    options: encodingDashDownLib.encodingDashDownMod.EncodingDownNs.BatchOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): encodingDashDownLib.encodingDashDownMod.EncodingDownNs.ChainedBatch[_, _] = js.native
  def del(
    key: K,
    options: encodingDashDownLib.encodingDashDownMod.EncodingDownNs.DelOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
  def get(
    key: K,
    options: encodingDashDownLib.encodingDashDownMod.EncodingDownNs.GetOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[V]
  ): scala.Unit = js.native
  def iterator(options: encodingDashDownLib.encodingDashDownMod.EncodingDownNs.IteratorOptions): abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[_, _] = js.native
  def put(
    key: K,
    value: V,
    options: encodingDashDownLib.encodingDashDownMod.EncodingDownNs.PutOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
}

