package typings.draftJs.mod.Draft.Model.Decorators

import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DraftDecorator is a strategy-component pair intended for use when
  * rendering content.
  *
  *   - A "strategy": A function that accepts a ContentBlock object and
  *     continuously executes a callback with start/end values corresponding to
  *     relevant matches in the document text. For example, getHashtagMatches
  *     uses a hashtag regex to find hashtag strings in the block, and
  *     for each hashtag match, executes the callback with start/end pairs.
  *
  *   - A "component": A React component that will be used to render the
  *     "decorated" section of text.
  *
  *   - "props": Props to be passed into the React component that will be used.
  */
@js.native
trait DraftDecorator extends js.Object {
  var component: js.Function = js.native
  var props: js.UndefOr[js.Object] = js.native
  def strategy(
    block: ContentBlock,
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit],
    contentState: ContentState
  ): Unit = js.native
}

object DraftDecorator {
  @scala.inline
  def apply(
    component: js.Function,
    strategy: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Unit
  ): DraftDecorator = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], strategy = js.Any.fromFunction3(strategy))
    __obj.asInstanceOf[DraftDecorator]
  }
  @scala.inline
  implicit class DraftDecoratorOps[Self <: DraftDecorator] (val x: Self) extends AnyVal {
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
    def setComponent(value: js.Function): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategy(
      value: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Unit
    ): Self = this.set("strategy", js.Any.fromFunction3(value))
    @scala.inline
    def setProps(value: js.Object): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
  
}

