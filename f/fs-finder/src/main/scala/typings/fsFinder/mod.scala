package typings.fsFinder

import typings.fsFinder.mod.FsFinder.AsyncFunction
import typings.fsFinder.mod.FsFinder.Finder
import typings.fsFinder.mod.FsFinder.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("fs-finder", JSImport.Namespace)
  @js.native
  class ^ () extends Finder
  @JSImport("fs-finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fs-finder", "TIME_FORMAT")
  @js.native
  def TIME_FORMAT: String = js.native
  @scala.inline
  def TIME_FORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_FORMAT")(x.asInstanceOf[js.Any])
  
  @JSImport("fs-finder", "find")
  @js.native
  def find(path: String): Finder = js.native
  @JSImport("fs-finder", "find")
  @js.native
  def find(path: String, fn: js.UndefOr[scala.Nothing], `type`: Type): Finder = js.native
  @JSImport("fs-finder", "find")
  @js.native
  def find(path: String, fn: AsyncFunction): Finder = js.native
  @JSImport("fs-finder", "find")
  @js.native
  def find(path: String, fn: AsyncFunction, `type`: Type): Finder = js.native
  
  @JSImport("fs-finder", "findDirectories")
  @js.native
  def findDirectories(): Finder = js.native
  @JSImport("fs-finder", "findDirectories")
  @js.native
  def findDirectories(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  @JSImport("fs-finder", "findDirectories")
  @js.native
  def findDirectories(path: String): Finder = js.native
  @JSImport("fs-finder", "findDirectories")
  @js.native
  def findDirectories(path: String, fn: AsyncFunction): Finder = js.native
  
  @JSImport("fs-finder", "findDirectory")
  @js.native
  def findDirectory(): Finder = js.native
  @JSImport("fs-finder", "findDirectory")
  @js.native
  def findDirectory(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  @JSImport("fs-finder", "findDirectory")
  @js.native
  def findDirectory(path: String): Finder = js.native
  @JSImport("fs-finder", "findDirectory")
  @js.native
  def findDirectory(path: String, fn: AsyncFunction): Finder = js.native
  
  @JSImport("fs-finder", "findFile")
  @js.native
  def findFile(): Finder = js.native
  @JSImport("fs-finder", "findFile")
  @js.native
  def findFile(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  @JSImport("fs-finder", "findFile")
  @js.native
  def findFile(path: String): Finder = js.native
  @JSImport("fs-finder", "findFile")
  @js.native
  def findFile(path: String, fn: AsyncFunction): Finder = js.native
  
  @JSImport("fs-finder", "findFiles")
  @js.native
  def findFiles(): Finder = js.native
  @JSImport("fs-finder", "findFiles")
  @js.native
  def findFiles(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  @JSImport("fs-finder", "findFiles")
  @js.native
  def findFiles(path: String): Finder = js.native
  @JSImport("fs-finder", "findFiles")
  @js.native
  def findFiles(path: String, fn: AsyncFunction): Finder = js.native
  
  @JSImport("fs-finder", "from")
  @js.native
  def from(path: String): Finder = js.native
  
  @JSImport("fs-finder", "in")
  @js.native
  def in(path: String): Finder = js.native
  
  object FsFinder {
    
    type AsyncFunction = js.Function1[/* paths */ String | js.Array[String], Unit]
    
    @js.native
    trait Base extends StObject {
      
      def checkExcludes(path: String): Boolean = js.native
      
      def checkFile(path: String, stats: js.Any, mask: Mask, `type`: Type): Double = js.native
      
      def checkFilters(path: String, stats: js.Any): Boolean = js.native
      
      def checkSystemFiles(path: String): Boolean = js.native
      
      def exclude(excludes: String): Finder = js.native
      def exclude(excludes: String, exactly: Boolean): Finder = js.native
      def exclude(excludes: js.Array[String]): Finder = js.native
      def exclude(excludes: js.Array[String], exactly: Boolean): Finder = js.native
      
      def filter(fn: js.Function): Finder = js.native
      
      def findFirst(): Finder = js.native
      def findFirst(findFirst: Boolean): Finder = js.native
      
      def getPathsAsync(fn: AsyncFunction): Unit = js.native
      def getPathsAsync(
        fn: AsyncFunction,
        `type`: js.UndefOr[scala.Nothing],
        mask: js.UndefOr[scala.Nothing],
        dir: Directory
      ): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: js.UndefOr[scala.Nothing], mask: Mask): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: js.UndefOr[scala.Nothing], mask: Mask, dir: Directory): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: js.UndefOr[scala.Nothing], dir: Directory): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask): Unit = js.native
      def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask, dir: Directory): Unit = js.native
      
      def getPathsFromParentsAsync(fn: AsyncFunction): Unit = js.native
      def getPathsFromParentsAsync(fn: AsyncFunction, mask: js.UndefOr[scala.Nothing], `type`: Type): Unit = js.native
      def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask): Unit = js.native
      def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask, `type`: Type): Unit = js.native
      
      def getPathsFromParentsSync(): js.Array[String] = js.native
      def getPathsFromParentsSync(mask: js.UndefOr[scala.Nothing], `type`: Type): js.Array[String] = js.native
      def getPathsFromParentsSync(mask: Mask): js.Array[String] = js.native
      def getPathsFromParentsSync(mask: Mask, `type`: Type): js.Array[String] = js.native
      
      def getPathsSync(): js.Array[String] = js.native
      def getPathsSync(`type`: js.UndefOr[scala.Nothing], mask: js.UndefOr[scala.Nothing], dir: Directory): js.Array[String] = js.native
      def getPathsSync(`type`: js.UndefOr[scala.Nothing], mask: Mask): js.Array[String] = js.native
      def getPathsSync(`type`: js.UndefOr[scala.Nothing], mask: Mask, dir: Directory): js.Array[String] = js.native
      def getPathsSync(`type`: Type): js.Array[String] = js.native
      def getPathsSync(`type`: Type, mask: js.UndefOr[scala.Nothing], dir: Directory): js.Array[String] = js.native
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
    trait Finder extends Base {
      
      def date(): Finder = js.native
      def date(operation: js.UndefOr[scala.Nothing], value: js.Any): Finder = js.native
      def date(operation: js.Any): Finder = js.native
      def date(operation: js.Any, value: js.Any): Finder = js.native
      
      def find(): js.Array[String] = js.native
      def find(mask: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], `type`: Type): js.Array[String] = js.native
      def find(mask: js.UndefOr[scala.Nothing], fn: AsyncFunction): js.Array[String] = js.native
      def find(mask: js.UndefOr[scala.Nothing], fn: AsyncFunction, `type`: Type): js.Array[String] = js.native
      def find(mask: Mask): js.Array[String] = js.native
      def find(mask: Mask, fn: js.UndefOr[scala.Nothing], `type`: Type): js.Array[String] = js.native
      def find(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      def find(mask: Mask, fn: AsyncFunction, `type`: Type): js.Array[String] = js.native
      
      def findDirectories(): js.Array[String] = js.native
      def findDirectories(mask: js.UndefOr[scala.Nothing], fn: AsyncFunction): js.Array[String] = js.native
      def findDirectories(mask: Mask): js.Array[String] = js.native
      def findDirectories(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def findDirectory(): js.Array[String] = js.native
      def findDirectory(mask: js.UndefOr[scala.Nothing], fn: AsyncFunction): js.Array[String] = js.native
      def findDirectory(mask: Mask): js.Array[String] = js.native
      def findDirectory(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def findFile(): js.Array[String] = js.native
      def findFile(mask: js.UndefOr[scala.Nothing], fn: AsyncFunction): js.Array[String] = js.native
      def findFile(mask: Mask): js.Array[String] = js.native
      def findFile(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def findFiles(): js.Array[String] = js.native
      def findFiles(mask: js.UndefOr[scala.Nothing], fn: AsyncFunction): js.Array[String] = js.native
      def findFiles(mask: Mask): js.Array[String] = js.native
      def findFiles(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
      
      def size(): Finder = js.native
      def size(operation: js.UndefOr[scala.Nothing], value: js.Any): Finder = js.native
      def size(operation: js.Any): Finder = js.native
      def size(operation: js.Any, value: js.Any): Finder = js.native
    }
    
    // 'all'|'directories'|'files'
    type Mask = String
    
    type Type = String
  }
}
