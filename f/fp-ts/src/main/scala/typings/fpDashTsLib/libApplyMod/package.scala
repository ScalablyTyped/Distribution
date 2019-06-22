package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApplyMod {
  type EnforceNonEmptyRecord[R] = R
  type SequenceT[F] = js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.HKT[F, _]]) with fpDashTsLib.Anon_0AnyFHKT_254506368[F], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.HKT<F, any>> ]: [fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.HKT<F, any>>[K]] extends [fp-ts.fp-ts/lib/HKT.HKT<F, infer A>]? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.SequenceT with (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.HKT[F, js.Any]])
    ]
  ]
  type SequenceT1[F /* <: fpDashTsLib.libHKTMod.URIS */] = js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind[F, _]]) with fpDashTsLib.Anon_0AnyFKind[F], 
    fpDashTsLib.libHKTMod.Kind[
      F, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind<F, any>> ]: [fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind<F, any>>[K]] extends [fp-ts.fp-ts/lib/HKT.Kind<F, infer A>]? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.SequenceT1 with (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind[F, js.Any]])
    ]
  ]
  type SequenceT2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] = js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind2[F, _, _]]) with (fpDashTsLib.Anon_0AnyFKind2[F, _]), 
    fpDashTsLib.libHKTMod.Kind2[
      F, 
      js.Any, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind2<F, any, any>> ]: [fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind2<F, any, any>>[K]] extends [fp-ts.fp-ts/lib/HKT.Kind2<F, any, infer A>]? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.SequenceT2 with (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]])
    ]
  ]
  type SequenceT2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] = js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind2[F, L, _]]) with (fpDashTsLib.Anon_0AnyFKind2[F, L]), 
    fpDashTsLib.libHKTMod.Kind2[
      F, 
      L, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind2<F, L, any>> ]: [fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind2<F, L, any>>[K]] extends [fp-ts.fp-ts/lib/HKT.Kind2<F, L, infer A>]? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.SequenceT2C with (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]])
    ]
  ]
  type SequenceT3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] = js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind3[F, _, _, _]]) with (fpDashTsLib.Anon_0AnyFKind3[F, _, _]), 
    fpDashTsLib.libHKTMod.Kind3[
      F, 
      js.Any, 
      js.Any, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind3<F, any, any, any>> ]: [fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind3<F, any, any, any>>[K]] extends [fp-ts.fp-ts/lib/HKT.Kind3<F, any, any, infer A>]? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.SequenceT3 with (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]])
    ]
  ]
  type SequenceT3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] = js.Function1[
    /* t */ (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind3[F, U, L, _]]) with (fpDashTsLib.Anon_0AnyFKind3[F, U, L]), 
    fpDashTsLib.libHKTMod.Kind3[
      F, 
      U, 
      L, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind3<F, U, L, any>> ]: [fp-ts.fp-ts/lib/Array.Global.Array<fp-ts.fp-ts/lib/HKT.Kind3<F, U, L, any>>[K]] extends [fp-ts.fp-ts/lib/HKT.Kind3<F, U, L, infer A>]? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.SequenceT3C with (fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]])
    ]
  ]
}
