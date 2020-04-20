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
trait DraftDecoratorType extends js.Object {
  /**
    * Given a decorator key, return the component to use when rendering
    * this decorated range.
    */
  def getComponentForKey(key: String): js.Function
  /**
    * Given a `ContentBlock`, return an immutable List of decorator keys.
    */
  def getDecorations(block: ContentBlock, contentState: ContentState): List[String]
  /**
    * Given a decorator key, optionally return the props to use when rendering
    * this decorated range.
    */
  def getPropsForKey(key: String): js.Any
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
}

