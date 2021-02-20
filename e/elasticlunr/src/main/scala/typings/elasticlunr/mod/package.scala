package typings.elasticlunr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply[T](): typings.elasticlunr.mod.Index[T] = typings.elasticlunr.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.elasticlunr.mod.Index[T]]
  @scala.inline
  def apply[T](
    config: js.ThisFunction1[
      /* this */ typings.elasticlunr.mod.Index[T], 
      /* idx */ typings.elasticlunr.mod.Index[T], 
      scala.Unit
    ]
  ): typings.elasticlunr.mod.Index[T] = typings.elasticlunr.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunr.mod.Index[T]]
  
  type DocumentReference = java.lang.String | scala.Double
  
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type FieldSearchConfig[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? {  bool :elasticlunr.elasticlunr.Bool | undefined,   boost :number | undefined}}
    */ typings.elasticlunr.elasticlunrStrings.FieldSearchConfig with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type IndexDocuments[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type IndexTokens = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type InvertedIndexDocs = org.scalablytyped.runtime.StringDictionary[typings.elasticlunr.anon.Tf]
  
  type PipelineFunction = js.Function3[
    /* token */ java.lang.String, 
    /* i */ scala.Double, 
    /* tokens */ js.Array[java.lang.String], 
    js.UndefOr[java.lang.String | scala.Null | scala.Unit]
  ]
  
  type SearchScores = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type SerialisedPipeline = js.Array[java.lang.String]
  
  @scala.inline
  def addStopWords(words: js.Array[java.lang.String]): scala.Unit = typings.elasticlunr.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addStopWords")(words.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearStopWords(): scala.Unit = typings.elasticlunr.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearStopWords")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def resetStopWords(): scala.Unit = typings.elasticlunr.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resetStopWords")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def version: java.lang.String = typings.elasticlunr.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
