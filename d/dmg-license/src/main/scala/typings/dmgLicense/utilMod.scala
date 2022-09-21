package typings.dmgLicense

import org.scalablytyped.runtime.TopLevel
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.PathLike
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("dmg-license/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayify[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def mapObjByKeys[K /* <: PropertyKey */, T, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any],
    keys: js.Array[K],
    fun: js.Function2[/* value */ T, /* key */ K, U]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapObjByKeys")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any]]
  inline def mapObjByKeys[K /* <: PropertyKey */, T, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any],
    keys: js.Array[K],
    fun: js.Function2[/* value */ T, /* key */ K, U],
    target: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapObjByKeys")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.dmgLicense.dmgLicenseStrings.mapObjByKeys & TopLevel[Any]]
  
  inline def readFileP(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileP")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def unarrayify[T](v: js.Array[T]): T | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof v */ Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("unarrayify")(v.asInstanceOf[js.Any]).asInstanceOf[T | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof v */ Any)]
}
