package typings.dirCompare

import typings.dirCompare.fileDescriptorQueueMod.FileDescriptorQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileCloserMod {
  
  object FileCloser {
    
    @JSImport("dir-compare/build/src/FileSystem/FileCloser", "FileCloser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dir-compare/build/src/FileSystem/FileCloser", "FileCloser.closeFilesAsync")
    @js.native
    def closeFilesAsync: js.Function3[
        /* fd1 */ js.UndefOr[Double], 
        /* fd2 */ js.UndefOr[Double], 
        /* fdQueue */ FileDescriptorQueue, 
        js.Promise[Unit]
      ] = js.native
    inline def closeFilesAsync(fd1: Double, fd2: Double, fdQueue: FileDescriptorQueue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesAsync")(fd1.asInstanceOf[js.Any], fd2.asInstanceOf[js.Any], fdQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def closeFilesAsync(fd1: Double, fd2: Unit, fdQueue: FileDescriptorQueue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesAsync")(fd1.asInstanceOf[js.Any], fd2.asInstanceOf[js.Any], fdQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def closeFilesAsync(fd1: Unit, fd2: Double, fdQueue: FileDescriptorQueue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesAsync")(fd1.asInstanceOf[js.Any], fd2.asInstanceOf[js.Any], fdQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def closeFilesAsync(fd1: Unit, fd2: Unit, fdQueue: FileDescriptorQueue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesAsync")(fd1.asInstanceOf[js.Any], fd2.asInstanceOf[js.Any], fdQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def closeFilesAsync_=(
      x: js.Function3[
          /* fd1 */ js.UndefOr[Double], 
          /* fd2 */ js.UndefOr[Double], 
          /* fdQueue */ FileDescriptorQueue, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeFilesAsync")(x.asInstanceOf[js.Any])
    
    inline def closeFilesSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesSync")().asInstanceOf[Unit]
    inline def closeFilesSync(fd1: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesSync")(fd1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def closeFilesSync(fd1: Double, fd2: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesSync")(fd1.asInstanceOf[js.Any], fd2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def closeFilesSync(fd1: Unit, fd2: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeFilesSync")(fd1.asInstanceOf[js.Any], fd2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @JSImport("dir-compare/build/src/FileSystem/FileCloser", "FileCloser.closeFilesSync")
    @js.native
    def closeFilesSync_FFileCloser: js.Function2[/* fd1 */ js.UndefOr[Double], /* fd2 */ js.UndefOr[Double], Unit] = js.native
    
    inline def closeFilesSync_FFileCloser_=(x: js.Function2[/* fd1 */ js.UndefOr[Double], /* fd2 */ js.UndefOr[Double], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeFilesSync")(x.asInstanceOf[js.Any])
  }
}
