package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Overview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOverview extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Overview = js.native
}
object TypeofOverview {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Overview): TypeofOverview = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOverview]
  }
  
  @scala.inline
  implicit class TypeofOverviewMutableBuilder[Self <: TypeofOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Overview): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
