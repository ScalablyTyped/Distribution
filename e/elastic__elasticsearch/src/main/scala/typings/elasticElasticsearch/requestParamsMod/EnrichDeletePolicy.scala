package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrichDeletePolicy extends Generic {
  
  var name: String = js.native
}
object EnrichDeletePolicy {
  
  @scala.inline
  def apply(name: String): EnrichDeletePolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichDeletePolicy]
  }
  
  @scala.inline
  implicit class EnrichDeletePolicyMutableBuilder[Self <: EnrichDeletePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
