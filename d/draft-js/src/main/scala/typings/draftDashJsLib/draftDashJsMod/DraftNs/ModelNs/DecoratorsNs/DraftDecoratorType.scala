package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs

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
  def getComponentForKey(key: java.lang.String): js.Function
  /**
                   * Given a `ContentBlock`, return an immutable List of decorator keys.
                   */
  def getDecorations(
    block: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock,
    contentState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState
  ): immutableLib.immutableMod.List[java.lang.String]
  /**
                   * Given a decorator key, optionally return the props to use when rendering
                   * this decorated range.
                   */
  def getPropsForKey(key: java.lang.String): js.Any
}

