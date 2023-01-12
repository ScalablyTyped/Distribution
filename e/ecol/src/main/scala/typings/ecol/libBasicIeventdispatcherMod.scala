package typings.ecol

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasicIeventdispatcherMod {
  
  trait IEventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] extends StObject {
    
    def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
    
    def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit
    
    def hasEventListener(`type`: Type): Boolean
    
    def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
  }
  object IEventDispatcher {
    
    inline def apply[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit,
      dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit,
      hasEventListener: Type => Boolean,
      removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit
    ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction1(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEventDispatcher[?, ?, ?, ?], T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] (val x: Self & (IEventDispatcher[T, SourceT, IteratorT, ReverseT])) extends AnyVal {
      
      inline def setAddEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setDispatchEvent(value: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setHasEventListener(value: Type => Boolean): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    }
  }
}
