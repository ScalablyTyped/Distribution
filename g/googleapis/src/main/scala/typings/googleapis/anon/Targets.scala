package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targets extends StObject {
  
  var source: js.UndefOr[String] = js.undefined
  
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}
object Targets {
  
  inline def apply(): Targets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Targets]
  }
  
  extension [Self <: Targets](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
