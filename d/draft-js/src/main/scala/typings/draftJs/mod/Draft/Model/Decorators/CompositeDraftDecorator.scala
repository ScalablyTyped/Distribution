package typings.draftJs.mod.Draft.Model.Decorators

import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typings.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait CompositeDraftDecorator extends js.Object {
  
  def getComponentForKey(key: String): js.Function = js.native
  
  def getDecorations(block: ContentBlock, contentState: ContentState): List[String] = js.native
  
  def getPropsForKey(key: String): js.Object = js.native
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
  
  @scala.inline
  implicit class CompositeDraftDecoratorOps[Self <: CompositeDraftDecorator] (val x: Self) extends AnyVal {
    
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
    def setGetComponentForKey(value: String => js.Function): Self = this.set("getComponentForKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDecorations(value: (ContentBlock, ContentState) => List[String]): Self = this.set("getDecorations", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPropsForKey(value: String => js.Object): Self = this.set("getPropsForKey", js.Any.fromFunction1(value))
  }
}
