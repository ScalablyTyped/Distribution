package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.typesMod.DeepRequired
import typings.expoConfigureSplashScreen.typesMod.IsNever
import typings.expoConfigureSplashScreen.typesMod.JsonShape
import typings.expoConfigureSplashScreen.typesMod.NonPrimitiveAndNonArrayKeys
import typings.expoConfigureSplashScreen.typesMod.OptionalPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromJsonValidatorMod {
  
  @JSImport("@expo/configure-splash-screen/build/validators/FromJsonValidator", JSImport.Default)
  @js.native
  class default[From /* <: JsonShape[To] */, To /* <: js.Object */] ()
    extends StObject
       with FromJsonValidator[From, To]
  
  @js.native
  trait FromJsonValidator[From /* <: JsonShape[To] */, To /* <: js.Object */] extends StObject {
    
    /**
      * Add rule that determined what property is copied from JSON object into actual validated object.
      * @param name an array describing property path (just like in lodash.get function)
      * @param validatingFunction optional parameter that is responsible for actual type conversion and semantic checking (e.g. check is given string is actually a path or a valid color). Not providing it results in copying over value without any semantic checking.
      */
    def addRule[TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[To]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any
      ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
      ] */](name: js.Array[TK1]): this.type = js.native
    def addRule[TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[To]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any
      ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
      ] */](
      name: js.Array[TK1],
      validatingFunction: js.Function2[
          /* value */ IsNever[
            TK3, 
            IsNever[
              TK2, 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1][TK2] */ js.Any
            ], 
            /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1][TK2][TK3] */ js.Any
          ], 
          /* config */ To, 
          OptionalPromise[
            IsNever[
              TK3, 
              IsNever[
                TK2, 
                /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
              ], 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2][TK3] */ js.Any
            ]
          ]
        ]
    ): this.type = js.native
    def addRule[TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[To]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any
      ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
      ] */](name: js.Tuple2[TK1, TK2]): this.type = js.native
    def addRule[TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[To]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any
      ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
      ] */](
      name: js.Tuple2[TK1, TK2],
      validatingFunction: js.Function2[
          /* value */ IsNever[
            TK3, 
            IsNever[
              TK2, 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1][TK2] */ js.Any
            ], 
            /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1][TK2][TK3] */ js.Any
          ], 
          /* config */ To, 
          OptionalPromise[
            IsNever[
              TK3, 
              IsNever[
                TK2, 
                /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
              ], 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2][TK3] */ js.Any
            ]
          ]
        ]
    ): this.type = js.native
    def addRule[TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[To]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any
      ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
      ] */](name: js.Tuple3[TK1, TK2, TK3]): this.type = js.native
    def addRule[TK1 /* <: NonPrimitiveAndNonArrayKeys[DeepRequired[To]] */, TK2 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any
      ] */, TK3 /* <: NonPrimitiveAndNonArrayKeys[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
      ] */](
      name: js.Tuple3[TK1, TK2, TK3],
      validatingFunction: js.Function2[
          /* value */ IsNever[
            TK3, 
            IsNever[
              TK2, 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1][TK2] */ js.Any
            ], 
            /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<From>[TK1][TK2][TK3] */ js.Any
          ], 
          /* config */ To, 
          OptionalPromise[
            IsNever[
              TK3, 
              IsNever[
                TK2, 
                /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1] */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2] */ js.Any
              ], 
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<To>[TK1][TK2][TK3] */ js.Any
            ]
          ]
        ]
    ): this.type = js.native
    
    /* private */ var formatErrors: js.Any = js.native
    
    /**
      *  Records:
      * - keys are stringified array paths to the properties
      * - values are functions accepting
      */
    /* private */ var rules: js.Any = js.native
    
    def validate(jsonConfig: From): js.Promise[To] = js.native
  }
}
