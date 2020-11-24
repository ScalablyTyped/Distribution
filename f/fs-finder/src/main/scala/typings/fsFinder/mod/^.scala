package typings.fsFinder.mod

import typings.fsFinder.mod.FsFinder.AsyncFunction
import typings.fsFinder.mod.FsFinder.Finder
import typings.fsFinder.mod.FsFinder.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-finder", JSImport.Namespace)
@js.native
class ^ () extends Finder
@JSImport("fs-finder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var TIME_FORMAT: String = js.native
  
  def find(path: String): Finder = js.native
  def find(path: String, fn: js.UndefOr[scala.Nothing], `type`: Type): Finder = js.native
  def find(path: String, fn: AsyncFunction): Finder = js.native
  def find(path: String, fn: AsyncFunction, `type`: Type): Finder = js.native
  
  def findDirectories(): Finder = js.native
  def findDirectories(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  def findDirectories(path: String): Finder = js.native
  def findDirectories(path: String, fn: AsyncFunction): Finder = js.native
  
  def findDirectory(): Finder = js.native
  def findDirectory(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  def findDirectory(path: String): Finder = js.native
  def findDirectory(path: String, fn: AsyncFunction): Finder = js.native
  
  def findFile(): Finder = js.native
  def findFile(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  def findFile(path: String): Finder = js.native
  def findFile(path: String, fn: AsyncFunction): Finder = js.native
  
  def findFiles(): Finder = js.native
  def findFiles(path: js.UndefOr[scala.Nothing], fn: AsyncFunction): Finder = js.native
  def findFiles(path: String): Finder = js.native
  def findFiles(path: String, fn: AsyncFunction): Finder = js.native
  
  def from(path: String): Finder = js.native
  
  def in(path: String): Finder = js.native
}
