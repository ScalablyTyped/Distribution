package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2017Syntax, boolean> */
@js.native
trait RecordES2017Syntaxboolean extends js.Object {
  
  var `Trailing parameter commas`: Boolean = js.native
  
  var __all: Boolean = js.native
  
  @JSName("async/await")
  var asyncSlashawait: Boolean = js.native
}
object RecordES2017Syntaxboolean {
  
  @scala.inline
  def apply(`Trailing parameter commas`: Boolean, __all: Boolean, asyncSlashawait: Boolean): RecordES2017Syntaxboolean = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Trailing parameter commas")((`Trailing parameter commas`).asInstanceOf[js.Any])
    __obj.updateDynamic("async/await")(asyncSlashawait.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2017Syntaxboolean]
  }
  
  @scala.inline
  implicit class RecordES2017SyntaxbooleanOps[Self <: RecordES2017Syntaxboolean] (val x: Self) extends AnyVal {
    
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
    def `setTrailing parameter commas`(value: Boolean): Self = this.set("Trailing parameter commas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__all(value: Boolean): Self = this.set("__all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncSlashawait(value: Boolean): Self = this.set("async/await", value.asInstanceOf[js.Any])
  }
}
