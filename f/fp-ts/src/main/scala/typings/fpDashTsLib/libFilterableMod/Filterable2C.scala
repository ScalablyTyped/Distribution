package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filterable2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L]
     with fpDashTsLib.libCompactableMod.Compactable2C[F, L] {
  /* InferMemberOverrides */
  override val URI: F
  /* InferMemberOverrides */
  override val _L: L
  def filter[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
  def partition[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]]
}

object Filterable2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ]
  ): Filterable2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], compact = compact, filter = filter, filterMap = filterMap, map = map, partition = partition, partitionMap = partitionMap, separate = separate)
  
    __obj.asInstanceOf[Filterable2C[F, L]]
  }
}

