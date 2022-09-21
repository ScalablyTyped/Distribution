package typings.fuzzyFinder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Tiny fuzzy searcher.
    *
    * @example
    * import fuzzyFinder = require('fuzzy-finder')
    *
    * console.log(fuzzy('da', [
    *     'dota.js',
    *     'stratures.js',
    *     'structures.js',
    *     'database.db',
    *     'user-data.js',
    *     'dummy-data.txt',
    *     'other.js'
    * ]))
    * // [ { match: 'dota.js', rank: 0 },
    * //   { match: 'database.db', rank: 0 },
    * //   { match: 'user-data.js', rank: 5 },
    * //   { match: 'dummy-data.txt', rank: 0 } ]
    */
  inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  inline def apply(/** @default '' */
  str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(/** @default '' */
  str: String, /** @default [] */
  args: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(/** @default '' */
  str: Unit, /** @default [] */
  args: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("fuzzy-finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
