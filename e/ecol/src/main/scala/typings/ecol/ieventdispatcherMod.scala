package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ieventdispatcherMod {
  
  @js.native
  trait IEventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] extends StObject {
    
    def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    
    def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    
    def hasEventListener(`type`: Type): Boolean = js.native
    
    def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  }
  object IEventDispatcher {
    
    @scala.inline
    def apply[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit,
      dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit,
      hasEventListener: Type => Boolean,
      removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit
    ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction1(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
    }
    
    @scala.inline
    implicit class IEventDispatcherMutableBuilder[Self <: IEventDispatcher[_, _, _, _], T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] (val x: Self with (IEventDispatcher[T, SourceT, IteratorT, ReverseT])) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDispatchEvent(value: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasEventListener(value: Type => Boolean): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    }
  }
}
