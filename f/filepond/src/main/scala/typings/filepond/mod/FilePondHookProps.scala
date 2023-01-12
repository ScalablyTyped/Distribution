package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondHookProps extends StObject {
  
  /**
    * FilePond is about to add this file.
    *
    * Return `false` to prevent adding it, or return a `Promise` and resolve with `true` or `false`.
    */
  var beforeAddFile: js.UndefOr[js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]]] = js.undefined
  
  /**
    * FilePond is about to allow this item to be dropped, it can be a URL or a File object.
    *
    * Return `true` or `false` depending on if you want to allow the item to be dropped.
    */
  var beforeDropFile: js.UndefOr[js.Function1[/* file */ FilePondFile | String, Boolean]] = js.undefined
  
  /**
    * FilePond is about to remove this file.
    *
    * Return `false` to prevent adding it, or return a `Promise` and resolve with `true` or `false`.
    */
  var beforeRemoveFile: js.UndefOr[js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]]] = js.undefined
}
object FilePondHookProps {
  
  inline def apply(): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondHookProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePondHookProps] (val x: Self) extends AnyVal {
    
    inline def setBeforeAddFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "beforeAddFile", js.Any.fromFunction1(value))
    
    inline def setBeforeAddFileUndefined: Self = StObject.set(x, "beforeAddFile", js.undefined)
    
    inline def setBeforeDropFile(value: /* file */ FilePondFile | String => Boolean): Self = StObject.set(x, "beforeDropFile", js.Any.fromFunction1(value))
    
    inline def setBeforeDropFileUndefined: Self = StObject.set(x, "beforeDropFile", js.undefined)
    
    inline def setBeforeRemoveFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "beforeRemoveFile", js.Any.fromFunction1(value))
    
    inline def setBeforeRemoveFileUndefined: Self = StObject.set(x, "beforeRemoveFile", js.undefined)
  }
}
