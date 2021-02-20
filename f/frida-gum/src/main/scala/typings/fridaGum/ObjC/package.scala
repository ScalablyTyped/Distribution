package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ObjC {
  
  type BlockImplementation = js.ThisFunction1[/* this */ typings.fridaGum.ObjC.Block, /* repeated */ js.Any, js.Any]
  
  type ChooseSpecifier = typings.fridaGum.ObjC.SimpleChooseSpecifier | typings.fridaGum.ObjC.DetailedChooseSpecifier
  
  type EnumerateLoadedClassesResult = /**
    * Class names grouped by name of owner module.
    */
  org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  /**
    * User-defined data that can be accessed from method implementations.
    */
  type InstanceData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ObjectMethods = org.scalablytyped.runtime.StringDictionary[typings.fridaGum.ObjC.ObjectMethod]
  
  type ProtocolPropertyAttributes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type SimpleChooseSpecifier = typings.fridaGum.ObjC.Object
  
  type UserMethodImplementation[D, T, S] = js.ThisFunction1[
    /* this */ typings.fridaGum.ObjC.UserMethodInvocation[D, T, S], 
    /* repeated */ js.Any, 
    js.Any
  ]
}
