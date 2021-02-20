package typings.emberData.mod.DS

import typings.emberData.emberDataBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sync extends StObject {
  
  var async: `false` = js.native
}
object Sync {
  
  @scala.inline
  def apply(async: `false`): Sync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
  
  @scala.inline
  implicit class SyncMutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
  }
}
