package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleLifecycleExplainManaged
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleLifecycleExplainUnmanaged
*/
trait IlmExplainLifecycleLifecycleExplain extends StObject
object IlmExplainLifecycleLifecycleExplain {
  
  inline def IlmExplainLifecycleLifecycleExplainManaged(phase: Name, policy: Name): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleLifecycleExplainManaged = {
    val __obj = js.Dynamic.literal(managed = true, phase = phase.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleLifecycleExplainManaged]
  }
  
  inline def IlmExplainLifecycleLifecycleExplainUnmanaged(index: IndexName): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleLifecycleExplainUnmanaged = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], managed = false)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleLifecycleExplainUnmanaged]
  }
}
