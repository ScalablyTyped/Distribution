package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition22[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libCompactableMod.CompactableComposition22[F, G] {
  def filter[LF, LG, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    p: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
  def filterMap[LF, LG, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, B]]
  def partition[LF, LG, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    p: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]], 
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
  ]
  def partitionMap[LF, LG, RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, RL]], 
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, RR]]
  ]
}

object FilterableComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type2[
        F, 
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[G, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type2[
        F, 
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[G, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
      ]
    ]
  ): FilterableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(compact = compact, filter = filter, filterMap = filterMap, map = map, partition = partition, partitionMap = partitionMap, separate = separate)
  
    __obj.asInstanceOf[FilterableComposition22[F, G]]
  }
}

