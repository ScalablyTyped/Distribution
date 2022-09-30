package typings.glaze

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalesMod {
  
  @JSImport("glaze/dist-types/scales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modularScale(ratio: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in type-fest.type-fest/source/value-of.ValueOf<[-1, -0.5, 0, 1, 2, 3, 4, 5, 6], number> ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(ratio.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in type-fest.type-fest/source/value-of.ValueOf<[-1, -0.5, 0, 1, 2, 3, 4, 5, 6], number> ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[Any]]
  inline def modularScale[T /* <: Double */](ratio: Double, steps: js.Array[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(ratio.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[Any]]
  
  inline def symmetricScale[T /* <: String | Double */](
    nonNegativeTokens: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T ]: string | number}
    */ typings.glaze.glazeStrings.symmetricScale & TopLevel[Any]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T | glaze.glaze/dist-types/scales.Negate<std.Extract<T, number>> | T extends '1px'? '-1px' : never ]: string | number}
    */ typings.glaze.glazeStrings.symmetricScale & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("symmetricScale")(nonNegativeTokens.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T | glaze.glaze/dist-types/scales.Negate<std.Extract<T, number>> | T extends '1px'? '-1px' : never ]: string | number}
    */ typings.glaze.glazeStrings.symmetricScale & TopLevel[Any]]
  
  type Negate[T /* <: Double */] = Double & (/* import warning: importer.ImportType#apply Failed type conversion: [0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50, -51, -52, -53, -54, -55, -56, -57, -58, -59, -60, -61, -62, -63, -64][T] */ js.Any)
}
