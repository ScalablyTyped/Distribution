package typings.formidable

import typings.formidable.mod.File
import typings.formidable.mod.FileJSON
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volatileFileMod {
  
  @JSImport("formidable/VolatileFile", JSImport.Namespace)
  @js.native
  open class ^ protected () extends VolatileFile {
    def this(properties: File) = this()
  }
  
  @js.native
  trait VolatileFile extends EventEmitter {
    
    def destroy(): Unit = js.native
    
    def end(cb: js.Function0[Unit]): Unit = js.native
    
    def open(): Unit = js.native
    
    def toJSON(): FileJSON = js.native
    
    def write(buffer: String, cb: js.Function0[Unit]): Unit = js.native
  }
}
