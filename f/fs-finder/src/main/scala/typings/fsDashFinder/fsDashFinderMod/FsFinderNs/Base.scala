package typings.fsDashFinder.fsDashFinderMod.FsFinderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

