package typings.ecol

import typings.ecol.ieventdispatcherMod.IEventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDispatcherMod {
  
  @JSImport("ecol/lib/basic/EventDispatcher", "EventDispatcher")
  @js.native
  class EventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] () extends IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    
    /**
      * @hidden
      */
    var listeners_ : js.Any = js.native
  }
}
