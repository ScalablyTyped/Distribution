package typings.fsDashFinder.fsDashFinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-finder", "FsFinder")
@js.native
object FsFinder extends js.Object {
  @js.native
  trait Base extends js.Object {
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
    def getPathsAsync(fn: AsyncFunction, `type`: Type): Unit = js.native
    def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask): Unit = js.native
    def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask, dir: Directory): Unit = js.native
    def getPathsFromParentsAsync(fn: AsyncFunction): Unit = js.native
    def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask): Unit = js.native
    def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask, `type`: Type): Unit = js.native
    def getPathsFromParentsSync(): js.Array[String] = js.native
    def getPathsFromParentsSync(mask: Mask): js.Array[String] = js.native
    def getPathsFromParentsSync(mask: Mask, `type`: Type): js.Array[String] = js.native
    def getPathsSync(): js.Array[String] = js.native
    def getPathsSync(`type`: Type): js.Array[String] = js.native
    def getPathsSync(`type`: Type, mask: Mask): js.Array[String] = js.native
    def getPathsSync(`type`: Type, mask: Mask, dir: Directory): js.Array[String] = js.native
    def lookUp(): Finder = js.native
    def lookUp(up: Boolean): Finder = js.native
    def recursively(): Finder = js.native
    def recursively(recursive: Boolean): Finder = js.native
    def showSystemFiles(): Finder = js.native
    def showSystemFiles(systemFiles: Boolean): Finder = js.native
  }
  
  @js.native
  trait Finder extends Base {
    def date(): Finder = js.native
    def date(operation: js.Any): Finder = js.native
    def date(operation: js.Any, value: js.Any): Finder = js.native
    def find(): js.Array[String] = js.native
    def find(mask: Mask): js.Array[String] = js.native
    def find(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
    def find(mask: Mask, fn: AsyncFunction, `type`: Type): js.Array[String] = js.native
    def findDirectories(): js.Array[String] = js.native
    def findDirectories(mask: Mask): js.Array[String] = js.native
    def findDirectories(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
    def findDirectory(): js.Array[String] = js.native
    def findDirectory(mask: Mask): js.Array[String] = js.native
    def findDirectory(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
    def findFile(): js.Array[String] = js.native
    def findFile(mask: Mask): js.Array[String] = js.native
    def findFile(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
    def findFiles(): js.Array[String] = js.native
    def findFiles(mask: Mask): js.Array[String] = js.native
    def findFiles(mask: Mask, fn: AsyncFunction): js.Array[String] = js.native
    def size(): Finder = js.native
    def size(operation: js.Any): Finder = js.native
    def size(operation: js.Any, value: js.Any): Finder = js.native
  }
  
  type AsyncFunction = js.Function1[/* paths */ String | js.Array[String], Unit]
  type Directory = String
  type Mask = String
  type Type = String
}

