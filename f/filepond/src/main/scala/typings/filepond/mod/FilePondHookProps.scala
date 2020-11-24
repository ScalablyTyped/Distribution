package typings.filepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondHookProps extends js.Object {
  
  /**
    * FilePond is about to add this file.
    *
    * Return `false` to prevent adding it, or return a `Promise` and resolve with `true` or `false`.
    */
  var beforeAddFile: js.UndefOr[js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]]] = js.native
  
  /**
    * FilePond is about to allow this item to be dropped, it can be a URL or a File object.
    *
    * Return `true` or `false` depending on if you want to allow the item to be dropped.
    */
  var beforeDropFile: js.UndefOr[js.Function1[/* file */ FilePondFile | String, Boolean]] = js.native
  
  /**
    * FilePond is about to remove this file.
    *
    * Return `false` to prevent adding it, or return a `Promise` and resolve with `true` or `false`.
    */
  var beforeRemoveFile: js.UndefOr[js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]]] = js.native
}
object FilePondHookProps {
  
  @scala.inline
  def apply(): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondHookProps]
  }
  
  @scala.inline
  implicit class FilePondHookPropsOps[Self <: FilePondHookProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeAddFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): Self = this.set("beforeAddFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeAddFile: Self = this.set("beforeAddFile", js.undefined)
    
    @scala.inline
    def setBeforeDropFile(value: /* file */ FilePondFile | String => Boolean): Self = this.set("beforeDropFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDropFile: Self = this.set("beforeDropFile", js.undefined)
    
    @scala.inline
    def setBeforeRemoveFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): Self = this.set("beforeRemoveFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeRemoveFile: Self = this.set("beforeRemoveFile", js.undefined)
  }
}
