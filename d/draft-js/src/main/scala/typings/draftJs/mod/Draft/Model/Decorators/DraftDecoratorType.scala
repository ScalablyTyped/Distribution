package typings.draftJs.mod.Draft.Model.Decorators

import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typings.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for document decorator classes, allowing the creation of
  * custom decorator classes.
  *
  * See `CompositeDraftDecorator` for the most common use case.
  */
@js.native
trait DraftDecoratorType extends js.Object {
  /**
    * Given a decorator key, return the component to use when rendering
    * this decorated range.
    */
  def getComponentForKey(key: String): js.Function = js.native
  /**
    * Given a `ContentBlock`, return an immutable List of decorator keys.
    */
  def getDecorations(block: ContentBlock, contentState: ContentState): List[String] = js.native
  /**
    * Given a decorator key, optionally return the props to use when rendering
    * this decorated range.
    */
  def getPropsForKey(key: String): js.Any = js.native
}

object DraftDecoratorType {
  @scala.inline
  def apply(
    getComponentForKey: String => js.Function,
    getDecorations: (ContentBlock, ContentState) => List[String],
    getPropsForKey: String => js.Any
  ): DraftDecoratorType = {
    val __obj = js.Dynamic.literal(getComponentForKey = js.Any.fromFunction1(getComponentForKey), getDecorations = js.Any.fromFunction2(getDecorations), getPropsForKey = js.Any.fromFunction1(getPropsForKey))
    __obj.asInstanceOf[DraftDecoratorType]
  }
  @scala.inline
  implicit class DraftDecoratorTypeOps[Self <: DraftDecoratorType] (val x: Self) extends AnyVal {
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
    def setGetPropsForKey(value: String => js.Any): Self = this.set("getPropsForKey", js.Any.fromFunction1(value))
  }
  
}

