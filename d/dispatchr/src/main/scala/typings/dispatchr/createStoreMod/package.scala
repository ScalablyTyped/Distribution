package typings.dispatchr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createStoreMod {
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: typings.dispatchr.createStoreMod.StoreOptions */] = (typings.dispatchr.createStoreMod.Omit[
    T, 
    typings.dispatchr.dispatchrStrings.statics | typings.dispatchr.dispatchrStrings.storeName | typings.dispatchr.dispatchrStrings.handlers | typings.dispatchr.dispatchrStrings.mixins
  ]) with typings.dispatchr.mod.Store[js.Object]
}
