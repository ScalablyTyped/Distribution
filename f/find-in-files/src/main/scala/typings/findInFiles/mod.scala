package typings.findInFiles

import org.scalablytyped.runtime.StringDictionary
import typings.findInFiles.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-in-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(pattern: String, directory: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: String, directory: String, fileFilter: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: String, directory: String, fileFilter: js.RegExp): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: js.RegExp, directory: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: js.RegExp, directory: String, fileFilter: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: js.RegExp, directory: String, fileFilter: js.RegExp): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: RegexControlOptions, directory: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: RegexControlOptions, directory: String, fileFilter: String): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  inline def find(pattern: RegexControlOptions, directory: String, fileFilter: js.RegExp): js.Promise[FindResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindResult]]
  
  inline def findSync(pattern: String, directory: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: String, directory: String, fileFilter: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: String, directory: String, fileFilter: js.RegExp): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: js.RegExp, directory: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: js.RegExp, directory: String, fileFilter: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: js.RegExp, directory: String, fileFilter: js.RegExp): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: RegexControlOptions, directory: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: RegexControlOptions, directory: String, fileFilter: String): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  inline def findSync(pattern: RegexControlOptions, directory: String, fileFilter: js.RegExp): FindResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(pattern.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], fileFilter.asInstanceOf[js.Any])).asInstanceOf[FindResult]
  
  type FindResult = StringDictionary[Count]
  
  trait RegexControlOptions extends StObject {
    
    var flags: String
    
    var term: String
  }
  object RegexControlOptions {
    
    inline def apply(flags: String, term: String): RegexControlOptions = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexControlOptions]
    }
    
    extension [Self <: RegexControlOptions](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
}
