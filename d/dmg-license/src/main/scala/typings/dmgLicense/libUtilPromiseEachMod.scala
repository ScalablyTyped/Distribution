package typings.dmgLicense

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPromiseEachMod {
  
  @JSImport("dmg-license/lib/util/PromiseEach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Same as `Promise.all`, except:
    *
    * 1. The returned `Promise` resolves or rejects only after *all* of the provided `Promise`s resolve or reject.
    * 2. If more than one of the provided `Promise`s reject, the returned promise rejects with a `MultiError` containing *all* of the rejection reasons.
    *
    * @param ctor - Which `Promise` implementation to use. Defaults to the native implementation.
    */
  inline def default[Ps /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tuple<PromiseLike<any> | any> */ Any */](promises: Ps): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Ps ]: Ps[K] extends std.PromiseLike<infer T>? T : Ps[K]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promises.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Ps ]: Ps[K] extends std.PromiseLike<infer T>? T : Ps[K]} */ js.Any
  ]]
  inline def default[Ps /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tuple<PromiseLike<any> | any> */ Any */](promises: Ps, ctor: PromiseConstructor): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Ps ]: Ps[K] extends std.PromiseLike<infer T>? T : Ps[K]} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promises.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Ps ]: Ps[K] extends std.PromiseLike<infer T>? T : Ps[K]} */ js.Any
  ]]
}
