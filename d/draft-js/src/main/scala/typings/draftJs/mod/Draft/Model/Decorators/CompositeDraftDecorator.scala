package typings.draftJs.mod.Draft.Model.Decorators

import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typings.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CompositeDraftDecorator traverses through a list of DraftDecorator
  * instances to identify sections of a ContentBlock that should be rendered
  * in a "decorated" manner. For example, hashtags, mentions, and links may
  * be intended to stand out visually, be rendered as anchors, etc.
  *
  * The list of decorators supplied to the constructor will be used in the
  * order they are provided. This allows the caller to specify a priority for
  * string matching, in case of match collisions among decorators.
  *
  * For instance, I may have a link with a `#` in its text. Though this section
  * of text may match our hashtag decorator, it should not be treated as a
  * hashtag. I should therefore list my link DraftDecorator
  * before my hashtag DraftDecorator when constructing this composite
  * decorator instance.
  *
  * Thus, when a collision like this is encountered, the earlier match is
  * preserved and the new match is discarded.
  */
trait CompositeDraftDecorator extends js.Object {
  def getComponentForKey(key: String): js.Function
  def getDecorations(block: ContentBlock, contentState: ContentState): List[String]
  def getPropsForKey(key: String): js.Object
}

object CompositeDraftDecorator {
  @scala.inline
  def apply(
    getComponentForKey: String => js.Function,
    getDecorations: (ContentBlock, ContentState) => List[String],
    getPropsForKey: String => js.Object
  ): CompositeDraftDecorator = {
    val __obj = js.Dynamic.literal(getComponentForKey = js.Any.fromFunction1(getComponentForKey), getDecorations = js.Any.fromFunction2(getDecorations), getPropsForKey = js.Any.fromFunction1(getPropsForKey))
    __obj.asInstanceOf[CompositeDraftDecorator]
  }
}

