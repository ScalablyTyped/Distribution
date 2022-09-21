package typings.fileSaverEs

import typings.fileSaverEs.mod.FileSaverOptions
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object saveAs {
    
    @JSGlobal("saveAs")
    @js.native
    val ^ : js.Any = js.native
    inline def saveAs(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def saveAs(data: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: String, filename: String, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: String, filename: String, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: String, filename: Unit, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: String, filename: Unit, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: Blob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def saveAs(data: Blob, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: Blob, filename: String, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: Blob, filename: String, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: Blob, filename: Unit, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(data: Blob, filename: Unit, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
