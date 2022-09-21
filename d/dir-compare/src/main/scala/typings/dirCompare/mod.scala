package typings.dirCompare

import typings.dirCompare.typesMod.FileCompareHandlers
import typings.dirCompare.typesMod.Options
import typings.dirCompare.typesMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dir-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(path1: String, path2: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def compare(path1: String, path2: String, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def compareSync(path1: String, path2: String): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def compareSync(path1: String, path2: String, options: Options): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @JSImport("dir-compare", "fileCompareHandlers")
  @js.native
  val fileCompareHandlers: FileCompareHandlers = js.native
}
