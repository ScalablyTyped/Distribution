package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.elasticlunrjs.anon.Tf
import typings.elasticlunrjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply[T /* <: js.Object */](): Index[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Index[T]]
inline def apply[T /* <: js.Object */](config: js.ThisFunction1[/* this */ Index[T], /* idx */ Index[T], Unit]): Index[T] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Index[T]]

inline def addStopWords(words: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStopWords")(words.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def clearStopWords(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStopWords")().asInstanceOf[Unit]

inline def generateStopWordFilter(stopWords: js.Array[String]): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStopWordFilter")(stopWords.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]

inline def resetStopWords(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStopWords")().asInstanceOf[Unit]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type DocumentReference = String | Double

type IndexDocuments[T] = StringDictionary[T]

type IndexTokens = StringDictionary[js.Array[String]]

type InvertedIndexDocs = StringDictionary[Tf]

type PipelineFunction = js.Function3[
/* token */ String, 
/* tokenIndex */ Double, 
/* tokens */ js.Array[String], 
js.UndefOr[String | Null | Unit]]

type SearchScores = StringDictionary[Double]

type SerialisedPipeline = js.Array[String]
