package typings.fsFinder

import typings.fsFinder.mod.FsFinder.AsyncFunction
import typings.fsFinder.mod.FsFinder.Finder
import typings.fsFinder.mod.FsFinder.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("fs-finder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Finder
  @JSImport("fs-finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fs-finder", "TIME_FORMAT")
  @js.native
  def TIME_FORMAT: String = js.native
  inline def TIME_FORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_FORMAT")(x.asInstanceOf[js.Any])
  
  inline def find(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  inline def find(path: String, fn: Unit, `type`: Type): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Finder]
  inline def find(path: String, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  inline def find(path: String, fn: AsyncFunction, `type`: Type): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Finder]
  
  inline def findDirectories(): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findDirectories")().asInstanceOf[Finder]
  inline def findDirectories(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findDirectories")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  inline def findDirectories(path: String, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findDirectories")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  inline def findDirectories(path: Unit, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findDirectories")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  
  inline def findDirectory(): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findDirectory")().asInstanceOf[Finder]
  inline def findDirectory(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  inline def findDirectory(path: String, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findDirectory")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  inline def findDirectory(path: Unit, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findDirectory")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  
  inline def findFile(): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findFile")().asInstanceOf[Finder]
  inline def findFile(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findFile")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  inline def findFile(path: String, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findFile")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  inline def findFile(path: Unit, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findFile")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  
  inline def findFiles(): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")().asInstanceOf[Finder]
  inline def findFiles(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  inline def findFiles(path: String, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  inline def findFiles(path: Unit, fn: AsyncFunction): Finder = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Finder]
  
  inline def from(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  
  inline def in(path: String): Finder = ^.asInstanceOf[js.Dynamic].applyDynamic("in")(path.asInstanceOf[js.Any]).asInstanceOf[Finder]
  
  object FsFinder {
    
    type AsyncFunction = js.Function1[/* paths */ String | js.Array[String], Unit]
    
    @js.native
    trait Base extends StObject {
      
      def checkExcludes(path: String): Boolean = js.native
      
      def checkFile(path: String, stats: Any, mask: Mask, `type`: Type): Double = js.native
      
      def checkFilters(path: String, stats: Any): Boolean = js.native
      
      def checkSystemFiles(path: String): Boolean = js.native
      
      def exclude(excludes: String): Finder = js.native
      def exclude(excludes: String, exactly: Boolean): Finder = js.native
      def exclude(excludes: js.Array[String]): Finder = js.native
      def exclude(excludes: js.Array[String], exactly: Boolean): Finder = js.native
      
      def filter(fn: js.Function): Finder = js.native
      
      def findFirst(): Finder = js.native
      def findFirst(findFirst: Boolean): Finder = js.native
      
      def getPathsAsync(fn: AsyncFunction): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Unit, mask: Unit, dir: Directory): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Unit, mask: Mask): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Unit, mask: Mask, dir: Directory): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Unit, dir: Directory): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask, dir: Directory): Unit = js.native
      
      def getPathsFromParentsAsync(fn: AsyncFunction): Unit = js.native
      def getPathsFromParentsAsync(fn: AsyncFunction, mask: Unit, `type`: Type): Unit = js.native
      def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask): Unit = js.native
      def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask, `type`: Type): Unit = js.native
      
      def getPathsFromParentsSync(): js.Array[String] = js.native
      def getPathsFromParentsSync(mask: Unit, `type`: Type): js.Array[String] = js.native
      def getPathsFromParentsSync(mask: Mask): js.Array[String] = js.native
      def getPathsFromParentsSync(mask: Mask, `type`: Type): js.Array[String] = js.native
      
      def getPathsSync(): js.Array[String] = js.native
      def getPathsSync(`type`: Unit, mask: Unit, dir: Directory): js.Array[String] = js.native
      def getPathsSync(`type`: Unit, mask: Mask): js.Array[String] = js.native
      def getPathsSync(`type`: Unit, mask: Mask, dir: Directory): js.Array[String] = js.native
      def getPathsSync(`type`: Type): js.Array[String] = js.native
      def getPathsSync(`type`: Type, mask: Unit, dir: Directory): js.Array[String] = js.native
      def getPathsSync(`type`: Type, mask: Mask): js.Array[String] = js.native
      def getPathsSync(`type`: Type, mask: Mask, dir: Directory): js.Array[String] = js.native
      
      def lookUp(): Finder = js.native
      def lookUp(up: Boolean): Finder = js.native
      
      def recursively(): Finder = js.native
      def recursively(recursive: Boolean): Finder = js.native
      
      def showSystemFiles(): Finder = js.native
      def showSystemFiles(systemFiles: Boolean): Finder = js.native
    }
    
    type Directory = String
    
    @js.native
    trait Finder
      extends StObject
         with Base {
      
      def date(): Finder = js.native
      def date(operation: Any): Finder = js.native
      def date(operation: Any, value: Any): Finder = js.native
      def date(operation: Unit, value: Any): Finder = js.native
      
      def find(): js.Array[String] = js.native
      def find(mask: Unit, fn: Unit, `type`: Type): js.Array[String] = js.native
      def find(mask: Unit, fn: AsyncFunction): js.Array[String] = js.native
      def find(mask: Unit, fn: AsyncFunction, `type`: Type): js.Array[String] = js.native
      def find(mask: Mask): js.Array[String] = js.native
      def find(mask: Mask, fn: Unit, `type`: Type): js.Array[String] = js.native
      def find(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      def find(mask: Mask, fn: AsyncFunction, `type`: Type): js.Array[String] = js.native
      
      def findDirectories(): js.Array[String] = js.native
      def findDirectories(mask: Unit, fn: AsyncFunction): js.Array[String] = js.native
      def findDirectories(mask: Mask): js.Array[String] = js.native
      def findDirectories(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def findDirectory(): js.Array[String] = js.native
      def findDirectory(mask: Unit, fn: AsyncFunction): js.Array[String] = js.native
      def findDirectory(mask: Mask): js.Array[String] = js.native
      def findDirectory(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def findFile(): js.Array[String] = js.native
      def findFile(mask: Unit, fn: AsyncFunction): js.Array[String] = js.native
      def findFile(mask: Mask): js.Array[String] = js.native
      def findFile(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def findFiles(): js.Array[String] = js.native
      def findFiles(mask: Unit, fn: AsyncFunction): js.Array[String] = js.native
      def findFiles(mask: Mask): js.Array[String] = js.native
      def findFiles(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def size(): Finder = js.native
      def size(operation: Any): Finder = js.native
      def size(operation: Any, value: Any): Finder = js.native
      def size(operation: Unit, value: Any): Finder = js.native
    }
    
    // 'all'|'directories'|'files'
    type Mask = String
    
    type Type = String
  }
}
