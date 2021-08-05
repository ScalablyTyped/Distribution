package typings.findInFiles

import org.scalablytyped.runtime.StringDictionary
import typings.findInFiles.anon.Count
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-in-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(pattern: String, directory: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: String, directory: String, fileFilter: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: String, directory: String, fileFilter: RegExp): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: RegExp, directory: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: RegExp, directory: String, fileFilter: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: RegExp, directory: String, fileFilter: RegExp): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  
  inline def findSync(pattern: String, directory: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: String, directory: String, fileFilter: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: String, directory: String, fileFilter: RegExp): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: RegExp, directory: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: RegExp, directory: String, fileFilter: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: RegExp, directory: String, fileFilter: RegExp): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  
  type FindResult = StringDictionary[Count]
}
