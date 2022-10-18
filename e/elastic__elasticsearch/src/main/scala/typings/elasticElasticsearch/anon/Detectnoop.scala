package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchSourceConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detectnoop[TPartialDocument, TDocument] extends StObject {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var detect_noop: js.UndefOr[Boolean] = js.undefined
  
  var doc: js.UndefOr[TPartialDocument] = js.undefined
  
  var doc_as_upsert: js.UndefOr[Boolean] = js.undefined
  
  var script: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Script] = js.undefined
  
  var scripted_upsert: js.UndefOr[Boolean] = js.undefined
  
  var upsert: js.UndefOr[TDocument] = js.undefined
}
object Detectnoop {
  
  inline def apply[TPartialDocument, TDocument](): Detectnoop[TPartialDocument, TDocument] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detectnoop[TPartialDocument, TDocument]]
  }
  
  extension [Self <: Detectnoop[?, ?], TPartialDocument, TDocument](x: Self & (Detectnoop[TPartialDocument, TDocument])) {
    
    inline def setDetect_noop(value: Boolean): Self = StObject.set(x, "detect_noop", value.asInstanceOf[js.Any])
    
    inline def setDetect_noopUndefined: Self = StObject.set(x, "detect_noop", js.undefined)
    
    inline def setDoc(value: TPartialDocument): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setDoc_as_upsert(value: Boolean): Self = StObject.set(x, "doc_as_upsert", value.asInstanceOf[js.Any])
    
    inline def setDoc_as_upsertUndefined: Self = StObject.set(x, "doc_as_upsert", js.undefined)
    
    inline def setScript(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setScripted_upsert(value: Boolean): Self = StObject.set(x, "scripted_upsert", value.asInstanceOf[js.Any])
    
    inline def setScripted_upsertUndefined: Self = StObject.set(x, "scripted_upsert", js.undefined)
    
    inline def setUpsert(value: TDocument): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
