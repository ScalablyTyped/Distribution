package typings.filepond.anon

import org.scalablytyped.runtime.StringDictionary
import typings.filepond.mod.ActualFileObject
import typings.filepond.mod.FetchServerConfigFunction
import typings.filepond.mod.LoadServerConfigFunction
import typings.filepond.mod.ProcessServerConfigFunction
import typings.filepond.mod.ProgressServerConfigFunction
import typings.filepond.mod.RemoveServerConfigFunction
import typings.filepond.mod.RestoreServerConfigFunction
import typings.filepond.mod.RevertServerConfigFunction
import typings.filepond.mod.ServerUrl
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fetch extends js.Object {
  
  var fetch: js.UndefOr[String | ServerUrl | FetchServerConfigFunction | Null] = js.native
  
  var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  
  var load: js.UndefOr[String | ServerUrl | LoadServerConfigFunction | Null] = js.native
  
  var process: js.UndefOr[String | ServerUrl | ProcessServerConfigFunction | Null] = js.native
  
  var remove: js.UndefOr[RemoveServerConfigFunction | Null] = js.native
  
  var restore: js.UndefOr[String | ServerUrl | RestoreServerConfigFunction | Null] = js.native
  
  var revert: js.UndefOr[String | ServerUrl | RevertServerConfigFunction | Null] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Fetch {
  
  @scala.inline
  def apply(): Fetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fetch]
  }
  
  @scala.inline
  implicit class FetchOps[Self <: Fetch] (val x: Self) extends AnyVal {
    
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
    def setFetchFunction6(
      value: (/* url */ String, /* load */ js.Function1[/* file */ ActualFileObject | Blob, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = this.set("fetch", js.Any.fromFunction6(value))
    
    @scala.inline
    def setFetch(value: String | ServerUrl | FetchServerConfigFunction): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setFetchNull: Self = this.set("fetch", null)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String | Boolean | Double]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLoadFunction6(
      value: (/* source */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject | Blob, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = this.set("load", js.Any.fromFunction6(value))
    
    @scala.inline
    def setLoad(value: String | ServerUrl | LoadServerConfigFunction): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadNull: Self = this.set("load", null)
    
    @scala.inline
    def setProcessFunction7(
      value: (/* fieldName */ String, /* file */ ActualFileObject, /* metadata */ StringDictionary[js.Any], /* load */ js.Function1[/* p */ String | StringDictionary[js.Any], Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit]) => Unit
    ): Self = this.set("process", js.Any.fromFunction7(value))
    
    @scala.inline
    def setProcess(value: String | ServerUrl | ProcessServerConfigFunction): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    
    @scala.inline
    def setProcessNull: Self = this.set("process", null)
    
    @scala.inline
    def setRemove(
      value: (/* source */ js.Any, /* load */ js.Function0[Unit], /* error */ js.Function1[/* errorText */ String, Unit]) => Unit
    ): Self = this.set("remove", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveNull: Self = this.set("remove", null)
    
    @scala.inline
    def setRestoreFunction6(
      value: (/* uniqueFileId */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = this.set("restore", js.Any.fromFunction6(value))
    
    @scala.inline
    def setRestore(value: String | ServerUrl | RestoreServerConfigFunction): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setRestoreNull: Self = this.set("restore", null)
    
    @scala.inline
    def setRevertFunction3(
      value: (/* uniqueFieldId */ js.Any, /* load */ js.Function0[Unit], /* error */ js.Function1[/* errorText */ String, Unit]) => Unit
    ): Self = this.set("revert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRevert(value: String | ServerUrl | RevertServerConfigFunction): Self = this.set("revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
    
    @scala.inline
    def setRevertNull: Self = this.set("revert", null)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
