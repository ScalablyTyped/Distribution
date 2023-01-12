package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetAliasIndexAliases extends StObject {
  
  var aliases: Record[String, IndicesAliasDefinition]
}
object IndicesGetAliasIndexAliases {
  
  inline def apply(aliases: Record[String, IndicesAliasDefinition]): IndicesGetAliasIndexAliases = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetAliasIndexAliases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesGetAliasIndexAliases] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Record[String, IndicesAliasDefinition]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
  }
}
