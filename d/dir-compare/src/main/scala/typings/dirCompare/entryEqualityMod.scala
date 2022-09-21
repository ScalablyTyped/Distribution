package typings.dirCompare

import typings.dirCompare.compareAsyncMod.AsyncDiffSet
import typings.dirCompare.dirCompareBooleans.`false`
import typings.dirCompare.dirCompareBooleans.`true`
import typings.dirCompare.extOptionsMod.ExtOptions
import typings.dirCompare.typesMod.DifferenceType
import typings.dirCompare.typesMod.Entry
import typings.dirCompare.typesMod.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryEqualityMod {
  
  object EntryEquality {
    
    @JSImport("dir-compare/build/src/Entry/EntryEquality", "EntryEquality")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEntryEqualAsync(
      entry1: Entry,
      entry2: Entry,
      `type`: DifferenceType,
      asyncDiffSet: AsyncDiffSet,
      options: ExtOptions
    ): FileEqualityPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntryEqualAsync")(entry1.asInstanceOf[js.Any], entry2.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], asyncDiffSet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileEqualityPromise]
    
    inline def isEntryEqualSync(entry1: Entry, entry2: Entry, `type`: DifferenceType, options: ExtOptions): FileEquality = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntryEqualSync")(entry1.asInstanceOf[js.Any], entry2.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileEquality]
  }
  
  trait FileEquality extends StObject {
    
    /**
      * Provides reason if files are distinct
      */
    var reason: js.UndefOr[Reason] = js.undefined
    
    /**
      * True if files are identical.
      */
    var same: Boolean
  }
  object FileEquality {
    
    inline def apply(same: Boolean): FileEquality = {
      val __obj = js.Dynamic.literal(same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileEquality]
    }
    
    extension [Self <: FileEquality](x: Self) {
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.entryEqualityMod.FileEqualityAsyncSuccess
    - typings.dirCompare.entryEqualityMod.FileEqualityAsyncError
  */
  trait FileEqualityAsync extends StObject
  object FileEqualityAsync {
    
    inline def FileEqualityAsyncError(error: Any): typings.dirCompare.entryEqualityMod.FileEqualityAsyncError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hasErrors = true)
      __obj.asInstanceOf[typings.dirCompare.entryEqualityMod.FileEqualityAsyncError]
    }
    
    inline def FileEqualityAsyncSuccess(context: FileEqualityAsyncContext, same: Boolean): typings.dirCompare.entryEqualityMod.FileEqualityAsyncSuccess = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hasErrors = false, same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dirCompare.entryEqualityMod.FileEqualityAsyncSuccess]
    }
  }
  
  trait FileEqualityAsyncContext extends StObject {
    
    var asyncDiffSet: AsyncDiffSet
    
    var entry1: Entry
    
    var entry2: Entry
    
    var type1: DifferenceType
    
    var type2: DifferenceType
  }
  object FileEqualityAsyncContext {
    
    inline def apply(
      asyncDiffSet: AsyncDiffSet,
      entry1: Entry,
      entry2: Entry,
      type1: DifferenceType,
      type2: DifferenceType
    ): FileEqualityAsyncContext = {
      val __obj = js.Dynamic.literal(asyncDiffSet = asyncDiffSet.asInstanceOf[js.Any], entry1 = entry1.asInstanceOf[js.Any], entry2 = entry2.asInstanceOf[js.Any], type1 = type1.asInstanceOf[js.Any], type2 = type2.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileEqualityAsyncContext]
    }
    
    extension [Self <: FileEqualityAsyncContext](x: Self) {
      
      inline def setAsyncDiffSet(value: AsyncDiffSet): Self = StObject.set(x, "asyncDiffSet", value.asInstanceOf[js.Any])
      
      inline def setEntry1(value: Entry): Self = StObject.set(x, "entry1", value.asInstanceOf[js.Any])
      
      inline def setEntry2(value: Entry): Self = StObject.set(x, "entry2", value.asInstanceOf[js.Any])
      
      inline def setType1(value: DifferenceType): Self = StObject.set(x, "type1", value.asInstanceOf[js.Any])
      
      inline def setType2(value: DifferenceType): Self = StObject.set(x, "type2", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Failed file equality test result.
    */
  trait FileEqualityAsyncError
    extends StObject
       with FileEqualityAsync {
    
    var error: Any
    
    var hasErrors: `true`
  }
  object FileEqualityAsyncError {
    
    inline def apply(error: Any): FileEqualityAsyncError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hasErrors = true)
      __obj.asInstanceOf[FileEqualityAsyncError]
    }
    
    extension [Self <: FileEqualityAsyncError](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHasErrors(value: `true`): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Successful file equality test result.
    */
  trait FileEqualityAsyncSuccess
    extends StObject
       with FileEqualityAsync {
    
    /**
      * Provides comparison context during async operations.
      */
    var context: FileEqualityAsyncContext
    
    var hasErrors: `false`
    
    /**
      * Provides reason if files are distinct
      */
    var reason: Reason
    
    /**
      * True if files are identical.
      */
    var same: Boolean
  }
  object FileEqualityAsyncSuccess {
    
    inline def apply(context: FileEqualityAsyncContext, same: Boolean): FileEqualityAsyncSuccess = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hasErrors = false, same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileEqualityAsyncSuccess]
    }
    
    extension [Self <: FileEqualityAsyncSuccess](x: Self) {
      
      inline def setContext(value: FileEqualityAsyncContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHasErrors(value: `false`): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.entryEqualityMod.FileEqualityPromiseSync
    - typings.dirCompare.entryEqualityMod.FileEqualityPromiseAsync
  */
  trait FileEqualityPromise extends StObject
  object FileEqualityPromise {
    
    inline def FileEqualityPromiseAsync(fileEqualityAsyncPromise: js.Promise[FileEqualityAsync]): typings.dirCompare.entryEqualityMod.FileEqualityPromiseAsync = {
      val __obj = js.Dynamic.literal(fileEqualityAsyncPromise = fileEqualityAsyncPromise.asInstanceOf[js.Any], isSync = false)
      __obj.asInstanceOf[typings.dirCompare.entryEqualityMod.FileEqualityPromiseAsync]
    }
    
    inline def FileEqualityPromiseSync(same: Boolean): typings.dirCompare.entryEqualityMod.FileEqualityPromiseSync = {
      val __obj = js.Dynamic.literal(isSync = true, same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dirCompare.entryEqualityMod.FileEqualityPromiseSync]
    }
  }
  
  /**
    * File equality response that represents a promise resolved asynchronously.
    */
  trait FileEqualityPromiseAsync
    extends StObject
       with FileEqualityPromise {
    
    var fileEqualityAsyncPromise: js.Promise[FileEqualityAsync]
    
    var isSync: `false`
  }
  object FileEqualityPromiseAsync {
    
    inline def apply(fileEqualityAsyncPromise: js.Promise[FileEqualityAsync]): FileEqualityPromiseAsync = {
      val __obj = js.Dynamic.literal(fileEqualityAsyncPromise = fileEqualityAsyncPromise.asInstanceOf[js.Any], isSync = false)
      __obj.asInstanceOf[FileEqualityPromiseAsync]
    }
    
    extension [Self <: FileEqualityPromiseAsync](x: Self) {
      
      inline def setFileEqualityAsyncPromise(value: js.Promise[FileEqualityAsync]): Self = StObject.set(x, "fileEqualityAsyncPromise", value.asInstanceOf[js.Any])
      
      inline def setIsSync(value: `false`): Self = StObject.set(x, "isSync", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  * File equality response that represents a promise resolved synchronously.
  * This can happen when files are compared by size avoiding async i/o calls.
  */
  trait FileEqualityPromiseSync
    extends StObject
       with FileEqualityPromise {
    
    var isSync: `true`
    
    /**
      * Provides reason if files are distinct.
      */
    var reason: js.UndefOr[Reason] = js.undefined
    
    /**
      * True if files are identical.
      */
    var same: Boolean
  }
  object FileEqualityPromiseSync {
    
    inline def apply(same: Boolean): FileEqualityPromiseSync = {
      val __obj = js.Dynamic.literal(isSync = true, same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileEqualityPromiseSync]
    }
    
    extension [Self <: FileEqualityPromiseSync](x: Self) {
      
      inline def setIsSync(value: `true`): Self = StObject.set(x, "isSync", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    }
  }
}
