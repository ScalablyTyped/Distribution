package typings.eggErrors

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.eggErrors.anon.TypeofBaseError
import typings.std.ConstructorParameters
import typings.std.Error
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseMod {
  
  @JSImport("egg-errors/lib/base", JSImport.Default)
  @js.native
  open class default[T /* <: typings.eggErrors.libErrorOptionsMod.default */] ()
    extends StObject
       with BaseError[T] {
    def this(options: T) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  object default {
    
    @JSImport("egg-errors/lib/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def from[S /* <: Instantiable1[
        /* args */ Any, 
        InstanceType[
          TypeofBaseError & (Instantiable1[
            /* options */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
            BaseError[typings.eggErrors.libErrorOptionsMod.default]
          ])
        ]
      ] */, P /* <: ConstructorParameters[S] */](
      err: js.Error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type P | Array<undefined> is not an array type */ args: P
    ): InstanceType[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(err.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[InstanceType[S]]
    inline def from[S /* <: Instantiable1[
        /* args */ Any, 
        InstanceType[
          TypeofBaseError & (Instantiable1[
            /* options */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
            BaseError[typings.eggErrors.libErrorOptionsMod.default]
          ])
        ]
      ] */, P /* <: ConstructorParameters[S] */](
      err: js.Error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type P | Array<undefined> is not an array type */ args: js.Array[Unit]
    ): InstanceType[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(err.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[InstanceType[S]]
    
    /* static member */
    inline def getType(err: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait BaseError[T /* <: typings.eggErrors.libErrorOptionsMod.default */]
    extends StObject
       with Error
       with /* key */ StringDictionary[Any] {
    
    var code: String
    
    /* protected */ var options: js.UndefOr[T] = js.undefined
  }
  object BaseError {
    
    inline def apply[T /* <: typings.eggErrors.libErrorOptionsMod.default */](code: String, message: String, name: String): BaseError[T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseError[T]]
    }
    
    extension [Self <: BaseError[?], T /* <: typings.eggErrors.libErrorOptionsMod.default */](x: Self & BaseError[T]) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
