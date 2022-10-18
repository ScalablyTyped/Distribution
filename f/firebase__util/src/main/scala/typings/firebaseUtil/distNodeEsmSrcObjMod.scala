package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcObjMod {
  
  @JSImport("@firebase/util/dist/node-esm/src/obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepEqual(a: js.Object, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ /* obj */ js.Any, 
      U
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any]
  inline def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ /* obj */ js.Any, 
      U
    ],
    contextObj: Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], contextObj.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any]
  
  inline def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGet")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
}
