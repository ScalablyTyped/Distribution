package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherArrayCompareCondition
  extends StObject
     with WatcherArrayCompareConditionKeys
     with /* property */ StringDictionary[WatcherArrayCompareOpParams | String]
object WatcherArrayCompareCondition {
  
  inline def apply(path: String): WatcherArrayCompareCondition = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherArrayCompareCondition]
  }
}
