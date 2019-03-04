package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filterable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F]
     with fpDashTsLib.libCompactableMod.Compactable2[F] {
  /* InferMemberOverrides */
  override val URI: F
  def filter[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def filterMap[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
  def partition[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]]
  def partitionMap[RL, RR, L, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]]
}

object Filterable2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ]
  ): Filterable2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = compact, filter = filter, filterMap = filterMap, map = map, partition = partition, partitionMap = partitionMap, separate = separate)
  
    __obj.asInstanceOf[Filterable2[F]]
  }
}

