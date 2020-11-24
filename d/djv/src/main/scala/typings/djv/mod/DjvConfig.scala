package typings.djv.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DjvConfig extends js.Object {
  
  /** a handler to use for generating custom error messages */
  var errorHandler: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** an object containing list of formatters to add for environment */
  var formats: js.UndefOr[Record[String, js.Function1[/* repeated */ String, String]]] = js.native
  
  /**
    * generating object should be considered as inner
    *
    * Default value is `false`/`undefined`. If `true`, then it avoid creating variables in a
    * generated function body, however without proper wrapper function approach will not work.
    */
  var inner: js.UndefOr[Boolean] = js.native
  
  /** defines which version of json-schema draft to use, draft-04 by default */
  var version: js.UndefOr[String] = js.native
  
  /** handler to apply for environment version */
  var versionConfigure: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.native
}
object DjvConfig {
  
  @scala.inline
  def apply(): DjvConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DjvConfig]
  }
  
  @scala.inline
  implicit class DjvConfigOps[Self <: DjvConfig] (val x: Self) extends AnyVal {
    
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
    def setErrorHandler(value: () => Unit): Self = this.set("errorHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setFormats(value: Record[String, js.Function1[/* repeated */ String, String]]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setInner(value: Boolean): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionConfigure(value: /* object */ js.Object => Unit): Self = this.set("versionConfigure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVersionConfigure: Self = this.set("versionConfigure", js.undefined)
  }
}
