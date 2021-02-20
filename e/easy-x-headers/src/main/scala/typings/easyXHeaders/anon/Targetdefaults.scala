package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Targetdefaults extends StObject {
  
  var target_defaults: Cflags = js.native
  
  var variables: Clang = js.native
}
object Targetdefaults {
  
  @scala.inline
  def apply(target_defaults: Cflags, variables: Clang): Targetdefaults = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targetdefaults]
  }
  
  @scala.inline
  implicit class TargetdefaultsMutableBuilder[Self <: Targetdefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget_defaults(value: Cflags): Self = StObject.set(x, "target_defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Clang): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
