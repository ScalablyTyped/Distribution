package typings.firebaseStorageTypes

import typings.firebaseStorageTypes.mod.UploadTaskSnapshot
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@firebase/util.@firebase/util.Observer<@firebase/storage-types.@firebase/storage-types.UploadTaskSnapshot>> */
  @js.native
  trait PartialObserverUploadTask extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    var next: js.UndefOr[js.Function1[/* value */ UploadTaskSnapshot, Unit]] = js.native
  }
  object PartialObserverUploadTask {
    
    @scala.inline
    def apply(): PartialObserverUploadTask = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialObserverUploadTask]
    }
    
    @scala.inline
    implicit class PartialObserverUploadTaskMutableBuilder[Self <: PartialObserverUploadTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* value */ UploadTaskSnapshot => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
