package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalHistoryOptions extends StObject {
  
  /**
    * Use hash change when present.
    * @default true
    */
  var hashChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use push state when present.
    * @default false
    */
  var pushState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The url root used to extract the fragment when using push state.
    */
  var root: js.UndefOr[String] = js.undefined
  
  /**
    * The function that will be called back when the fragment changes.
    */
  var routeHandler: js.UndefOr[js.Function1[/* fragment */ String, Unit]] = js.undefined
  
  /**
    * Prevents loading of the current url when activating history.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override default history init behavior by navigating directly to this route.
    */
  var startRoute: js.UndefOr[String] = js.undefined
}
object DurandalHistoryOptions {
  
  inline def apply(): DurandalHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalHistoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurandalHistoryOptions] (val x: Self) extends AnyVal {
    
    inline def setHashChange(value: Boolean): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
    
    inline def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
    
    inline def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    inline def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRouteHandler(value: /* fragment */ String => Unit): Self = StObject.set(x, "routeHandler", js.Any.fromFunction1(value))
    
    inline def setRouteHandlerUndefined: Self = StObject.set(x, "routeHandler", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setStartRoute(value: String): Self = StObject.set(x, "startRoute", value.asInstanceOf[js.Any])
    
    inline def setStartRouteUndefined: Self = StObject.set(x, "startRoute", js.undefined)
  }
}
