package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2017Builtins, boolean> */
@js.native
trait RecordES2017Builtinsboole extends js.Object {
  
  var Atomics: Boolean = js.native
  
  @JSName("Object.entries")
  var ObjectDotentries: Boolean = js.native
  
  @JSName("Object.getOwnPropertyDescriptors")
  var ObjectDotgetOwnPropertyDescriptors: Boolean = js.native
  
  @JSName("Object.values")
  var ObjectDotvalues: Boolean = js.native
  
  var SharedArrayBuffer: Boolean = js.native
  
  @JSName("String.prototype.padEnd")
  var StringDotprototypeDotpadEnd: Boolean = js.native
  
  @JSName("String.prototype.padStart")
  var StringDotprototypeDotpadStart: Boolean = js.native
  
  var __all: Boolean = js.native
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
  
  @scala.inline
  implicit class RecordES2017BuiltinsbooleOps[Self <: RecordES2017Builtinsboole] (val x: Self) extends AnyVal {
    
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
    def setAtomics(value: Boolean): Self = this.set("Atomics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDotentries(value: Boolean): Self = this.set("Object.entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDotgetOwnPropertyDescriptors(value: Boolean): Self = this.set("Object.getOwnPropertyDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDotvalues(value: Boolean): Self = this.set("Object.values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedArrayBuffer(value: Boolean): Self = this.set("SharedArrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringDotprototypeDotpadEnd(value: Boolean): Self = this.set("String.prototype.padEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringDotprototypeDotpadStart(value: Boolean): Self = this.set("String.prototype.padStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__all(value: Boolean): Self = this.set("__all", value.asInstanceOf[js.Any])
  }
}
