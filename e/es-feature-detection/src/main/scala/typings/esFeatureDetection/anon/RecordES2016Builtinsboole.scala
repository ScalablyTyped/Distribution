package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2016Builtins, boolean> */
trait RecordES2016Builtinsboole extends js.Object {
  @JSName("Array.prototype.includes")
  var ArrayDotprototypeDotincludes: Boolean
  @JSName("TypedArray.prototype.includes")
  var TypedArrayDotprototypeDotincludes: Boolean
  var __all: Boolean
}

object RecordES2016Builtinsboole {
  @scala.inline
  def apply(ArrayDotprototypeDotincludes: Boolean, TypedArrayDotprototypeDotincludes: Boolean, __all: Boolean): RecordES2016Builtinsboole = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Array.prototype.includes")(ArrayDotprototypeDotincludes.asInstanceOf[js.Any])
    __obj.updateDynamic("TypedArray.prototype.includes")(TypedArrayDotprototypeDotincludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2016Builtinsboole]
  }
}

