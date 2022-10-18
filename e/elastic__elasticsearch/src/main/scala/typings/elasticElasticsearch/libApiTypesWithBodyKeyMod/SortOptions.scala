package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortOptions
  extends StObject
     with SortOptionsKeys
     with /* property */ StringDictionary[FieldSort | SortOrder | ScoreSort | GeoDistanceSort | ScriptSort]
object SortOptions {
  
  inline def apply(): SortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptions]
  }
}
