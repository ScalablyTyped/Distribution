package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ignoreindexsettings extends StObject {
  
  var ignore_index_settings: js.UndefOr[js.Array[String]] = js.undefined
  
  var index: IndexName
  
  var index_settings: js.UndefOr[Record[String, Any]] = js.undefined
  
  var renamed_index: js.UndefOr[IndexName] = js.undefined
}
object Ignoreindexsettings {
  
  inline def apply(index: IndexName): Ignoreindexsettings = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ignoreindexsettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ignoreindexsettings] (val x: Self) extends AnyVal {
    
    inline def setIgnore_index_settings(value: js.Array[String]): Self = StObject.set(x, "ignore_index_settings", value.asInstanceOf[js.Any])
    
    inline def setIgnore_index_settingsUndefined: Self = StObject.set(x, "ignore_index_settings", js.undefined)
    
    inline def setIgnore_index_settingsVarargs(value: String*): Self = StObject.set(x, "ignore_index_settings", js.Array(value*))
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndex_settings(value: Record[String, Any]): Self = StObject.set(x, "index_settings", value.asInstanceOf[js.Any])
    
    inline def setIndex_settingsUndefined: Self = StObject.set(x, "index_settings", js.undefined)
    
    inline def setRenamed_index(value: IndexName): Self = StObject.set(x, "renamed_index", value.asInstanceOf[js.Any])
    
    inline def setRenamed_indexUndefined: Self = StObject.set(x, "renamed_index", js.undefined)
  }
}
