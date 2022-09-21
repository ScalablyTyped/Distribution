package typings.eggErrors

import org.scalablytyped.runtime.Instantiable1
import typings.std.ConstructorParameters
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofBaseError extends StObject {
    
    /* static member */
    def from[S /* <: Instantiable1[
        /* args */ Any, 
        InstanceType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BaseError */ js.Any
        ]
      ] */, P /* <: ConstructorParameters[S] */](
      err: js.Error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type P | Array<undefined> is not an array type */ args: P
    ): InstanceType[S] = js.native
    def from[S /* <: Instantiable1[
        /* args */ Any, 
        InstanceType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BaseError */ js.Any
        ]
      ] */, P /* <: ConstructorParameters[S] */](
      err: js.Error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type P | Array<undefined> is not an array type */ args: js.Array[Unit]
    ): InstanceType[S] = js.native
    
    /* static member */
    def getType(err: js.Error): String = js.native
  }
}
