package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.fileProvider.AjaxFileProviderOptions
import typings.devextreme.mod.DevExpress.fileProvider.ArrayFileProviderOptions
import typings.devextreme.mod.DevExpress.fileProvider.CustomFileProviderOptions
import typings.devextreme.mod.DevExpress.fileProvider.FileProviderOptions
import typings.devextreme.mod.DevExpress.fileProvider.RemoteFileProviderOptions
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "fileProvider")
@js.native
object fileProvider extends js.Object {
  @js.native
  class AjaxFileProvider ()
    extends typings.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: AjaxFileProviderOptions) = this()
    /** @name FileProvider.getItemContent() */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class ArrayFileProvider ()
    extends typings.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: ArrayFileProviderOptions) = this()
    /** @name FileProvider.getItemContent() */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class CustomFileProvider ()
    extends typings.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: CustomFileProviderOptions) = this()
    /** @name FileProvider.getItemContent() */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class FileProvider ()
    extends typings.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: FileProviderOptions[typings.devextreme.mod.DevExpress.fileProvider.FileProvider]) = this()
    /** @name FileProvider.getItemContent() */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class RemoteFileProvider ()
    extends typings.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: RemoteFileProviderOptions) = this()
    /** @name FileProvider.getItemContent() */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
}

