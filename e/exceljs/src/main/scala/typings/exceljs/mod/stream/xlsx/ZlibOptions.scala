package typings.exceljs.mod.stream.xlsx

import typings.exceljs.mod.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.ArrayBuffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZlibOptions extends js.Object {
  /**
  			 * @default 16*1024
  			 */
  var chunkSize: Double = js.native
   // compression only
  var dictionary: Buffer | TypedArray | DataView | ArrayBuffer = js.native
  /**
  			 * @default constants.Z_FINISH
  			 */
  var finishFlush: Double = js.native
  /**
  			 * @default constants.Z_NO_FLUSH
  			 */
  var flush: Double = js.native
  var level: Double = js.native
   // compression only
  var memLevel: Double = js.native
   // compression only
  var strategy: Double = js.native
  var windowBits: Double = js.native
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: Double,
    dictionary: Buffer | TypedArray | DataView | ArrayBuffer,
    finishFlush: Double,
    flush: Double,
    level: Double,
    memLevel: Double,
    strategy: Double,
    windowBits: Double
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], finishFlush = finishFlush.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], memLevel = memLevel.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], windowBits = windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
  @scala.inline
  implicit class ZlibOptionsOps[Self <: ZlibOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionary(value: Buffer | TypedArray | DataView | ArrayBuffer): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishFlush(value: Double): Self = this.set("finishFlush", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlush(value: Double): Self = this.set("flush", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
  }
  
}

