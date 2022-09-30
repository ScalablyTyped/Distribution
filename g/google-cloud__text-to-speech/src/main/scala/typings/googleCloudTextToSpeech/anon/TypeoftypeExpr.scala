package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.fallback.IamProtos.google.`type`.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftypeExpr extends StObject {
  
  /** Represents an Expr. */
  var Expr: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.`type`.Expr] & TypeofExpr
}
object TypeoftypeExpr {
  
  inline def apply(Expr: Instantiable0[Expr] & TypeofExpr): TypeoftypeExpr = {
    val __obj = js.Dynamic.literal(Expr = Expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftypeExpr]
  }
  
  extension [Self <: TypeoftypeExpr](x: Self) {
    
    inline def setExpr(value: Instantiable0[Expr] & TypeofExpr): Self = StObject.set(x, "Expr", value.asInstanceOf[js.Any])
  }
}
