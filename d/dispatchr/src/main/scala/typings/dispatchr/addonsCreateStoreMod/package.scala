package typings.dispatchr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object addonsCreateStoreMod {
  import typings.dispatchr.dispatchrMod.Store
  import typings.dispatchr.dispatchrStrings.handlers
  import typings.dispatchr.dispatchrStrings.mixins
  import typings.dispatchr.dispatchrStrings.statics
  import typings.dispatchr.dispatchrStrings.storeName
  import typings.std.Pick

  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: StoreOptions */] = (Omit[T, statics | storeName | handlers | mixins]) with Store[js.Object]
}
