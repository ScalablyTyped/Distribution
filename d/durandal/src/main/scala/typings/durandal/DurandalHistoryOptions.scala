package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalHistoryOptions extends js.Object {
  
  /**
    * Use hash change when present.
    * @default true
    */
  var hashChange: js.UndefOr[Boolean] = js.native
  
  /**
    * Use push state when present.
    * @default false
    */
  var pushState: js.UndefOr[Boolean] = js.native
  
  /**
    * The url root used to extract the fragment when using push state.
    */
  var root: js.UndefOr[String] = js.native
  
  /**
    * The function that will be called back when the fragment changes.
    */
  var routeHandler: js.UndefOr[js.Function1[/* fragment */ String, Unit]] = js.native
  
  /**
    * Prevents loading of the current url when activating history.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Override default history init behavior by navigating directly to this route.
    */
  var startRoute: js.UndefOr[String] = js.native
}
object DurandalHistoryOptions {
  
  @scala.inline
  def apply(): DurandalHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalHistoryOptions]
  }
  
  @scala.inline
  implicit class DurandalHistoryOptionsOps[Self <: DurandalHistoryOptions] (val x: Self) extends AnyVal {
    
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
    def setHashChange(value: Boolean): Self = this.set("hashChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashChange: Self = this.set("hashChange", js.undefined)
    
    @scala.inline
    def setPushState(value: Boolean): Self = this.set("pushState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushState: Self = this.set("pushState", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRouteHandler(value: /* fragment */ String => Unit): Self = this.set("routeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRouteHandler: Self = this.set("routeHandler", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStartRoute(value: String): Self = this.set("startRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRoute: Self = this.set("startRoute", js.undefined)
  }
}
