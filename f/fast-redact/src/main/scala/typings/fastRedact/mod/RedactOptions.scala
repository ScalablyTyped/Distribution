package typings.fastRedact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactOptions extends js.Object {
  
  /** This is the value which overwrites redacted properties. */
  var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, _])] = js.native
  
  /** An array of strings describing the nested location of a key in an object. */
  var paths: js.Array[String] = js.native
  
  /** The remove option, when set to true will cause keys to be removed from the serialized output. */
  var remove: js.UndefOr[Boolean] = js.native
  
  /** The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object. */
  var serialize: js.UndefOr[Boolean | (js.Function1[/* v */ js.Any, _])] = js.native
  
  /** The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive. */
  var strict: js.UndefOr[Boolean] = js.native
}
object RedactOptions {
  
  @scala.inline
  def apply(paths: js.Array[String]): RedactOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactOptions]
  }
  
  @scala.inline
  implicit class RedactOptionsOps[Self <: RedactOptions] (val x: Self) extends AnyVal {
    
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
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCensorFunction1(value: /* v */ js.Any => _): Self = this.set("censor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCensor(value: String | (js.Function1[/* v */ js.Any, _])): Self = this.set("censor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCensor: Self = this.set("censor", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setSerializeFunction1(value: /* v */ js.Any => _): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: Boolean | (js.Function1[/* v */ js.Any, _])): Self = this.set("serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
