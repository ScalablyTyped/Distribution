package typings.findupSync

import typings.micromatch.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(patternOrPatterns: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(patternOrPatterns: String, micromatchOptions: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any], micromatchOptions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  /**
    * Find the first file matching a given pattern in the current directory or the nearest ancestor directory.
    *
    * @param patternOrPatterns Glob pattern(s) or file path(s) to match against.
    * @param micromatchOptions Options to pass to [micromatch](https://github.com/jonschlinkert/micromatch).
    * Note that if you want to start in a different directory than the current working directory, specify a `cwd` property here.
    * @returns Returns the first matching file.
    */
  inline def apply(patternOrPatterns: js.Array[String]): String | Null = ^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(patternOrPatterns: js.Array[String], micromatchOptions: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any], micromatchOptions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("findup-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
