package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2016Syntax, boolean> */
@js.native
trait RecordES2016Syntaxboolean extends js.Object {
  
  var `Exponentiation operator`: Boolean = js.native
  
  var `Rest destructuring`: Boolean = js.native
  
  var __all: Boolean = js.native
}
object RecordES2016Syntaxboolean {
  
  @scala.inline
  def apply(`Exponentiation operator`: Boolean, `Rest destructuring`: Boolean, __all: Boolean): RecordES2016Syntaxboolean = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Exponentiation operator")((`Exponentiation operator`).asInstanceOf[js.Any])
    __obj.updateDynamic("Rest destructuring")((`Rest destructuring`).asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2016Syntaxboolean]
  }
  
  @scala.inline
  implicit class RecordES2016SyntaxbooleanOps[Self <: RecordES2016Syntaxboolean] (val x: Self) extends AnyVal {
    
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
    def `setExponentiation operator`(value: Boolean): Self = this.set("Exponentiation operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRest destructuring`(value: Boolean): Self = this.set("Rest destructuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__all(value: Boolean): Self = this.set("__all", value.asInstanceOf[js.Any])
  }
}
