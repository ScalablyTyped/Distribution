package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ordering on a field, in some Direction. Direction defaults to ASCENDING.
  */
trait OrderBy_ extends StObject {
  
  val dir: Direction
  
  val field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
}
object OrderBy_ {
  
  inline def apply(
    dir: Direction,
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
  ): OrderBy_ = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy_]
  }
  
  extension [Self <: OrderBy_](x: Self) {
    
    inline def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setField(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
    ): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
