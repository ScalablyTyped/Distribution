package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.ecol.ieventdispatcherMod.IEventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDispatcherMod {
  
  @JSImport("ecol/lib/basic/EventDispatcher", "EventDispatcher")
  @js.native
  class EventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] ()
    extends StObject
       with IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /**
      * @hidden
      */
    var listeners_ : js.Any = js.native
    
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  }
}
