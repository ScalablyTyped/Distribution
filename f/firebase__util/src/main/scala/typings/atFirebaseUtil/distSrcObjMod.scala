package typings.atFirebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/obj", JSImport.Namespace)
@js.native
object distSrcObjMod extends js.Object {
  def contains[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.atFirebaseUtil.atFirebaseUtilStrings.map with js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.atFirebaseUtil.atFirebaseUtilStrings.map with js.Any, 
      U
    ]
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.atFirebaseUtil.atFirebaseUtilStrings.map with js.Any = js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.atFirebaseUtil.atFirebaseUtilStrings.map with js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.atFirebaseUtil.atFirebaseUtilStrings.map with js.Any, 
      U
    ],
    contextObj: js.Any
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.atFirebaseUtil.atFirebaseUtilStrings.map with js.Any = js.native
  def safeGet[T /* <: js.Object */, K /* <: String */](obj: T, key: K): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
}

