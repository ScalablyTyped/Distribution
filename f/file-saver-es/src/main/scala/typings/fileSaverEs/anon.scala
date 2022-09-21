package typings.fileSaverEs

import typings.fileSaverEs.mod.FileSaverOptions
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(data: String): Unit = js.native
    def apply(data: String, filename: String): Unit = js.native
    def apply(data: String, filename: String, disableAutoBOM: Boolean): Unit = js.native
    def apply(data: String, filename: String, options: FileSaverOptions): Unit = js.native
    def apply(data: String, filename: Unit, disableAutoBOM: Boolean): Unit = js.native
    def apply(data: String, filename: Unit, options: FileSaverOptions): Unit = js.native
    def apply(data: Blob): Unit = js.native
    def apply(data: Blob, filename: String): Unit = js.native
    def apply(data: Blob, filename: String, disableAutoBOM: Boolean): Unit = js.native
    def apply(data: Blob, filename: String, options: FileSaverOptions): Unit = js.native
    def apply(data: Blob, filename: Unit, disableAutoBOM: Boolean): Unit = js.native
    def apply(data: Blob, filename: Unit, options: FileSaverOptions): Unit = js.native
  }
}
