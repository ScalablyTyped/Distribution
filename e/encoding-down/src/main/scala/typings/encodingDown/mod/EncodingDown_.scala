package typings.encodingDown.mod

import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.encodingDown.mod.EncodingDown.BatchOptions
import typings.encodingDown.mod.EncodingDown.ChainedBatch
import typings.encodingDown.mod.EncodingDown.DelOptions
import typings.encodingDown.mod.EncodingDown.GetOptions
import typings.encodingDown.mod.EncodingDown.IteratorOptions
import typings.encodingDown.mod.EncodingDown.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingDown_[K, V] extends AbstractLevelDOWN[K, V] {
  
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[_, _] = js.native
  
  def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
  
  def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
  
  def iterator(options: IteratorOptions): AbstractIterator[_, _] = js.native
  
  def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
}
