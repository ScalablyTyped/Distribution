package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2016Builtins, boolean> */
@js.native
trait RecordES2016Builtinsboole extends js.Object {
  
  @JSName("Array.prototype.includes")
  var ArrayDotprototypeDotincludes: Boolean = js.native
  
  @JSName("TypedArray.prototype.includes")
  var TypedArrayDotprototypeDotincludes: Boolean = js.native
  
  var __all: Boolean = js.native
}
object RecordES2016Builtinsboole {
  
  @scala.inline
  def apply(ArrayDotprototypeDotincludes: Boolean, TypedArrayDotprototypeDotincludes: Boolean, __all: Boolean): RecordES2016Builtinsboole = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Array.prototype.includes")(ArrayDotprototypeDotincludes.asInstanceOf[js.Any])
    __obj.updateDynamic("TypedArray.prototype.includes")(TypedArrayDotprototypeDotincludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2016Builtinsboole]
  }
  
  @scala.inline
  implicit class RecordES2016BuiltinsbooleOps[Self <: RecordES2016Builtinsboole] (val x: Self) extends AnyVal {
    
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
    def setArrayDotprototypeDotincludes(value: Boolean): Self = this.set("Array.prototype.includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedArrayDotprototypeDotincludes(value: Boolean): Self = this.set("TypedArray.prototype.includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__all(value: Boolean): Self = this.set("__all", value.asInstanceOf[js.Any])
  }
}
