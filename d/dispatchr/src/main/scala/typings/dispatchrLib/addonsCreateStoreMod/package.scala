package typings
package dispatchrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object addonsCreateStoreMod {
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: dispatchr.Anon_X<T, K>[keyof T] */ js.Any
  ]
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: StoreOptions */] = (Omit[
    T, 
    dispatchrLib.dispatchrLibStrings.statics | dispatchrLib.dispatchrLibStrings.storeName | dispatchrLib.dispatchrLibStrings.handlers | dispatchrLib.dispatchrLibStrings.mixins
  ]) with dispatchrLib.dispatchrMod.Store[js.Object]
}
