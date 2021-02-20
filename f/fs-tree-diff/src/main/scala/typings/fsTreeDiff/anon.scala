package typings.fsTreeDiff

import typings.fsTreeDiff.entryMod.BaseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Entries[T /* <: BaseEntry */] extends StObject {
    
    var entries: js.UndefOr[js.Array[T]] = js.native
    
    var sortAndExpand: js.UndefOr[Boolean] = js.native
  }
  object Entries {
    
    @scala.inline
    def apply[T /* <: BaseEntry */](): Entries[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entries[T]]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries[_], T /* <: BaseEntry */] (val x: Self with Entries[T]) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      @scala.inline
      def setEntriesVarargs(value: T*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAndExpandUndefined: Self = StObject.set(x, "sortAndExpand", js.undefined)
    }
  }
}
