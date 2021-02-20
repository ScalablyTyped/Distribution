package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALIVE extends StObject {
  
  var ALIVE: String = js.native
  
  var DEAD: String = js.native
}
object ALIVE {
  
  @scala.inline
  def apply(ALIVE: String, DEAD: String): ALIVE = {
    val __obj = js.Dynamic.literal(ALIVE = ALIVE.asInstanceOf[js.Any], DEAD = DEAD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALIVE]
  }
  
  @scala.inline
  implicit class ALIVEMutableBuilder[Self <: ALIVE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setALIVE(value: String): Self = StObject.set(x, "ALIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEAD(value: String): Self = StObject.set(x, "DEAD", value.asInstanceOf[js.Any])
  }
}
