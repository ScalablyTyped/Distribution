package typings.expressValidator.anon

import typings.expressValidator.contextMod.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nullable extends Optional {
  
  var checkFalsy: Boolean = js.native
  
  var nullable: Boolean = js.native
}
object Nullable {
  
  @scala.inline
  def apply(checkFalsy: Boolean, nullable: Boolean): Nullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nullable]
  }
  
  @scala.inline
  implicit class NullableMutableBuilder[Self <: Nullable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
  }
}
