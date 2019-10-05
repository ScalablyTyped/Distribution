package typings.draftDashJs.draftDashJsMod.Draft.Model.Decorators

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
trait DraftDecorator extends js.Object {
  var component: js.Function
  var props: js.UndefOr[js.Object] = js.undefined
  def strategy(
    block: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock,
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit],
    contentState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState
  ): Unit
}

object DraftDecorator {
  @scala.inline
  def apply(
    component: js.Function,
    strategy: (typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState) => Unit,
    props: js.Object = null
  ): DraftDecorator = {
    val __obj = js.Dynamic.literal(component = component, strategy = js.Any.fromFunction3(strategy))
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[DraftDecorator]
  }
}

