package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("NavigateEvent")
  @js.native
  open class NavigateEvent protected ()
    extends StObject
       with typings.domNavigation.NavigateEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInit: NavigateEventInit) = this()
  }
  
  @JSGlobal("Navigation")
  @js.native
  open class Navigation ()
    extends StObject
       with typings.domNavigation.Navigation
  
  @JSGlobal("NavigationCurrentEntryChangeEvent")
  @js.native
  open class NavigationCurrentEntryChangeEvent protected ()
    extends StObject
       with typings.domNavigation.NavigationCurrentEntryChangeEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInit: NavigationCurrentEntryChangeEventInit) = this()
  }
  
  @JSGlobal("NavigationDestination")
  @js.native
  open class NavigationDestination ()
    extends StObject
       with typings.domNavigation.NavigationDestination {
    
    /* CompleteClass */
    override def getState(): Any = js.native
    
    /* CompleteClass */
    override val id: String | Null = js.native
    
    /* CompleteClass */
    override val index: Double = js.native
    
    /* CompleteClass */
    override val key: String | Null = js.native
    
    /* CompleteClass */
    override val sameDocument: Boolean = js.native
    
    /* CompleteClass */
    override val url: String = js.native
  }
  
  @JSGlobal("NavigationHistoryEntry")
  @js.native
  open class NavigationHistoryEntry ()
    extends StObject
       with typings.domNavigation.NavigationHistoryEntry
  
  @JSGlobal("NavigationTransition")
  @js.native
  open class NavigationTransition ()
    extends StObject
       with typings.domNavigation.NavigationTransition {
    
    /* CompleteClass */
    override val finished: js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val from: typings.domNavigation.NavigationHistoryEntry = js.native
    
    /* CompleteClass */
    override val navigationType: NavigationTypeString = js.native
  }
}
