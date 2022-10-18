package typings.forkTsCheckerWebpackPlugin

import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibFileSystemFileSystemMod {
  
  @js.native
  trait FileSystem extends StObject {
    
    def clearCache(): Unit = js.native
    
    def createDir(path: String): Unit = js.native
    
    def deleteFile(path: String): Unit = js.native
    
    def exists(path: String): Boolean = js.native
    
    def normalizePath(path: String): String = js.native
    
    def readDir(path: String): js.Array[Dirent] = js.native
    
    def readFile(path: String): js.UndefOr[String] = js.native
    def readFile(path: String, encoding: String): js.UndefOr[String] = js.native
    
    def readStats(path: String): js.UndefOr[Stats] = js.native
    
    def realPath(path: String): String = js.native
    
    def updateTimes(path: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    def writeFile(path: String, data: String): Unit = js.native
  }
}
