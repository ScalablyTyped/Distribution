package typings.firebaseUtil

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objMod {
  
  @JSImport("@firebase/util/dist/src/obj", "contains")
  @js.native
  def contains[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/src/obj", "isEmpty")
  @js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  
  @JSImport("@firebase/util/dist/src/obj", "map")
  @js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any], 
      U
    ]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any] = js.native
  @JSImport("@firebase/util/dist/src/obj", "map")
  @js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any], 
      U
    ],
    contextObj: js.Any
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any] = js.native
  
  @JSImport("@firebase/util/dist/src/obj", "safeGet")
  @js.native
  def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}
