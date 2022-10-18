package typings.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreInfrastructureUtilsMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure/Utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundler")(services.asInstanceOf[js.Any]).asInstanceOf[Bundle[T, P]]
  
  @js.native
  trait Bundle[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */]
    extends StObject
       with Instantiable0[Mapper[T, P]]
       with Instantiable1[/* options */ Any, Mapper[T, P]]
  
  @js.native
  trait Constructor
    extends StObject
       with Instantiable1[/* args */ Any, Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ name in P ]: std.InstanceType<T[name]>}
    }}}
    */
  @js.native
  trait Mapper[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */] extends StObject
}
