package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleListener
  extends NodeListener
     with /* key */ StringDictionary[
      js.UndefOr[
        (js.Function2[(/* codePath */ CodePath) | (/* segment */ CodePathSegment), /* node */ Node, Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ Node, 
          Unit
        ]) | (js.Function1[/* node */ Node, Unit])
      ]
    ] {
  var onCodePathEnd: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.native
  var onCodePathSegmentEnd: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.native
  var onCodePathSegmentLoop: js.UndefOr[
    js.Function3[
      /* fromSegment */ CodePathSegment, 
      /* toSegment */ CodePathSegment, 
      /* node */ Node, 
      Unit
    ]
  ] = js.native
  var onCodePathSegmentStart: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.native
  var onCodePathStart: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.native
}

object RuleListener {
  @scala.inline
  def apply(): RuleListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleListener]
  }
  @scala.inline
  implicit class RuleListenerOps[Self <: RuleListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnCodePathEnd(value: (/* codePath */ CodePath, /* node */ Node) => Unit): Self = this.set("onCodePathEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCodePathEnd: Self = this.set("onCodePathEnd", js.undefined)
    @scala.inline
    def setOnCodePathSegmentEnd(value: (/* segment */ CodePathSegment, /* node */ Node) => Unit): Self = this.set("onCodePathSegmentEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCodePathSegmentEnd: Self = this.set("onCodePathSegmentEnd", js.undefined)
    @scala.inline
    def setOnCodePathSegmentLoop(
      value: (/* fromSegment */ CodePathSegment, /* toSegment */ CodePathSegment, /* node */ Node) => Unit
    ): Self = this.set("onCodePathSegmentLoop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCodePathSegmentLoop: Self = this.set("onCodePathSegmentLoop", js.undefined)
    @scala.inline
    def setOnCodePathSegmentStart(value: (/* segment */ CodePathSegment, /* node */ Node) => Unit): Self = this.set("onCodePathSegmentStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCodePathSegmentStart: Self = this.set("onCodePathSegmentStart", js.undefined)
    @scala.inline
    def setOnCodePathStart(value: (/* codePath */ CodePath, /* node */ Node) => Unit): Self = this.set("onCodePathStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCodePathStart: Self = this.set("onCodePathStart", js.undefined)
  }
  
}

