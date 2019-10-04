package typings.elasticlunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticlunrMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.elasticlunr.Anon_Df
  import typings.elasticlunr.Anon_Tf

  type DocumentReference = String | Double
  type EventHandler = js.Function1[/* repeated */ js.Any, Unit]
  type FieldSearchConfig[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? {  bool? :elasticlunr.elasticlunr.Bool,   boost? :number,   expand? :boolean}}
    */ typings.elasticlunr.elasticlunrStrings.FieldSearchConfig with js.Any
  type IndexDocuments[T] = StringDictionary[T]
  type IndexTokens = StringDictionary[js.Array[String]]
  type InvertedIndexDocs = StringDictionary[Anon_Tf]
  type InvertedIndexNode = InvertedIndexCharNode with Anon_Df
  type PipelineFunction = js.Function3[
    /* token */ String, 
    /* i */ Double, 
    /* tokens */ js.Array[String], 
    js.UndefOr[String | Null | Unit]
  ]
  type SearchScores = StringDictionary[Double]
  type SerialisedPipeline = js.Array[String]
}
