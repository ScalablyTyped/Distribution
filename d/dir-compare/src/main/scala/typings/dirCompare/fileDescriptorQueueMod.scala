package typings.dirCompare

import typings.node.fsMod.NoParamCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileDescriptorQueueMod {
  
  @JSImport("dir-compare/build/src/FileSystem/FileDescriptorQueue", "FileDescriptorQueue")
  @js.native
  open class FileDescriptorQueue protected () extends StObject {
    def this(maxFilesNo: Double) = this()
    
    /* private */ var activeCount: Any = js.native
    
    def close(fd: Double, callback: NoParamCallback): Unit = js.native
    
    def closePromise(fd: Double): js.Promise[Unit] = js.native
    
    /* private */ var maxFilesNo: Any = js.native
    
    def open(path: String, flags: OpenFileFlags, callback: OpenFileCallback): Unit = js.native
    
    def openPromise(path: String, flags: OpenFileFlags): js.Promise[Double] = js.native
    
    /* private */ var pendingJobs: Any = js.native
    
    def process(): Unit = js.native
  }
  
  type OpenFileCallback = js.Function2[
    /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
    /* fd */ Double, 
    Unit
  ]
  
  type OpenFileFlags = String
}
