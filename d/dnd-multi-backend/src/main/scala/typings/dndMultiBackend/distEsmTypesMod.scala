package typings.dndMultiBackend

import typings.dndCore.distInterfacesMod.Backend
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTypesMod {
  
  trait BackendEntry extends StObject {
    
    var id: String
    
    var instance: Backend
    
    var preview: Boolean
    
    var skipDispatchOnTransition: Boolean
    
    var transition: js.UndefOr[Transition] = js.undefined
  }
  object BackendEntry {
    
    inline def apply(id: String, instance: Backend, preview: Boolean, skipDispatchOnTransition: Boolean): BackendEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], skipDispatchOnTransition = skipDispatchOnTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendEntry]
    }
    
    extension [Self <: BackendEntry](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Backend): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setSkipDispatchOnTransition(value: Boolean): Self = StObject.set(x, "skipDispatchOnTransition", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  @js.native
  trait MultiBackendSwitcher
    extends StObject
       with Backend {
    
    def backendsList(): js.Array[BackendEntry] = js.native
    
    def previewEnabled(): Boolean = js.native
    
    def previewsList(): PreviewList = js.native
  }
  
  trait PreviewList extends StObject {
    
    def backendChanged(backend: MultiBackendSwitcher): Unit
    
    def register(listener: PreviewListener): Unit
    
    def unregister(listener: PreviewListener): Unit
  }
  object PreviewList {
    
    inline def apply(
      backendChanged: MultiBackendSwitcher => Unit,
      register: PreviewListener => Unit,
      unregister: PreviewListener => Unit
    ): PreviewList = {
      val __obj = js.Dynamic.literal(backendChanged = js.Any.fromFunction1(backendChanged), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
      __obj.asInstanceOf[PreviewList]
    }
    
    extension [Self <: PreviewList](x: Self) {
      
      inline def setBackendChanged(value: MultiBackendSwitcher => Unit): Self = StObject.set(x, "backendChanged", js.Any.fromFunction1(value))
      
      inline def setRegister(value: PreviewListener => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setUnregister(value: PreviewListener => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
  
  trait PreviewListener extends StObject {
    
    def backendChanged(backend: MultiBackendSwitcher): Unit
  }
  object PreviewListener {
    
    inline def apply(backendChanged: MultiBackendSwitcher => Unit): PreviewListener = {
      val __obj = js.Dynamic.literal(backendChanged = js.Any.fromFunction1(backendChanged))
      __obj.asInstanceOf[PreviewListener]
    }
    
    extension [Self <: PreviewListener](x: Self) {
      
      inline def setBackendChanged(value: MultiBackendSwitcher => Unit): Self = StObject.set(x, "backendChanged", js.Any.fromFunction1(value))
    }
  }
  
  trait Transition extends StObject {
    
    def check(e: Event): Boolean
    
    var event: String
  }
  object Transition {
    
    inline def apply(check: Event => Boolean, event: String): Transition = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transition]
    }
    
    extension [Self <: Transition](x: Self) {
      
      inline def setCheck(value: Event => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
