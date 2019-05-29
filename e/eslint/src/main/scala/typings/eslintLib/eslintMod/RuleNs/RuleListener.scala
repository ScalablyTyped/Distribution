package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void} */ trait RuleListener
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        (js.Function2[
          (/* codePath */ CodePath) | (/* segment */ CodePathSegment), 
          /* node */ estreeLib.estreeMod.Node, 
          scala.Unit
        ]) | (js.Function3[
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
        (js.Function2[
          (/* codePath */ CodePath) | (/* segment */ CodePathSegment), 
          /* node */ estreeLib.estreeMod.Node, 
          scala.Unit
        ]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ estreeLib.estreeMod.Node, 
          scala.Unit
        ]) | (js.Function1[/* node */ estreeLib.estreeMod.Node, scala.Unit])
      ]
    ] = null,
    onCodePathEnd: (/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node) => scala.Unit = null,
    onCodePathSegmentEnd: (/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node) => scala.Unit = null,
    onCodePathSegmentLoop: (/* fromSegment */ CodePathSegment, /* toSegment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node) => scala.Unit = null,
    onCodePathSegmentStart: (/* segment */ CodePathSegment, /* node */ estreeLib.estreeMod.Node) => scala.Unit = null,
    onCodePathStart: (/* codePath */ CodePath, /* node */ estreeLib.estreeMod.Node) => scala.Unit = null
  ): RuleListener = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onCodePathEnd != null) __obj.updateDynamic("onCodePathEnd")(js.Any.fromFunction2(onCodePathEnd))
    if (onCodePathSegmentEnd != null) __obj.updateDynamic("onCodePathSegmentEnd")(js.Any.fromFunction2(onCodePathSegmentEnd))
    if (onCodePathSegmentLoop != null) __obj.updateDynamic("onCodePathSegmentLoop")(js.Any.fromFunction3(onCodePathSegmentLoop))
    if (onCodePathSegmentStart != null) __obj.updateDynamic("onCodePathSegmentStart")(js.Any.fromFunction2(onCodePathSegmentStart))
    if (onCodePathStart != null) __obj.updateDynamic("onCodePathStart")(js.Any.fromFunction2(onCodePathStart))
    __obj.asInstanceOf[RuleListener]
  }
}

