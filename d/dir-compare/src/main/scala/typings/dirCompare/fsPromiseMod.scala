package typings.dirCompare

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsPromiseMod {
  
  object FsPromise {
    
    @JSImport("dir-compare/build/src/FileSystem/FsPromise", "FsPromise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesRead]]
    inline def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesRead]]
    
    inline def readdir(path: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  }
  
  type BytesRead = Double
}
