package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effective extends StObject {
  
  var effective: js.UndefOr[js.Array[String]] = js.undefined
}
object Effective {
  
  @scala.inline
  def apply(): Effective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effective]
  }
  
  @scala.inline
  implicit class EffectiveMutableBuilder[Self <: Effective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffective(value: js.Array[String]): Self = StObject.set(x, "effective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveUndefined: Self = StObject.set(x, "effective", js.undefined)
    
    @scala.inline
    def setEffectiveVarargs(value: String*): Self = StObject.set(x, "effective", js.Array(value :_*))
  }
}
