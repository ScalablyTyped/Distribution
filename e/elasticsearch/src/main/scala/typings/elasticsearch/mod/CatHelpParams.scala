package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHelpParams
  extends StObject
     with GenericParams {
  
  var help: js.UndefOr[Boolean] = js.undefined
}
object CatHelpParams {
  
  @scala.inline
  def apply(): CatHelpParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatHelpParams]
  }
  
  @scala.inline
  implicit class CatHelpParamsMutableBuilder[Self <: CatHelpParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
  }
}
