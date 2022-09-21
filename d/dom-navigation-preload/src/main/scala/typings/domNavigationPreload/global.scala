package typings.domNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("NavigationPreloadManager")
  @js.native
  open class NavigationPreloadManager ()
    extends StObject
       with typings.domNavigationPreload.NavigationPreloadManager {
    
    /* CompleteClass */
    override def disable(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enable(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getState(): js.Promise[NavigationPreloadState] = js.native
    
    /* CompleteClass */
    override def setHeaderValue(value: String): js.Promise[Unit] = js.native
  }
}
