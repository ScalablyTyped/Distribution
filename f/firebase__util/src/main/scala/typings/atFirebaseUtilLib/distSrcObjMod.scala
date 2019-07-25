package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/obj", JSImport.Namespace)
@js.native
object distSrcObjMod extends js.Object {
  def contains[T /* <: js.Object */](obj: T, key: java.lang.String): scala.Boolean = js.native
  def isEmpty(obj: js.Object): scala.Boolean = js.native
  def map[K /* <: java.lang.String */, V, U](
    obj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any, 
      U
    ]
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any = js.native
  def map[K /* <: java.lang.String */, V, U](
    obj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any, 
      U
    ],
    contextObj: js.Any
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any = js.native
  def safeGet[T /* <: js.Object */, K /* <: java.lang.String */](obj: T, key: K): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
}

