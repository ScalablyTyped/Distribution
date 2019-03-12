package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Apply", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyFirst[F](F: Apply[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Apply1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Apply2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Apply3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Apply2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def applySecond[F](F: Apply[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Apply1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Apply2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Apply3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Apply2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: Apply1[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type[F, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: Apply2[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type2[F, _, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: Apply3[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type3[F, _, _, A]]] = js.native
  def getSemigroup[F, A](F: Apply[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.HKT[F, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L, A](F: Apply2C[F, L], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type2[F, L, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](F: Apply3C[F, U, L], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type3[F, U, L, A]]] = js.native
  def liftA2[F](F: Apply[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    fpDashTsLib.libFunctionMod.Curried2[
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Apply1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    fpDashTsLib.libFunctionMod.Curried2[
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Apply2[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
        fpDashTsLib.libHKTMod.Type2[F, _, _]
      ]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Apply3[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
        fpDashTsLib.libHKTMod.Type3[F, _, _, _]
      ]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Apply2C[F, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
        fpDashTsLib.libHKTMod.Type2[F, L, _]
      ]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3C[F, U, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, _]
      ]
    ]
  ] = js.native
  def liftA3[F](F: Apply[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried3[
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Apply1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried3[
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Apply2[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
          fpDashTsLib.libHKTMod.Type2[F, _, _]
        ]
      ]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Apply3[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
          fpDashTsLib.libHKTMod.Type3[F, _, _, _]
        ]
      ]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Apply2C[F, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
          fpDashTsLib.libHKTMod.Type2[F, L, _]
        ]
      ]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3C[F, U, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
          fpDashTsLib.libHKTMod.Type3[F, U, L, _]
        ]
      ]
    ]
  ] = js.native
  def liftA4[F](F: Apply[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried4[
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Apply1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried4[
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Apply2[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
          js.Function1[
            /* fd */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
            fpDashTsLib.libHKTMod.Type2[F, _, _]
          ]
        ]
      ]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Apply3[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
          js.Function1[
            /* fd */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
            fpDashTsLib.libHKTMod.Type3[F, _, _, _]
          ]
        ]
      ]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Apply2C[F, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
          js.Function1[
            /* fd */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
            fpDashTsLib.libHKTMod.Type2[F, L, _]
          ]
        ]
      ]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3C[F, U, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
        js.Function1[
          /* fc */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
          js.Function1[
            /* fd */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
            fpDashTsLib.libHKTMod.Type3[F, U, L, _]
          ]
        ]
      ]
    ]
  ] = js.native
  def sequenceT[F](F: Apply[F]): SequenceT[F] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Apply1[F]): SequenceT1[F] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Apply2[F]): SequenceT2[F] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Apply2C[F, L]): SequenceT2C[F, L] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3[F]): SequenceT3[F] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Apply3C[F, U, L]): SequenceT3C[F, U, L] = js.native
}

