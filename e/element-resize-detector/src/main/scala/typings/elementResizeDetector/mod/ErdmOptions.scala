package typings.elementResizeDetector.mod

import typings.elementResizeDetector.elementResizeDetectorStrings.`object`
import typings.elementResizeDetector.elementResizeDetectorStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErdmOptions extends js.Object {
  
  /**
    * Determines if listeners should be called when they are getting added.
    * If true, the listener is guaranteed to be called when it has been added.
    * If false, the listener will not be guarenteed to be called when
    * it has been added (does not prevent it from being called).
    *
    * @default true
    */
  var callOnAdd: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the the system will report debug messages as default
    * for the listenTo method.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom id handler that is responsible for generating,
    * setting and retrieving id's for elements.
    * If not provided, a default id handler will be used.
    */
  var idHandler: js.UndefOr[IdHandlerProps] = js.native
  
  /**
    * A custom reporter that handles reporting logs, warnings and errors.
    * If not provided, a default id handler will be used.
    * If set to false, then nothing will be reported.
    */
  var reporter: js.UndefOr[ReporterProps] = js.native
  
  var strategy: js.UndefOr[scroll | `object`] = js.native
}
object ErdmOptions {
  
  @scala.inline
  def apply(): ErdmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErdmOptions]
  }
  
  @scala.inline
  implicit class ErdmOptionsOps[Self <: ErdmOptions] (val x: Self) extends AnyVal {
    
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
    def setCallOnAdd(value: Boolean): Self = this.set("callOnAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallOnAdd: Self = this.set("callOnAdd", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setIdHandler(value: IdHandlerProps): Self = this.set("idHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdHandler: Self = this.set("idHandler", js.undefined)
    
    @scala.inline
    def setReporter(value: ReporterProps): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setStrategy(value: scroll | `object`): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
