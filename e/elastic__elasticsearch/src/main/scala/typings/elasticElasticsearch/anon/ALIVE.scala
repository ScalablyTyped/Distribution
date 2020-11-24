package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALIVE extends js.Object {
  
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
  implicit class ALIVEOps[Self <: ALIVE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setALIVE(value: String): Self = this.set("ALIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEAD(value: String): Self = this.set("DEAD", value.asInstanceOf[js.Any])
  }
}
