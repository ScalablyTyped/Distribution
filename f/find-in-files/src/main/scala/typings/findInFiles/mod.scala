package typings.findInFiles

import org.scalablytyped.runtime.StringDictionary
import typings.findInFiles.anon.Count
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: String, directory: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: String, directory: String, fileFilter: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: String, directory: String, fileFilter: RegExp): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: RegExp, directory: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: RegExp, directory: String, fileFilter: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: RegExp, directory: String, fileFilter: RegExp): js.Promise[FindResult] = js.native
  
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: String, directory: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: String, directory: String, fileFilter: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: String, directory: String, fileFilter: RegExp): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: RegExp, directory: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: RegExp, directory: String, fileFilter: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: RegExp, directory: String, fileFilter: RegExp): FindResult = js.native
  
  type FindResult = StringDictionary[Count]
}
