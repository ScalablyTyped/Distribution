package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libCompactableMod.CompactableComposition11[F, G] {
  def filter[A](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    p: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]]
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, B]]
  def partition[A](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    p: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]]
  ]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, RL]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, RR]]
  ]
}

object FilterableComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
      ]
    ]
  ): FilterableComposition11[F, G] = {
    val __obj = js.Dynamic.literal(compact = compact, filter = filter, filterMap = filterMap, map = map, partition = partition, partitionMap = partitionMap, separate = separate)
  
    __obj.asInstanceOf[FilterableComposition11[F, G]]
  }
}

