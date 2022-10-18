package typings.flexsearch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.flexsearch.flexsearchBooleans.`false`
import typings.flexsearch.flexsearchBooleans.`true`
import typings.flexsearch.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def create_false(options: IndexOptions[String, `false`]): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Index]

inline def registerCharset(name: String, charset: CharsetOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCharset")(name.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerLanguage(name: String, language: LanguageOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]

/* Rewritten from type alias, can be one of: 
  - typings.flexsearch.flexsearchBooleans.`false`
  - typings.flexsearch.flexsearchStrings.default
  - typings.flexsearch.flexsearchStrings.simple
  - typings.flexsearch.flexsearchStrings.balance
  - typings.flexsearch.flexsearchStrings.advanced
  - typings.flexsearch.flexsearchStrings.extra
  - js.Function1[/ * x * / java.lang.String, js.Array[java.lang.String]]
*/
type Encoders = _Encoders | (js.Function1[/* x */ String, js.Array[String]])

type EnrichStoreOption = `true` | String | js.Array[String]

type ExportHandler[T] = js.Function2[/* id */ String | Double, /* value */ T, Unit]

type FilterArray = js.Array[String]

type FilterFunction = js.Function1[/* x */ String, Boolean]

type Id = Double | String

type IndexSearchResult = js.Array[Id]

type Limit = Double

type Matcher = StringDictionary[String]

type Stemmer = StringDictionary[String]

type StoreOption = Boolean | String | js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.flexsearch.flexsearchStrings.strict
  - typings.flexsearch.flexsearchStrings.forward
  - typings.flexsearch.flexsearchStrings.reverse
  - typings.flexsearch.flexsearchStrings.full
  - js.Function1[/ * x * / java.lang.String, js.Array[java.lang.String]]
*/
type Tokenizer = _Tokenizer | (js.Function1[/* x */ String, js.Array[String]])
