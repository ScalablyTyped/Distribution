package typings.emberTest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerAsyncHelper(
    name: String,
    helperMethod: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Application */ /* app */ Any, 
      /* repeated */ Any, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAsyncHelper")(name.asInstanceOf[js.Any], helperMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerHelper(
    name: String,
    helperMethod: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Application */ /* app */ Any, 
      /* repeated */ Any, 
      Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any], helperMethod.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def registerHelper(
    name: String,
    helperMethod: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Application */ /* app */ Any, 
      /* repeated */ Any, 
      Any
    ],
    options: js.Object
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any], helperMethod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def registerWaiter(callback: js.Function0[Boolean]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("registerWaiter")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def registerWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWaiter")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unregisterHelper(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterHelper")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterWaiter(callback: js.Function0[Boolean]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterWaiter")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def unregisterWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterWaiter")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
}
