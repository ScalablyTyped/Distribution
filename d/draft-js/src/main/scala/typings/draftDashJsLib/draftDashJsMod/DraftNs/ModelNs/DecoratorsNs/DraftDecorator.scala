package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs

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
    block: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock,
    callback: js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit],
    contentState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState
  ): scala.Unit
}

object DraftDecorator {
  @scala.inline
  def apply(
    component: js.Function,
    strategy: js.Function3[
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock, 
      js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit], 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState, 
      scala.Unit
    ],
    props: js.Object = null
  ): DraftDecorator = {
    val __obj = js.Dynamic.literal(component = component, strategy = strategy)
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[DraftDecorator]
  }
}

