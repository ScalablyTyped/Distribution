package typings.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2017Builtins, boolean> */
trait RecordES2017Builtinsboole extends js.Object {
  var Atomics: Boolean
  @JSName("Object.entries")
  var ObjectDotentries: Boolean
  @JSName("Object.getOwnPropertyDescriptors")
  var ObjectDotgetOwnPropertyDescriptors: Boolean
  @JSName("Object.values")
  var ObjectDotvalues: Boolean
  var SharedArrayBuffer: Boolean
  @JSName("String.prototype.padEnd")
  var StringDotprototypeDotpadEnd: Boolean
  @JSName("String.prototype.padStart")
  var StringDotprototypeDotpadStart: Boolean
  var __all: Boolean
}

object RecordES2017Builtinsboole {
  @scala.inline
  def apply(
    Atomics: Boolean,
    ObjectDotentries: Boolean,
    ObjectDotgetOwnPropertyDescriptors: Boolean,
    ObjectDotvalues: Boolean,
    SharedArrayBuffer: Boolean,
    StringDotprototypeDotpadEnd: Boolean,
    StringDotprototypeDotpadStart: Boolean,
    __all: Boolean
  ): RecordES2017Builtinsboole = {
    val __obj = js.Dynamic.literal(Atomics = Atomics.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any], __all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Object.entries")(ObjectDotentries.asInstanceOf[js.Any])
    __obj.updateDynamic("Object.getOwnPropertyDescriptors")(ObjectDotgetOwnPropertyDescriptors.asInstanceOf[js.Any])
    __obj.updateDynamic("Object.values")(ObjectDotvalues.asInstanceOf[js.Any])
    __obj.updateDynamic("String.prototype.padEnd")(StringDotprototypeDotpadEnd.asInstanceOf[js.Any])
    __obj.updateDynamic("String.prototype.padStart")(StringDotprototypeDotpadStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2017Builtinsboole]
  }
}

