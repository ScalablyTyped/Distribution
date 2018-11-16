package typings
package fsDashFinderLib.fsDashFinderMod.FsFinderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  def checkExcludes(path: java.lang.String): scala.Boolean = js.native
  def checkFile(path: java.lang.String, stats: js.Any, mask: Mask, `type`: Type): scala.Double = js.native
  def checkFilters(path: java.lang.String, stats: js.Any): scala.Boolean = js.native
  def checkSystemFiles(path: java.lang.String): scala.Boolean = js.native
  def exclude(excludes: java.lang.String): Finder = js.native
  def exclude(excludes: java.lang.String, exactly: scala.Boolean): Finder = js.native
  def exclude(excludes: js.Array[java.lang.String]): Finder = js.native
  def exclude(excludes: js.Array[java.lang.String], exactly: scala.Boolean): Finder = js.native
  def filter(fn: js.Function): Finder = js.native
  def findFirst(): Finder = js.native
  def findFirst(findFirst: scala.Boolean): Finder = js.native
  def getPathsAsync(fn: AsyncFunction): scala.Unit = js.native
  def getPathsAsync(fn: AsyncFunction, `type`: Type): scala.Unit = js.native
  def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask): scala.Unit = js.native
  def getPathsAsync(fn: AsyncFunction, `type`: Type, mask: Mask, dir: Directory): scala.Unit = js.native
  def getPathsFromParentsAsync(fn: AsyncFunction): scala.Unit = js.native
  def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask): scala.Unit = js.native
  def getPathsFromParentsAsync(fn: AsyncFunction, mask: Mask, `type`: Type): scala.Unit = js.native
  def getPathsFromParentsSync(): js.Array[java.lang.String] = js.native
  def getPathsFromParentsSync(mask: Mask): js.Array[java.lang.String] = js.native
  def getPathsFromParentsSync(mask: Mask, `type`: Type): js.Array[java.lang.String] = js.native
  def getPathsSync(): js.Array[java.lang.String] = js.native
  def getPathsSync(`type`: Type): js.Array[java.lang.String] = js.native
  def getPathsSync(`type`: Type, mask: Mask): js.Array[java.lang.String] = js.native
  def getPathsSync(`type`: Type, mask: Mask, dir: Directory): js.Array[java.lang.String] = js.native
  def lookUp(): Finder = js.native
  def lookUp(up: scala.Boolean): Finder = js.native
  def recursively(): Finder = js.native
  def recursively(recursive: scala.Boolean): Finder = js.native
  def showSystemFiles(): Finder = js.native
  def showSystemFiles(systemFiles: scala.Boolean): Finder = js.native
}

