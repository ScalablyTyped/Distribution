package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es6HKTMod {
  type Kind[URI /* <: URIS */, A] = /* import warning: ImportType.apply Failed type conversion: fp-ts.fp-ts/es6/HKT.URItoKind<A>[URI] */ js.Any
  type Kind2[URI /* <: URIS2 */, L, A] = /* import warning: ImportType.apply Failed type conversion: fp-ts.fp-ts/es6/HKT.URItoKind2<L, A>[URI] */ js.Any
  type Kind3[URI /* <: URIS3 */, U, L, A] = /* import warning: ImportType.apply Failed type conversion: fp-ts.fp-ts/es6/HKT.URItoKind3<U, L, A>[URI] */ js.Any
  type Kind4[URI /* <: URIS4 */, X, U, L, A] = /* import warning: ImportType.apply Failed type conversion: fp-ts.fp-ts/es6/HKT.URItoKind4<X, U, L, A>[URI] */ js.Any
  type Type[URI /* <: URIS */, A] = Kind[URI, A]
  type Type2[URI /* <: URIS2 */, L, A] = Kind2[URI, L, A]
  type Type3[URI /* <: URIS3 */, U, L, A] = Kind3[URI, U, L, A]
  type Type4[URI /* <: URIS4 */, X, U, L, A] = Kind4[URI, X, U, L, A]
  type URIS = java.lang.String
  type URIS2 = java.lang.String
  type URIS3 = java.lang.String
  type URIS4 = java.lang.String
  type URItoKind4[X, U, L, A] = URI2HKT4[X, U, L, A]
}
