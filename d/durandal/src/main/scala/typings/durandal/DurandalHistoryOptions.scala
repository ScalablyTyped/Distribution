package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalHistoryOptions extends StObject {
  
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
  implicit class DurandalHistoryOptionsMutableBuilder[Self <: DurandalHistoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashChange(value: Boolean): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
    
    @scala.inline
    def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRouteHandler(value: /* fragment */ String => Unit): Self = StObject.set(x, "routeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRouteHandlerUndefined: Self = StObject.set(x, "routeHandler", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setStartRoute(value: String): Self = StObject.set(x, "startRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRouteUndefined: Self = StObject.set(x, "startRoute", js.undefined)
  }
}
