package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void} */ trait RuleListener
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        (js.Function2[/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node, scala.Unit]) | (js.Function2[/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node, scala.Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ estreeLib.estreeMod.Node, 
          scala.Unit
        ]) | (js.Function1[/* node */ estreeLib.estreeMod.Node, scala.Unit])
      ]
    ] {
  var onCodePathEnd: js.UndefOr[
    js.Function2[/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node, scala.Unit]
  ] = js.undefined
  var onCodePathSegmentEnd: js.UndefOr[
    js.Function2[/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node, scala.Unit]
  ] = js.undefined
  var onCodePathSegmentLoop: js.UndefOr[
    js.Function3[
      /* fromSegment */ CodePathSegment, 
      /* toSegment */ CodePathSegment, 
      /* node */ estreeLib.estreeMod.Node, 
      scala.Unit
    ]
  ] = js.undefined
  var onCodePathSegmentStart: js.UndefOr[
    js.Function2[/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node, scala.Unit]
  ] = js.undefined
  var onCodePathStart: js.UndefOr[
    js.Function2[/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node, scala.Unit]
  ] = js.undefined
}

object RuleListener {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        (js.Function2[/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node, scala.Unit]) | (js.Function2[/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node, scala.Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ estreeLib.estreeMod.Node, 
          scala.Unit
        ]) | (js.Function1[/* node */ estreeLib.estreeMod.Node, scala.Unit])
      ]
    ] = null,
    onCodePathEnd: js.Function2[/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node, scala.Unit] = null,
    onCodePathSegmentEnd: js.Function2[/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node, scala.Unit] = null,
    onCodePathSegmentLoop: js.Function3[
      /* fromSegment */ CodePathSegment, 
      /* toSegment */ CodePathSegment, 
      /* node */ estreeLib.estreeMod.Node, 
      scala.Unit
    ] = null,
    onCodePathSegmentStart: js.Function2[/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node, scala.Unit] = null,
    onCodePathStart: js.Function2[/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node, scala.Unit] = null
  ): RuleListener = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onCodePathEnd != null) __obj.updateDynamic("onCodePathEnd")(onCodePathEnd)
    if (onCodePathSegmentEnd != null) __obj.updateDynamic("onCodePathSegmentEnd")(onCodePathSegmentEnd)
    if (onCodePathSegmentLoop != null) __obj.updateDynamic("onCodePathSegmentLoop")(onCodePathSegmentLoop)
    if (onCodePathSegmentStart != null) __obj.updateDynamic("onCodePathSegmentStart")(onCodePathSegmentStart)
    if (onCodePathStart != null) __obj.updateDynamic("onCodePathStart")(onCodePathStart)
    __obj.asInstanceOf[RuleListener]
  }
}

