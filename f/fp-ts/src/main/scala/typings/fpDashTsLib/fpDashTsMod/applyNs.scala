package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "apply")
@js.native
object applyNs extends js.Object {
  def applyFirst[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def applyFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def applySecond[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def applySecond[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libApplyMod.Apply1[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type[F, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libApplyMod.Apply2[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type2[F, _, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libApplyMod.Apply3[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type3[F, _, _, A]]] = js.native
  def getSemigroup[F, A](F: fpDashTsLib.libApplyMod.Apply[F], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.HKT[F, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L, A](F: fpDashTsLib.libApplyMod.Apply2C[F, L], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type2[F, L, A]]] = js.native
  def getSemigroup[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L], S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libHKTMod.Type3[F, U, L, A]]] = js.native
  def liftA2[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    fpDashTsLib.libFunctionMod.Curried2[
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    fpDashTsLib.libFunctionMod.Curried2[
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
        fpDashTsLib.libHKTMod.Type2[F, _, _]
      ]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
        fpDashTsLib.libHKTMod.Type3[F, _, _, _]
      ]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
        fpDashTsLib.libHKTMod.Type2[F, L, _]
      ]
    ]
  ] = js.native
  def liftA2[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[_, _, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      js.Function1[
        /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, _]
      ]
    ]
  ] = js.native
  def liftA3[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried3[
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried3[_, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried3[
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function1[
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
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function1[
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
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function1[
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
  def liftA3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function1[
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
  def liftA4[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried4[
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried4[_, _, _, _, _], 
    fpDashTsLib.libFunctionMod.Curried4[
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function1[
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
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function1[
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
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function1[
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
  def liftA4[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function1[
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
  def sequenceS[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function1[
    /* r */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequenceS[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function1[
    /* r */ fpDashTsLib.libApplyMod.EnforceNonEmptyRecord[stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type[F, _]]], 
    fpDashTsLib.libHKTMod.Type[
      F, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, fp-ts.fp-ts/lib/HKT.Type<F, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceS with js.Any
    ]
  ] = js.native
  def sequenceS[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function1[
    /* r */ (fpDashTsLib.libApplyMod.EnforceNonEmptyRecord[stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, _, _]]]) with (stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, _, _]]), 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      _, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, fp-ts.fp-ts/lib/HKT.Type2<F, any, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceS with js.Any
    ]
  ] = js.native
  def sequenceS[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function1[
    /* r */ (fpDashTsLib.libApplyMod.EnforceNonEmptyRecord[stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]]) with (stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]), 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      _, 
      _, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, fp-ts.fp-ts/lib/HKT.Type3<F, any, any, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceS with js.Any
    ]
  ] = js.native
  def sequenceS[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function1[
    /* r */ fpDashTsLib.libApplyMod.EnforceNonEmptyRecord[stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, L, _]]], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      L, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, fp-ts.fp-ts/lib/HKT.Type2<F, L, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceS with js.Any
    ]
  ] = js.native
  def sequenceS[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function1[
    /* r */ fpDashTsLib.libApplyMod.EnforceNonEmptyRecord[stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, U, L, _]]], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      U, 
      L, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, fp-ts.fp-ts/lib/HKT.Type3<F, U, L, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceS with js.Any
    ]
  ] = js.native
  def sequenceT[F](F: fpDashTsLib.libApplyMod.Apply[F]): js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.HKT[F, _]]) with fpDashTsLib.Anon_0AnyFHKT[F], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.HKT<F, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceT with js.Any
    ]
  ] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplyMod.Apply1[F]): js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Type[F, _]]) with fpDashTsLib.Anon_0AnyF[F], 
    fpDashTsLib.libHKTMod.Type[
      F, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Type<F, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceT with js.Any
    ]
  ] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplyMod.Apply2[F]): js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Type2[F, _, _]]) with (fpDashTsLib.Anon_0Any[F, _]), 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      _, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Type2<F, any, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceT with js.Any
    ]
  ] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplyMod.Apply3[F]): js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Type3[F, _, _, _]]) with (fpDashTsLib.Anon_0[F, _, _]), 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      _, 
      _, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Type3<F, any, any, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceT with js.Any
    ]
  ] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplyMod.Apply2C[F, L]): js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Type2[F, L, _]]) with (fpDashTsLib.Anon_0Any[F, L]), 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      L, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Type2<F, L, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceT with js.Any
    ]
  ] = js.native
  def sequenceT[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplyMod.Apply3C[F, U, L]): js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Type3[F, U, L, _]]) with (fpDashTsLib.Anon_0[F, U, L]), 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      U, 
      L, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Type3<F, U, L, any>> ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.sequenceT with js.Any
    ]
  ] = js.native
}

