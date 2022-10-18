package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesAlias
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var aliases: js.UndefOr[Record[IndexName, IndicesAlias]] = js.undefined
  
  var settings: js.UndefOr[Record[String, Any]] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
