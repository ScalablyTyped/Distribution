package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filterable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F]
     with fpDashTsLib.libCompactableMod.Compactable3[F] {
  /* InferMemberOverrides */
  override val URI: F
  def filter[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def filterMap[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
  def partition[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]]
  def partitionMap[RL, RR, U, L, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]]
}

object Filterable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    compact: fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    filter: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    filterMap: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    partition: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    partitionMap: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    separate: fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Filterable3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Filterable3[F]]
  }
}

