package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.scripted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityScriptedTfidf extends StObject {
  
  var script: Script
  
  var `type`: scripted
}
object IndicesSettingsSimilarityScriptedTfidf {
  
  inline def apply(script: Script): IndicesSettingsSimilarityScriptedTfidf = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("scripted")
    __obj.asInstanceOf[IndicesSettingsSimilarityScriptedTfidf]
  }
  
  extension [Self <: IndicesSettingsSimilarityScriptedTfidf](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setType(value: scripted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
