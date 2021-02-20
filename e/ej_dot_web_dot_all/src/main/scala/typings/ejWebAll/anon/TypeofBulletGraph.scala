package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.BulletGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBulletGraph extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: BulletGraph = js.native
}
object TypeofBulletGraph {
  
  @scala.inline
  def apply(Locale: js.Any, fn: BulletGraph): TypeofBulletGraph = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBulletGraph]
  }
  
  @scala.inline
  implicit class TypeofBulletGraphMutableBuilder[Self <: TypeofBulletGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: BulletGraph): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
