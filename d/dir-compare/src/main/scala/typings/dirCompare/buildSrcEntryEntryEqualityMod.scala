package typings.dirCompare

import typings.dirCompare.buildSrcCompareAsyncMod.AsyncDiffSet
import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcTypesMod.DifferenceType
import typings.dirCompare.buildSrcTypesMod.Entry
import typings.dirCompare.buildSrcTypesMod.Reason
import typings.dirCompare.dirCompareBooleans.`false`
import typings.dirCompare.dirCompareBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEntryEntryEqualityMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEquality] (val x: Self) extends AnyVal {
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityAsyncSuccess
    - typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityAsyncError
  */
  trait FileEqualityAsync extends StObject
  object FileEqualityAsync {
    
    inline def FileEqualityAsyncError(error: Any): typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityAsyncError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hasErrors = true)
      __obj.asInstanceOf[typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityAsyncError]
    }
    
    inline def FileEqualityAsyncSuccess(context: FileEqualityAsyncContext, same: Boolean): typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityAsyncSuccess = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hasErrors = false, same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityAsyncSuccess]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEqualityAsyncContext] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEqualityAsyncError] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEqualityAsyncSuccess] (val x: Self) extends AnyVal {
      
      inline def setContext(value: FileEqualityAsyncContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHasErrors(value: `false`): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityPromiseSync
    - typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityPromiseAsync
  */
  trait FileEqualityPromise extends StObject
  object FileEqualityPromise {
    
    inline def FileEqualityPromiseAsync(fileEqualityAsyncPromise: js.Promise[FileEqualityAsync]): typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityPromiseAsync = {
      val __obj = js.Dynamic.literal(fileEqualityAsyncPromise = fileEqualityAsyncPromise.asInstanceOf[js.Any], isSync = false)
      __obj.asInstanceOf[typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityPromiseAsync]
    }
    
    inline def FileEqualityPromiseSync(same: Boolean): typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityPromiseSync = {
      val __obj = js.Dynamic.literal(isSync = true, same = same.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dirCompare.buildSrcEntryEntryEqualityMod.FileEqualityPromiseSync]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEqualityPromiseAsync] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEqualityPromiseSync] (val x: Self) extends AnyVal {
      
      inline def setIsSync(value: `true`): Self = StObject.set(x, "isSync", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    }
  }
}
