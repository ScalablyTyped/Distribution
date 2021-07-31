package typings.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure/Utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundler")(services.asInstanceOf[js.Any]).asInstanceOf[Bundle[T, P]]
  
  @js.native
  trait Bundle[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */]
    extends StObject
       with Instantiable0[Mapper[T, P]]
       with Instantiable1[/* options */ js.Any, Mapper[T, P]]
  
  @js.native
  trait Constructor
    extends StObject
       with Instantiable1[/* args */ js.Any, js.Any]
  
  type Mapper[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in P ]: std.InstanceType<T[name]>}
    */ typings.gitlab.gitlabStrings.Mapper & TopLevel[T]
}
