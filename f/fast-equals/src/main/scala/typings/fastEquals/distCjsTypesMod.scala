package typings.fastEquals

import typings.fastEquals.distCjsTypesInternalTypesMod.CustomEqualCreatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTypesMod {
  
  @JSImport("fast-equals/dist/cjs/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circularDeepEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circularDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def circularShallowEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circularShallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createCustomEqual[Meta](): js.Function2[/* a */ Any, /* b */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomEqual")().asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Boolean]]
  inline def createCustomEqual[Meta](options: CustomEqualCreatorOptions[Meta]): js.Function2[/* a */ Any, /* b */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomEqual")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Boolean]]
  
  inline def deepEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sameValueZeroEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameValueZeroEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shallowEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def strictCircularDeepEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictCircularDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def strictCircularShallowEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictCircularShallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def strictDeepEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def strictShallowEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictShallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
