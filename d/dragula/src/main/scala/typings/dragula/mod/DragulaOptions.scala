package typings.dragula.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragulaOptions extends js.Object {
  var accepts: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[Element], 
      /* target */ js.UndefOr[Element], 
      /* source */ js.UndefOr[Element], 
      /* sibling */ js.UndefOr[Element], 
      Boolean
    ]
  ] = js.native
  var containers: js.UndefOr[js.Array[Element]] = js.native
  var copy: js.UndefOr[(js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean] = js.native
  var copySortSource: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Boolean | Double] = js.native
  var direction: js.UndefOr[String] = js.native
  var ignoreInputTextSelection: js.UndefOr[Boolean] = js.native
  var invalid: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], Boolean]
  ] = js.native
  var isContainer: js.UndefOr[js.Function1[/* el */ js.UndefOr[Element], Boolean]] = js.native
  var mirrorContainer: js.UndefOr[Element] = js.native
  var moves: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[Element], 
      /* container */ js.UndefOr[Element], 
      /* handle */ js.UndefOr[Element], 
      /* sibling */ js.UndefOr[Element], 
      Boolean
    ]
  ] = js.native
  var removeOnSpill: js.UndefOr[Boolean] = js.native
  var revertOnSpill: js.UndefOr[Boolean] = js.native
}

object DragulaOptions {
  @scala.inline
  def apply(): DragulaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragulaOptions]
  }
  @scala.inline
  implicit class DragulaOptionsOps[Self <: DragulaOptions] (val x: Self) extends AnyVal {
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
    def setAccepts(
      value: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], /* source */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean
    ): Self = this.set("accepts", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setContainersVarargs(value: Element*): Self = this.set("containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: js.Array[Element]): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    @scala.inline
    def setCopyFunction2(value: (/* el */ Element, /* source */ Element) => Boolean): Self = this.set("copy", js.Any.fromFunction2(value))
    @scala.inline
    def setCopy(value: (js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setCopySortSource(value: Boolean): Self = this.set("copySortSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySortSource: Self = this.set("copySortSource", js.undefined)
    @scala.inline
    def setDelay(value: Boolean | Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setIgnoreInputTextSelection(value: Boolean): Self = this.set("ignoreInputTextSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreInputTextSelection: Self = this.set("ignoreInputTextSelection", js.undefined)
    @scala.inline
    def setInvalid(value: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element]) => Boolean): Self = this.set("invalid", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setIsContainer(value: /* el */ js.UndefOr[Element] => Boolean): Self = this.set("isContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsContainer: Self = this.set("isContainer", js.undefined)
    @scala.inline
    def setMirrorContainer(value: Element): Self = this.set("mirrorContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirrorContainer: Self = this.set("mirrorContainer", js.undefined)
    @scala.inline
    def setMoves(
      value: (/* el */ js.UndefOr[Element], /* container */ js.UndefOr[Element], /* handle */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean
    ): Self = this.set("moves", js.Any.fromFunction4(value))
    @scala.inline
    def deleteMoves: Self = this.set("moves", js.undefined)
    @scala.inline
    def setRemoveOnSpill(value: Boolean): Self = this.set("removeOnSpill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnSpill: Self = this.set("removeOnSpill", js.undefined)
    @scala.inline
    def setRevertOnSpill(value: Boolean): Self = this.set("revertOnSpill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevertOnSpill: Self = this.set("revertOnSpill", js.undefined)
  }
  
}

