package typings.findInFiles

import org.scalablytyped.runtime.StringDictionary
import typings.findInFiles.anon.Count
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("find-in-files", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def find(pattern: String, directory: String): js.Promise[FindResult] = js.native
  def find(pattern: String, directory: String, fileFilter: String): js.Promise[FindResult] = js.native
  def find(pattern: String, directory: String, fileFilter: RegExp): js.Promise[FindResult] = js.native
  def find(pattern: RegExp, directory: String): js.Promise[FindResult] = js.native
  def find(pattern: RegExp, directory: String, fileFilter: String): js.Promise[FindResult] = js.native
  def find(pattern: RegExp, directory: String, fileFilter: RegExp): js.Promise[FindResult] = js.native
  
  def findSync(pattern: String, directory: String): FindResult = js.native
  def findSync(pattern: String, directory: String, fileFilter: String): FindResult = js.native
  def findSync(pattern: String, directory: String, fileFilter: RegExp): FindResult = js.native
  def findSync(pattern: RegExp, directory: String): FindResult = js.native
  def findSync(pattern: RegExp, directory: String, fileFilter: String): FindResult = js.native
  def findSync(pattern: RegExp, directory: String, fileFilter: RegExp): FindResult = js.native
  
  type FindResult = StringDictionary[Count]
}
