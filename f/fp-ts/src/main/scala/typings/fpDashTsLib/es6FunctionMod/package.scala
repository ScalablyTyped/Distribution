package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es6FunctionMod {
  type BinaryOperation[A, B] = js.Function2[/* a1 */ A, /* a2 */ A, B]
  type Cokleisli[F, A, B] = js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], B]
  type Curried2[A, B, C] = js.Function1[/* a */ A, js.Function1[/* b */ B, C]]
  type Curried3[A, B, C, D] = js.Function1[/* a */ A, js.Function1[/* b */ B, js.Function1[/* c */ C, D]]]
  type Curried4[A, B, C, D, E] = js.Function1[
    /* a */ A, 
    js.Function1[/* b */ B, js.Function1[/* c */ C, js.Function1[/* d */ D, E]]]
  ]
  type Curried5[A, B, C, D, E, F] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[/* c */ C, js.Function1[/* d */ D, js.Function1[/* e */ E, F]]]
    ]
  ]
  type Curried6[A, B, C, D, E, F, G] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[
        /* c */ C, 
        js.Function1[/* d */ D, js.Function1[/* e */ E, js.Function1[/* f */ F, G]]]
      ]
    ]
  ]
  type Curried7[A, B, C, D, E, F, G, H] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[
        /* c */ C, 
        js.Function1[
          /* d */ D, 
          js.Function1[/* e */ E, js.Function1[/* f */ F, js.Function1[/* g */ G, H]]]
        ]
      ]
    ]
  ]
  type Curried8[A, B, C, D, E, F, G, H, I] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[
        /* c */ C, 
        js.Function1[
          /* d */ D, 
          js.Function1[
            /* e */ E, 
            js.Function1[/* f */ F, js.Function1[/* g */ G, js.Function1[/* h */ H, I]]]
          ]
        ]
      ]
    ]
  ]
  type Curried9[A, B, C, D, E, F, G, H, I, J] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[
        /* c */ C, 
        js.Function1[
          /* d */ D, 
          js.Function1[
            /* e */ E, 
            js.Function1[
              /* f */ F, 
              js.Function1[/* g */ G, js.Function1[/* h */ H, js.Function1[/* i */ I, J]]]
            ]
          ]
        ]
      ]
    ]
  ]
  type Endomorphism[A] = js.Function1[/* a */ A, A]
  type Function1[A, B] = js.Function1[/* a */ A, B]
  type Function2[A, B, C] = js.Function2[/* a */ A, /* b */ B, C]
  type Function3[A, B, C, D] = js.Function3[/* a */ A, /* b */ B, /* c */ C, D]
  type Function4[A, B, C, D, E] = js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]
  type Function5[A, B, C, D, E, F] = js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]
  type Function6[A, B, C, D, E, F, G] = js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]
  type Function7[A, B, C, D, E, F, G, H] = js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, H]
  type Function8[A, B, C, D, E, F, G, H, I] = js.Function8[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, /* h */ H, I]
  type Function9[A, B, C, D, E, F, G, H, I, J] = js.Function9[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    /* f */ F, 
    /* g */ G, 
    /* h */ H, 
    /* i */ I, 
    J
  ]
  type FunctionN[A /* <: fpDashTsLib.libArrayMod.Global.Array[_] */, B] = js.Function1[/* args */ A, B]
  type Kleisli[F, A, B] = js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, B]]
  type Lazy[A] = js.Function0[A]
  type Predicate[A] = js.Function1[/* a */ A, scala.Boolean]
  type Refinement[A, B /* <: A */] = js.Function1[/* a */ A, /* is B */ scala.Boolean]
}
