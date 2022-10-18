package typings.elasticElasticsearch.libHelpersMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libHelpersMod.IndexAction
  - typings.elasticElasticsearch.libHelpersMod.CreateAction
  - typings.elasticElasticsearch.libHelpersMod.UpdateAction
  - typings.elasticElasticsearch.libHelpersMod.DeleteAction
*/
type Action = _Action | UpdateAction

type UpdateAction = js.Tuple2[UpdateActionOperation, Record[String, Any]]
